package com.princeton.dinfo.global.exception;

import com.princeton.dinfo.global.dto.ResponseStatusDto;
import feign.FeignException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.princeton.dinfo.global.exception.CustomExceptionInfo.*;

@RestControllerAdvice
public class CustomExceptionHandler {

    private final String CODE_PREFIX = "\"code\":\"";
    private final String DELIMITER = "\"";

    @ExceptionHandler(FeignException.ServiceUnavailable.class)
    public ResponseEntity<ResponseStatusDto> serverInspectExceptionHandler(FeignException.ServiceUnavailable e) {

        String errorCode = getErrorCode(e);
        CustomExceptionInfo matchExceptionInfo = getMatchExceptionInfo(errorCode);
        ResponseStatusDto responseStatusDto = generateExceptionCode(matchExceptionInfo);

        return ResponseEntity.status(matchExceptionInfo.getCode()).body(responseStatusDto);
    }

    private String getErrorCode(FeignException.ServiceUnavailable e) {
        String errorMessage = e.getMessage();
        int startIndex = errorMessage.indexOf(CODE_PREFIX) + CODE_PREFIX.length();
        int endIndex = errorMessage.indexOf(DELIMITER, startIndex);

        return errorMessage.substring(startIndex, endIndex);
    }

    private ResponseStatusDto generateExceptionCode(CustomExceptionInfo matchExceptionInfo) {
        return ResponseStatusDto.builder()
                .code(matchExceptionInfo.getCode())
                .message(matchExceptionInfo.getErrorMessage())
                .detail(matchExceptionInfo.getDetail())
                .build();
    }

    private CustomExceptionInfo getMatchExceptionInfo(String substring) {
        for (CustomExceptionInfo value : values()) {

            if (value.name().equals(substring)) {
                return value;
            }

        }

        return DINFO000;
    }

}
