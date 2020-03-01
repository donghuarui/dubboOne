package org.dhr.one.model.mapper;

import org.dhr.one.model.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Interface description
 *
 * @author donghuarui.
 */
@Repository
public interface UserMapper {

    //  @Select("select * from user")
    User findUserByUsername(String username);
}
