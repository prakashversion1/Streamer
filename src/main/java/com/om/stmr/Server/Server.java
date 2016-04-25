package com.om.stmr.Server;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;

/**
 * Created by pcjoshi on 1/22/16. Email: pcjoshi@deerwalk.com
 */
public class Server extends AbstractVerticle {

    Logger log = LoggerFactory.getLogger("io.vertx.core.logging.Logger logger");

    @Override
    public void start() {
        Router router = Router.router(vertx);

        router.get("/").handler(ctx ->{
            ctx.response().end("Hello World");
        });

        router.route().handler(StaticHandler.create());

        vertx.createHttpServer().requestHandler(router::accept).listen(8080,"localhost");
        log.info("... well come to stream server ...");
    }
}
