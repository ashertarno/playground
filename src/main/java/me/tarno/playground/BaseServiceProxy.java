package me.tarno.playground;

import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@ProxyGen
@VertxGen
public interface BaseServiceProxy {
     void ping(Handler<AsyncResult<String>> resultHandler);
}
