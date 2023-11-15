package com.princeton.dinfo.domain.dfopenapi.dto.response;

import com.princeton.dinfo.domain.dfopenapi.dto.valuedto.ServerDto;
import lombok.*;

import java.util.List;

import static lombok.AccessLevel.*;

@Getter
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
public class ResponseServerInfoDto {

    List<ServerDto> server;

}
