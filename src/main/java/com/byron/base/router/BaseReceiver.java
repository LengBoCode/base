package com.byron.base.router;

import java.util.HashMap;

/**
 * 每个需要被调用的组件内都有一个receiver
 * 一个receiver组件内包含多个通信的具体动作action
 */
public abstract class BaseReceiver {
    protected HashMap<String, BaseAction> actions = new HashMap<>();

    public BaseReceiver(){
        registerAction();
    }

    protected abstract void registerAction();
    
    public void invokeAction(String action,Response response, Object... params) {
        actions.get(action).execute(response, params);
    }
}
