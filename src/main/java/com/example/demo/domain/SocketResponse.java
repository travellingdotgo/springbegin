package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.ConstructorArgs;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class SocketResponse {
    private String message;
}