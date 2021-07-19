import mavenTest.pojo.User;
import mavenTest.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration("classpath:springApplication.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest {

    @Autowired //获取spring容器中的bean工厂对象，用于获取容器中所有bean对象
    private BeanFactory beanFactory;

    @Test
    public void testQueryUserById(){
        UserService userService = beanFactory.getBean("userService", UserService.class);
        User user = new User();
        user.setUserId(802);
        User user1 = userService.queryUserById(user);
        System.out.println(user1);
    }

    @Test
    public void testUpdateUser() {
        UserService userService = beanFactory.getBean("userService", UserService.class);
        User user = new User();
        user.setUserId(3);
        user.setUserAge("18");
        userService.updateUser(user);
    }

    //通过id删除用户
    @Test
    public void testDeleteUserById() {
        UserService userService = beanFactory.getBean("userService", UserService.class);
        User user = new User();
        user.setUserId(2);
        userService.deleteUserById(user);
    }

    //查询所有用户
    @Test
    public void testQueryAllUser() {
        UserService userService = beanFactory.getBean("userService", UserService.class);
        List<User> res = userService.queryAllUser();
        for (User i: res) {
            System.out.println(i);
        }
    }

    //通过名字查询
    @Test
    public void testQueryAllUserByName(){
        UserService userService = beanFactory.getBean("userService", UserService.class);
        User user = new User();
        user.setUserName("xshuai");
        List<User> res = userService.queryAllUserByName(user);
        for (User i: res) {
            System.out.println(i);
        }
    }

    //通过名字和年龄查询，结果为名字和年龄都符合要求的项
    @Test
    public void testQueryAllUserByNameAndAge(){
        UserService userService = beanFactory.getBean("userService", UserService.class);
        User user = new User();
        user.setUserName("xshuai");
        user.setUserAge("12");
        List<User> res = userService.queryAllUserByNameAndAge(user);
        for (User i: res) {
            System.out.println(i);
        }
    }

    //通过名字或年龄查询，结果为名字或者年龄至少一项满足要求的项
    @Test
    public void testQueryAllUserByNameOrAge(){
        UserService userService = beanFactory.getBean("userService", UserService.class);
        User user = new User();
        user.setUserName("xiaohu");
        user.setUserAge("30");
        List<User> res = userService.queryAllUserByNameOrAge(user);
        for (User i: res) {
            System.out.println(i);
        }
    }

    //通过相似姓名查询
    @Test
    public void testQueryUserLikeByName(){
        UserService userService = beanFactory.getBean("userService", UserService.class);
        User user = new User();
        user.setUserName("h");
        List<User> res = userService.queryUserLikeByName(user);
        for (User i: res) {
            System.out.println(i);
        }
    }

    //插入时返回userId
    @Test
    public void testAddUserBackId(){
        UserService userService = beanFactory.getBean("userService", UserService.class);
        User user = new User();
        user.setUserName("xshuai");
        user.setUserAge("30");
        user.setUserPass("2200");
        user.setUserSex("男");
        userService.addUserBackId(user);
        System.out.println(user.getUserId());
    }

    //添加随机用户id
    @Test
    public void testAddUserBackById(){
        UserService userService = beanFactory.getBean("userService", UserService.class);
        User user = new User();
        user.setUserName("xshuai");
        user.setUserAge("30");
        user.setUserPass("2200");
        user.setUserSex("男");
        userService.addUserBackById(user);
    }

    //where多条件查询
    @Test
    public void testGetAllUser3(){
        UserService userService = beanFactory.getBean("userService", UserService.class);
        User user = new User();
        user.setUserName("xshuai");
        user.setUserAge("30");
        List<User> res = userService.getAllUser3(user);
        for (User i: res) {
            System.out.println(i);
        }
    }

    //trim多条件查询
    @Test
    public void testGetAllUser4(){
        UserService userService = beanFactory.getBean("userService", UserService.class);
        User user = new User();
        user.setUserName("xshuai");
        user.setUserAge("30");

        List<User> res = userService.getAllUser4(user);
        for (User i: res) {
            System.out.println(i);
        }
    }

    //set多条件修改
    @Test
    public void testUpdateUser5(){
        UserService userService = beanFactory.getBean("userService", UserService.class);
        User user = new User();
        user.setUserId(233);
        user.setUserName("hehe");
        user.setUserAge("300");

        int res = userService.updateUser5(user);
        if (res > 1) {
            System.out.println("修改成功");
        }
    }
}
