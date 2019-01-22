package com.iotplatform.model;

import java.util.ArrayList;

/**
 * Created by IntelliJ Idea 2018.1
 * Company:SBKJ
 *
 * @author Arlen
 * @email wanglei940117@gmail.com
 * @date 2019-01-22
 * @time 13:44
 */
public class testDEV {
    private String userName;
    private String devID;
    private String[] phoneList;
    private String addr;

    public testDEV() {
    }

    public testDEV(String userName, String devID, String[] phoneList, String addr) {
        this.userName = userName;
        this.devID = devID;
        this.phoneList = phoneList;
        this.addr = addr;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDevID() {
        return devID;
    }

    public void setDevID(String devID) {
        this.devID = devID;
    }

    public String[] getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(String[] phoneList) {
        this.phoneList = phoneList;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
