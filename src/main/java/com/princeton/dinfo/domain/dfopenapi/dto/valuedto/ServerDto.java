package com.princeton.dinfo.domain.dfopenapi.dto.valuedto;

import lombok.*;

import static lombok.AccessLevel.*;

@Getter
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
public class ServerDto {

    private String serverId;
    private String serverName;

}
