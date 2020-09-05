package com.byron.base.router;

import java.util.HashMap;

import android.content.res.Resources;

/**
 * 每个需要通信的组件内都有一个provider
 * 组件内通信的具体动作都有一个action
 * RouterUtils负责统一管理provide和action
 */
public class RouterUtils {

    private static HashMap<String, BaseProvider> providers = new HashMap<>();

    public static void registerRouter(String providerName, BaseProvider provider) {
        providers.put(providerName, provider);
    }

    public static void request(String provider, String action, Response response, Object... params) {
        providers.get(provider).invokeAction(action,response, params);
    }

}
