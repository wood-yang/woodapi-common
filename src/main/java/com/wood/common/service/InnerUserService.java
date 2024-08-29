package com.wood.common.service;

import com.wood.common.model.entity.User;

public interface InnerUserService {
    User getUserByAccessKey(String AccessKey);
}
