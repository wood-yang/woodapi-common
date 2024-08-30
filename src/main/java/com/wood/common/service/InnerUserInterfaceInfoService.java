package com.wood.common.service;

public interface InnerUserInterfaceInfoService {

    /**
     * 调用成功后，统计次数 + 1
     * @param userId
     * @param interfaceInfoId
     * @return
     */
    boolean invokeCount(Long userId, Long interfaceInfoId);

    /**
     * 调用前，判断是否有足够的调用次数
     * @param userId
     * @param interfaceInfoId
     * @return
     */
    boolean isEnough(Long userId, Long interfaceInfoId);
}
