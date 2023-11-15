package com.princeton.dinfo.global.openapi;

import com.princeton.dinfo.domain.dfopenapi.dto.request.RequestDfOpenApiServerInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "${feign.dfOpenAPI.name}", url = "${feign.dfOpenAPI.url}", configuration = DfOpenAPIFeignConfig.class)
public interface DfOpenAPIClient {

    @GetMapping(value = "/servers")
    RequestDfOpenApiServerInfoDto getServerInfo(@RequestParam("apikey") String apiKey);

}
