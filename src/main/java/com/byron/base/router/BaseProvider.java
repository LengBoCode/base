package com.byron.base.router;

import java.util.HashMap;

/**
 * 每个需要被调起的组件内都有一个provider
 * 一个provider组件内包含多个通信的具体动作action
 */
public abstract class BaseProvider {
    protected HashMap<String, BaseAction> actions = new HashMap<>();

    public BaseProvider(){
        registerAction();
    }

    protected abstract void registerAction();


    public void invokeAction(String action,Response response, Object... params) {
        actions.get(action).execute(response, params);
    }
}
