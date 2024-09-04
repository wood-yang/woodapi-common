package com.wood.common.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 接口信息
 * @TableName interface_info
 */
@TableName(value ="interface_info")
@Data
public class InterfaceInfo implements Serializable {
    /**
     * 自增ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 接口名称
     */
    private String name;

    /**
     * 接口描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 接口类型
     */
    private String method;

    /**
     * 接口图标
     */
    private String avatarUrl;

    /**
     * 状态(0 - 关闭 1 - 打开)
     */
    private Integer status;

    /**
     * 请求参数
     */
    private String requestParams;

    /**
     * 响应参数
     */
    private String responseParams;

    /**
     * 返回示例
     */
    private String returnFormat;

    /**
     * 创建人 id
     */
    private Long userId;

    /**
     * 总调用次数
     */
    private Integer totalInvokeNum;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    private Integer isDeleted;

    /**
     * 请求示例
     */
    private String requestExample;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}