package me.tarno.playground;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

public class BaseServiceProxyImpl implements BaseServiceProxy {
    @Override
    public void ping(Handler<AsyncResult<String>> resultHandler) {
        resultHandler.handle(io.vertx.core.Future.succeededFuture("pong"));
    }
}
