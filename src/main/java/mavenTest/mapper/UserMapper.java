package mavenTest.mapper;

import mavenTest.pojo.User;
import java.util.List;

public interface UserMapper {
    public List<User> queryAllUser();
    public List<User> queryAllUserByName(User user);
    public List<User> queryAllUserByNameAndAge(User user);
    public List<User> queryAllUserByNameOrAge(User user);
    public List<User> queryUserLikeByName(User user);
    int addUserBackId(User user);
    void addUserBackById(User user);
    public List<User> getAllUser3(User user);
    public List<User> getAllUser4(User user);
    public int updateUser5(User user);
    public void deleteUserById(User user);
    public void updateUser(User user);
    public User queryUserById(User user);
}
