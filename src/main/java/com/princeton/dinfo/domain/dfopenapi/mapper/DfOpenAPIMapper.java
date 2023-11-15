package com.princeton.dinfo.domain.dfopenapi.mapper;

import com.princeton.dinfo.domain.dfopenapi.dto.request.RequestDfOpenApiServerInfoDto;
import com.princeton.dinfo.domain.dfopenapi.dto.response.ResponseServerInfoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DfOpenAPIMapper {

    DfOpenAPIMapper INSTANCE = Mappers.getMapper(DfOpenAPIMapper.class);

    @Mapping(source = "rows", target = "server")
    ResponseServerInfoDto RequestDfOpenApiServerInfoDtoToResponseServerInfoDto(RequestDfOpenApiServerInfoDto requestDfOpenApiServerInfoDto);

}
