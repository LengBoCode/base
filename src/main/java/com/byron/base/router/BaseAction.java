package com.byron.base.router;

/**
 * 负责执行具体的动作
 * 比如打开页面，调用方法
 */
public abstract class BaseAction {
    public abstract void execute(Response response, Object... params);
}
