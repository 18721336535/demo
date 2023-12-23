package com.zbq.demo.controller;

import com.alibaba.fastjson.JSON;
import com.zbq.demo.dto.RequestEntity;
import com.zbq.demo.dto.ResponseEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@Tag(name = "user", description = "Management APIs")
@RestController
public class UserPermissionsController {
    private static final Logger logger = LoggerFactory.getLogger(UserPermissionsController.class);
    @Operation(summary = "login", description = "To login.", tags = {"post" })
    @PostMapping("/login")
    public ResponseEntity<RequestEntity> login(@RequestBody RequestEntity user) {
        //todo
        logger.info(JSON.toJSONString(user));
        return ResponseEntity.success(user);
    }

    @Operation(summary = "signup", description = "To signup.", tags = {"post" })
    @PostMapping("/signup")
    public ResponseEntity<RequestEntity> signup(@RequestBody RequestEntity user) {
        //todo
        logger.info(JSON.toJSONString(user));
        return ResponseEntity.success(user);
    }
}
