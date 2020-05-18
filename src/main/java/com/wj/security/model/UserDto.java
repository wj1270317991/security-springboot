package com.wj.security.model;

import lombok.Data;

/**
 * com.wj.security.model
 * Created on 2020-05-18  16:55
 *
 * @author wangjun
 */
@Data
public class UserDto {
    private String id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;
}
