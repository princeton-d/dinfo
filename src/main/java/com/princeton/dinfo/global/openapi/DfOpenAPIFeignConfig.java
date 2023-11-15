package com.princeton.dinfo.global.openapi;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class DfOpenAPIFeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
