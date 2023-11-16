package com.princeton.dinfo.global.dto;

import lombok.*;

import static lombok.AccessLevel.*;

@Getter
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
public class ResponseStatusDto {

    private Integer code;
    private String message;
    private String detail;

}
