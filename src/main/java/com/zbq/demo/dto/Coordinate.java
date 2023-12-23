package com.zbq.demo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Coordinate {
    @Schema(description = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String latitude;
    @Schema(description = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String longitude;
}
