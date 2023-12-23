package com.zbq.demo.controller;

import com.alibaba.fastjson.JSON;
import com.zbq.demo.dto.ResponseEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@Tag(name = "pre-handle", description = "Management APIs")
@RestController
public class FileDataParsingLoadingController {

    private static final Logger logger = LoggerFactory.getLogger(UserPermissionsController.class);

    @Operation(summary = "data dataLoading", description = "given csv file path and name, to read/parse/load data to db", tags = {"get"})
    @GetMapping("/dataLoading/{fileLocation}")
    public ResponseEntity<String> prepareData(@PathVariable("fileLocation") String fileLocation) {
        // load data to h2 ,
        logger.info(JSON.toJSONString(fileLocation));
        return ResponseEntity.success(fileLocation);
    }
}
