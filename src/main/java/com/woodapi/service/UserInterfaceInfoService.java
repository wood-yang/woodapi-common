package com.woodapi.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.woodapi.model.entity.InterfaceInfo;
import com.woodapi.model.entity.User;
import com.woodapi.model.entity.UserInterfaceInfo;

/**
* @author 24420
* @description 针对表【user_interface_info(用户调用接口信息)】的数据库操作Service
* @createDate 2024-08-27 09:52:18
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    /**
     * 数据库中查是否已经分配给用户密钥(ak，sk=>布尔值)
     * @param accessKey
     * @param secretKey
     * @return
     */
    User getUser(String accessKey, String secretKey);

    /**
     * 从数据库中查询模拟接口(请求路径，请求方法、请求参数=>布尔)
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);

    /**
     * 调用成功，接口调用次数 +1 invokeCount (ak，sk (标识用户)，请求接口路径)
     * @param userId
     * @param interfaceInfoId
     * @return
     */
    boolean invokeCount(Long userId, Long interfaceInfoId);
}
