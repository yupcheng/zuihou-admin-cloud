package com.github.yupc.admin.rest.authority.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yupc
 * @createTime 2018-01-02 15:54
 */
@Data
public class AdminRolePageReqDTO implements Serializable {

    /**
     * 角色编码
     *
     * @mbggenerated
     */
    private String code;
    /**
     * 角色名称
     *
     * @mbggenerated
     */
    private String name;
    /**
     * 是否启用
     1：启用
     0：禁用
     *
     * @mbggenerated
     */
    private Boolean isEnable;
    private String description;
}
