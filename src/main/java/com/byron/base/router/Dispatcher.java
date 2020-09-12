package com.byron.base.router;

import java.util.HashMap;

/**
 * 每个需要通信的组件内都有一个receiver
 * 组件内通信的具体动作都有一个action
 * Dispatcher负责统一管理receiver和action
 */
public class Dispatcher {

    private static HashMap<String, BaseReceiver> receivers = new HashMap<>();

    public static void registerReceiver(String receiverName, BaseReceiver receiver) {
        receivers.put(receiverName, receiver);
    }

    public static void request(String receiver, String action, Response response, Object... params) {
        receivers.get(receiver).invokeAction(action,response, params);
    }

}
