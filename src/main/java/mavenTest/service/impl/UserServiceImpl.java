package mavenTest.service.impl;

import mavenTest.mapper.UserMapper;
import mavenTest.pojo.User;
import mavenTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    public List<User> queryAllUserByName(User user) {
        return userMapper.queryAllUserByName(user);
    }

    public List<User> queryAllUserByNameAndAge(User user) {
        return userMapper.queryAllUserByNameAndAge(user);
    }

    public List<User> queryAllUserByNameOrAge(User user) {
        return userMapper.queryAllUserByNameOrAge(user);
    }

    public List<User> queryUserLikeByName(User user) {
        return userMapper.queryUserLikeByName(user);
    }

    public int addUserBackId(User user) {
        return userMapper.addUserBackId(user);
    }

    public void addUserBackById(User user) {
        userMapper.addUserBackById(user);
    }

    public List<User> getAllUser3(User user) {
        return userMapper.getAllUser3(user);
    }

    public List<User> getAllUser4(User user) {
        return userMapper.getAllUser4(user);
    }

    public int updateUser5(User user) {
        return userMapper.updateUser5(user);
    }

    public void deleteUserById(User user) {
        userMapper.deleteUserById(user);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public User queryUserById(User user) {
        return userMapper.queryUserById(user);
    }

}
