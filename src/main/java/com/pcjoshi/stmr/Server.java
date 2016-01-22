package com.pcjoshi.stmr;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

/**
 * Created by pcjoshi on 1/22/16. Email: pcjoshi@deerwalk.com
 */
public class Server extends AbstractVerticle {

    Logger log = LoggerFactory.getLogger("io.vertx.core.logging.Logger logger");

    @Override
    public void start() {

        log.info("... well come to stream server ...");

    }
}
