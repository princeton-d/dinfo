package com.princeton.dinfo.global.exception;

import lombok.Getter;

@Getter
public enum CustomExceptionInfo {

    DINFO000(404, "MESSAGE_NOT_FOUNT_FOR_CODE", "찾을 수 없는 오류번호입니다."),
    DNF980(503, "SYSTEM_INSPECT", "시스템 점검으로 해당 작업을 수행할 수 없습니다.");

    private Integer code;
    private String errorMessage;
    private String detail;

    CustomExceptionInfo(Integer code, String errorMessage, String detail) {
        this.code = code;
        this.errorMessage = errorMessage;
        this.detail = detail;
    }
}
