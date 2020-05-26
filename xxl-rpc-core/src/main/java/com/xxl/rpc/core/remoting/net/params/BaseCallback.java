package com.xxl.rpc.core.remoting.net.params;

/**
 * @author xuxueli 2018-10-19
 */
@FunctionalInterface
public interface BaseCallback {

    public abstract void run() throws Exception;

}
