package com.Sq006.JWT.config;

import com.Sq006.JWT.exceptions.CustomException;
import com.Sq006.JWT.models.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
public class RequestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<Object> handleCustomException(CustomException customException) {
        ApiResponse<?> response = new ApiResponse<>(customException.getStatus());
        response.setError(customException.getMessage());
        return buildResponseEntity(response);
    }

    private ResponseEntity<Object> buildResponseEntity(ApiResponse<?> apiResponse) {
        return new ResponseEntity<>(apiResponse, apiResponse.getStatus());
    }

}