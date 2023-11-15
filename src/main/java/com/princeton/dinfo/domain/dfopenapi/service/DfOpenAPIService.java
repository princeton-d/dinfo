package com.princeton.dinfo.domain.dfopenapi.service;

import com.princeton.dinfo.domain.dfopenapi.dto.request.RequestDfOpenApiServerInfoDto;
import com.princeton.dinfo.domain.dfopenapi.dto.response.ResponseServerInfoDto;
import com.princeton.dinfo.domain.dfopenapi.mapper.DfOpenAPIMapper;
import com.princeton.dinfo.global.openapi.DfOpenAPIClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DfOpenAPIService {

    private final String apiKey;
    private final DfOpenAPIClient dfOpenAPIClient;

    public DfOpenAPIService(
            @Value("${dfOpenAPI.key}") String apiKey,
            DfOpenAPIClient dfOpenAPIClient
    ) {
        this.apiKey = apiKey;
        this.dfOpenAPIClient = dfOpenAPIClient;
    }

    public ResponseServerInfoDto getServerInfo() {
        DfOpenAPIMapper instance = DfOpenAPIMapper.INSTANCE;
        RequestDfOpenApiServerInfoDto serverInfo = dfOpenAPIClient.getServerInfo(apiKey);

        return instance.RequestDfOpenApiServerInfoDtoToResponseServerInfoDto(serverInfo);
    }

}
