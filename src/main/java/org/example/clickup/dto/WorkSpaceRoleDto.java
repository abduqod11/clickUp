package org.example.clickup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class WorkSpaceRoleDto {
    private Long WorkSpaceId;
    private String name;
    private String extendsRole;
}