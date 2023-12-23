package com.zbq.demo.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    public static final long serialVersionUID = 1L;
    @Schema(description = "user id", requiredMode = Schema.RequiredMode.REQUIRED)
    private String userId;
    @Schema(description = "user full name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String userName;
    @Schema(description = "password", requiredMode = Schema.RequiredMode.REQUIRED)
    private String password;
}
