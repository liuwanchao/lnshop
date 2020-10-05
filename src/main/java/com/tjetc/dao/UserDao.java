package com.tjetc.dao;

import com.tjetc.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    //查询所有用户
    List<User> selectAll()throws SQLException;
    //根据用户名和密码查询用户
    User selectByUsernameAndPassword(String username,String password)throws SQLException;
    //增加用户
    int addUser(User user)throws SQLException;
    //删除用户 id
    int deleteUserById(String id)throws SQLException;
    //删除用户 name
    int deleteUserByName(String name)throws SQLException;
    //根据id查询用户
    User selectUserById(String id)throws SQLException;
    //根据id修改用户角色
    int updateRoleById(String id,int role)throws SQLException;
    //修改密码     username,password
    int updatePasswordByUsernameAndPassword(String username,String password,String newpassword)throws SQLException;
}
