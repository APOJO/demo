//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.constant;

public class RestConstant {
    public static final String HTTPGET = "GET";
    public static final String HTTPPUT = "PUT";
    public static final String HTTPPOST = "POST";
    public static final String HTTPDELETE = "DELETE";
    public static final String HTTPACCEPT = "Accept";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CHARSET_UTF8 = "UTF-8";
    public static final String BASE_URL = "https://";
    public static final String HEADER_APP_KEY = "app_key";
    public static final String HEADER_APP_AUTH = "Authorization";
    public static final String APP_AUTH = "/iocm/app/sec/v1.1.0/login";
    public static final String REFRESH_TOKEN = "/iocm/app/sec/v1.1.0/refreshToken";
    public static final String AUTH_LOGOUT = "/iocm/app/sec/v1.1.0/logout";
    public static final String REGISTER_DEVICE_VERIFYCODE_MODE = "/iocm/app/reg/v1.1.0/deviceCredentials";
    public static final String REGISTER_DEVICE_SECRET_MODE = "/iocm/app/reg/v2.0.0/deviceCredentials";
    public static final String REFRESH_DEVICE_KEY_VERIFICATION_MODE = "/iocm/app/reg/v1.1.0/deviceCredentials/";
    public static final String REFRESH_DEVICE_KEY_SECRET_MODE = "/iocm/app/reg/v2.0.0/deviceCredentials/";
    public static final String MODIFY_DEVICE_INFO = "/iocm/app/dm/v1.4.0/devices/";
    public static final String DELETE_DEVICE = "/iocm/app/dm/v1.4.0/devices/";
    public static final String QUERY_DEVICE_ACTIVATION_STATUS = "/iocm/app/reg/v1.1.0/deviceCredentials/";
    public static final String QUERY_DEVICE_REALTIME_LOCATION = "/iocm/app/location/v1.1.0/queryDeviceRealtimeLocation";
    public static final String QUERY_DEVICE_SHADOW = "/iocm/app/shadow/v1.5.0/devices/";
    public static final String MODIFY_DEVICE_SHADOW = "/iocm/app/shadow/v1.5.0/devices/";
    /** @deprecated */
    @Deprecated
    public static final String REGISTER_DEVICE = "/iocm/app/reg/v1.1.0/devices";
    /** @deprecated */
    @Deprecated
    public static final String REFRESH_VERIFYCODE = "/iocm/app/reg/v1.1.0/devices";
    /** @deprecated */
    @Deprecated
    public static final String SET_ENCRYPT = "/iocm/app/dm/v1.1.0/devices/%s/services/%s";
    public static final String DEVICE_SERVICE_INVOCATION = "/iocm/app/signaltrans/v1.1.0/devices/%s/services/%s/sendCommand";
    public static final String QUERY_DEVICE_DATA = "/iocm/app/dm/v1.4.0/devices/";
    public static final String QUERY_DEVICES = "/iocm/app/dm/v1.4.0/devices";
    public static final String QUERY_DEVICE_DATA_HISTORY = "/iocm/app/data/v1.2.0/deviceDataHistory";
    public static final String QUERY_DEVICE_SHADOW_DATA_HISTORY = "/iocm/app/shadow/v1.5.0/deviceDesiredHistory";
    public static final String QUERY_DEVICE_CAPABILITIES = "/iocm/app/data/v1.1.0/deviceCapabilities";
    /** @deprecated */
    @Deprecated
    public static final String SUBSCRIBE_NOTIFYCATION = "/iocm/app/sub/v1.1.0/subscribe";
    /** @deprecated */
    @Deprecated
    public static final String QUERY_DEVICE_HISTORY_DATA = "/iocm/app/data/v1.1.0/deviceDataHistory";
    public static final String POST_ASYN_CMD = "/iocm/app/cmd/v1.4.0/deviceCommands";
    public static final String QUERY_DEVICE_CMD = "/iocm/app/cmd/v1.4.0/deviceCommands";
    public static final String UPDATE_ASYN_COMMAND = "/iocm/app/cmd/v1.4.0/deviceCommands/";
    public static final String CREATE_DEVICECMD_CANCEL_TASK = "/iocm/app/cmd/v1.4.0/deviceCommandCancelTasks";
    public static final String QUERY_DEVICECMD_CANCEL_TASK = "/iocm/app/cmd/v1.4.0/deviceCommandCancelTasks";
    public static final String CREATE_BATCH_TASK = "/iocm/app/batchtask/v1.1.0/tasks";
    public static final String QUERY_ONE_TASK = "/iocm/app/batchtask/v1.1.0/tasks/";
    public static final String QUERY_BATCHTASK_DETAILS = "/iocm/app/batchtask/v1.1.0/taskDetails";
    public static final String CREATE_RULE = "/iocm/app/rule/v1.2.0/rules";
    public static final String UPDATE_RULE = "/iocm/app/rule/v1.2.0/rules";
    public static final String DELETE_RULE = "/iocm/app/rule/v1.2.0/rules/";
    public static final String QUERY_RULES = "/iocm/app/rule/v1.2.0/rules";
    public static final String CHANGE_RULE_STATUS = "/iocm/app/rule/v1.2.0/rules/%s/status/%s";
    public static final String BATCH_CHANGE_RULE_STATUS = "/iocm/app/rule/v1.2.0/rules/status";
    public static final String SUBSCRIPTION_TO_DEVICE_DATA = "/iocm/app/sub/v1.2.0/subscriptions";
    public static final String SUBSCRIPTION_TO_MANAGEMENT_DATA = "/iodm/app/sub/v1.1.0/subscribe";
    public static final String QUERY_SINGLE_SUBSCRIPTION = "/iocm/app/sub/v1.2.0/subscriptions/";
    public static final String QUERY_BATCH_SUBSCRIPTIONS = "/iocm/app/sub/v1.2.0/subscriptions";
    public static final String DELETE_SINGLE_SUBSCRIPTION = "/iocm/app/sub/v1.2.0/subscriptions/";
    public static final String DELETE_BATCH_SUBSCRIPTIONS = "/iocm/app/sub/v1.2.0/subscriptions";
    public static final String CREATE_DEVICE_GROUP = "/iocm/app/devgroup/v1.3.0/devGroups";
    public static final String DELETE_DEVICE_GROUP = "/iocm/app/devgroup/v1.3.0/devGroups/";
    public static final String MODIFY_DEVICE_GROUP = "/iocm/app/devgroup/v1.3.0/devGroups/";
    public static final String QUERY_DEVICE_GROUP = "/iocm/app/devgroup/v1.3.0/devGroups";
    public static final String QUERY_SPECIFY_DEVICE_GROUP = "/iocm/app/devgroup/v1.3.0/devGroups/";
    public static final String QUERY_DEVICE_GROUP_MEMBERS = "/iocm/app/dm/v1.2.0/devices/ids";
    public static final String ADD_DEVICE_TO_GROUP = "/iocm/app/dm/v1.1.0/devices/addDevGroupTagToDevices";
    public static final String DELETE_DEVICE_FROM_GROUP = "/iocm/app/dm/v1.1.0/devices/deleteDevGroupTagFromDevices";
    public static final String QUERY_PACKAGE_LIST = "/iodm/northbound/v1.5.0/category";
    public static final String QUERY_SPECIFY_PACKAGE = "/iodm/northbound/v1.5.0/category/";
    public static final String DELETE_SPECIFY_PACKAGE = "/iodm/northbound/v1.5.0/category/";
    public static final String CREATE_SOFTWARE_UPGRADE_TASK = "/iodm/northbound/v1.5.0/operations/softwareUpgrade";
    public static final String CREATE_FIRMWARE_UPGRADE_TASK = "/iodm/northbound/v1.5.0/operations/firmwareUpgrade";
    public static final String QUERY_UPGRADE_TASK_RESULT = "/iodm/northbound/v1.5.0/operations/";
    public static final String QUERY_UPGRADE_SUB_TASK_DETAIL = "/iodm/northbound/v1.5.0/operations/%s/subOperations";
    public static final String QUERY_UPGRADE_TASK_LIST = "/iodm/northbound/v1.5.0/operations";

    public RestConstant() {
    }
}
