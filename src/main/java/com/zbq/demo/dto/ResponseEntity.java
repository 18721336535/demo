package com.zbq.demo.dto;

import com.zbq.demo.constant.DemoConstant;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEntity<T> {
    @Schema(description = "code", requiredMode = Schema.RequiredMode.REQUIRED)
    private int code;
    @Schema(description = "message", requiredMode = Schema.RequiredMode.REQUIRED)
    private String message;
    @Schema(description = "result data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private T data;

    public static <T>ResponseEntity<T> success(T data){
        return new ResponseEntity<>(DemoConstant.SUCCESS_CODE,DemoConstant.SUCCESS_STRING,data);
    }

    public static <T>ResponseEntity<T> failure(T data){
        return new ResponseEntity<>(DemoConstant.FAILURE_CODE,DemoConstant.FAILURE_STRING,data);
    }
}
