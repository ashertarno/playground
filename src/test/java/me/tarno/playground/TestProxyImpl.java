package me.tarno.playground;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

public class TestProxyImpl extends BaseServiceProxyImpl implements TestProxy {
    @Override
    public void ping(Handler<AsyncResult<String>> resultHandler) {
        new BaseServiceProxyImpl().ping(resultHandler);
    }
}
