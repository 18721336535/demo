package com.zbq.demo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class RequestEntity {
    public static final long serialVersionUID = 1L;
    @Schema(description = "location keyWord", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String locationKeyWord;
    @Schema(description = "coordinate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Coordinate coordinate;
    @Schema(description = "foodName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String foodName;
}
