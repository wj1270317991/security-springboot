package com.wj.security.model;

import lombok.Data;

/**
 * com.wj.security.model
 * Created on 2020-05-18  17:50
 *
 * @author wangjun
 */
@Data
public class PermissionDto {
    private String id;

    private String code;

    private String description;

    private String url;
}
