package com.princeton.dinfo.domain.dfopenapi.dto.request;

import com.princeton.dinfo.domain.dfopenapi.dto.valuedto.ServerDto;
import lombok.*;

import java.util.List;

import static lombok.AccessLevel.*;

@Getter
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
public class RequestDfOpenApiServerInfoDto {

    private List<ServerDto> rows;

}
