package com.Sq006.JWT.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class ApiResponse<T> {

    private HttpStatus status;
    private T data;
    private  String error;

    public ApiResponse(HttpStatus status) {
        this.status = status;
    }

    public ApiResponse(HttpStatus status, T data) {
        this.status = status;
        this.data = data;
    }
}
