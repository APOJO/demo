//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.client;

public class DefaultNorthApiClient {
    private static NorthApiClient defaultNorthApiClient = new NorthApiClient();

    public DefaultNorthApiClient() {
    }

    public static NorthApiClient getDefaultApiClient() {
        return defaultNorthApiClient;
    }

    public static void setDefaultApiClient(NorthApiClient northApiClient) {
        defaultNorthApiClient = northApiClient;
    }
}
