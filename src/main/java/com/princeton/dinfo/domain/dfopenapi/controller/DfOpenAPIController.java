package com.princeton.dinfo.domain.dfopenapi.controller;

import com.princeton.dinfo.domain.dfopenapi.dto.response.ResponseServerInfoDto;
import com.princeton.dinfo.domain.dfopenapi.service.DfOpenAPIService;
import com.princeton.dinfo.global.dto.ResponseDataDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DfOpenAPIController {

    private final DfOpenAPIService dfOpenAPIService;

    @GetMapping("/servers")
    public ResponseEntity<ResponseDataDto<ResponseServerInfoDto>> getServerInfo() {
        return ResponseEntity.ok(new ResponseDataDto<>(dfOpenAPIService.getServerInfo()));
    }

}
