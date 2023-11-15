package com.princeton.dinfo.global.dto;

import lombok.Getter;

@Getter
public class ResponseDataDto<T> {

    private T data;

    public ResponseDataDto(T data) {
        this.data = data;
    }

}
