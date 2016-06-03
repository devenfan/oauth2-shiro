package com.monkeyk.os.domain.users;

import com.monkeyk.os.domain.shared.Repository;

import java.util.List;

/**
 * 2016/6/3
 *
 * @author Shengzhao Li
 */

public interface UsersAuthzRepository extends UsersRepository {

    List<Users> findUsersByUsername(String username);
}