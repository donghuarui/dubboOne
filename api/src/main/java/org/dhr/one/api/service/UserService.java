package org.dhr.one.api.service;


import org.dhr.one.model.entity.User;

/**
 * @author donghuarui.
 */
public interface UserService {

    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return
     */
    User findUserByUsername(String username);
}
