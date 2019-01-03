package com.telecommunication.service.impl;

import com.telecommunication.service.CacheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liumingfang
 */
@Service
public class MemoryCacheService implements CacheService {
	
	private static final Logger logger = LoggerFactory.getLogger(MemoryCacheService.class);
	
	private Map<String, CacheItem> cacheMap = new HashMap<>();

	@Override
	public String getString(String key) {
		
		if (cacheMap.containsKey(key)) {
			CacheItem ci = cacheMap.get(key);
			if (ci.getExpires() > System.currentTimeMillis()) {
				logger.info("cache hit: " + key);
				return (String)ci.getValue();
			} else {
				cacheMap.remove(key);
				ci.clear();
			}
		}
		
		return null;
	}

	@Override
	public String getType() {
		return "memory";
	}

	@Override
	public void clear() {
		for (String key : cacheMap.keySet()) {
			CacheItem ci = cacheMap.get(key);
			ci.clear();
		}
	}
	
	@Override
	public void putString(String key, String value) {
		
		putString(key, value, 60);
	}
	
	@Override
	public void putString(String key, String value, int seconds) {
		
		if (value != null) {
			cacheMap.put(key, new CacheItem(value, System.currentTimeMillis() + seconds * 1000));
		}
	}
	
	@Override
	public <T> T getObject(String key, Class<T> clazz)  throws IOException {
		
		if (cacheMap.containsKey(key)) {
			CacheItem ci = cacheMap.get(key);
			if (ci.getExpires() > System.currentTimeMillis()) {
				logger.info("cache hit: " + key);
				return (T)ci.getValue();
			} else {
				cacheMap.remove(key);
				ci.clear();
			}
		}
		
		return null;
	}

	@Override
	public <T> List<T> getList(String key, Class<T> clazz)  throws IOException {
		
		if (cacheMap.containsKey(key)) {
			CacheItem ci = cacheMap.get(key);
			if (ci.getExpires() > System.currentTimeMillis()) {
				logger.info("cache hit: " + key);
				return (List<T>)ci.getValue();
			} else {
				cacheMap.remove(key);
				ci.clear();
			}
		}
		
		return null;
		
	}


	@Override
	public void putObject(String key, Object value)  throws IOException {
		
		putObject(key, value, 60);
	}

	@Override
	public void putObject(String key, Object value, int seconds) throws IOException {
		
		if (value != null) {
			cacheMap.put(key, new CacheItem(value, System.currentTimeMillis() + seconds * 1000));
		}
		
	}
	
	private class CacheItem {

		private Object value;
		private long expires;
		
		public CacheItem(Object value, long expires) {
			this.value = value;
			this.expires = expires;
		}
		
		public Object getValue() {
			return value;
		}
		
		public long getExpires() {
			return expires;
		}
		
		public void clear() {
			this.value = null;
		}
	}
}
