package com.iss.dao;

import com.iss.model.User;

public interface IUserDao {

    User selectUser(long id);

}