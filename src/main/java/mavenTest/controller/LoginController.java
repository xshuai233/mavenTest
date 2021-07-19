package mavenTest.controller;

import mavenTest.pojo.Account;
import mavenTest.pojo.User;
import mavenTest.service.AccountLoginService;
import mavenTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class LoginController {

    @Autowired
    private AccountLoginService accountLoginService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login/{userid}/add/{userId}")
    public String userLogin(@RequestParam("username") String username,
                            @RequestParam("password") String password) {
        if (username.equals("admin") && password.equals("123456")) {
            return "success";
        }
        else {
            return "fail";
        }
    }

    @RequestMapping(value = "/login2",method = RequestMethod.POST)
    public String userLogin2(@RequestParam("username") String username,
                            @RequestParam("password") String password){
        if(username.equals("admin")&&password.equals("123456")){
            return "success";
        }
        else{
            return "fail";
        }
    }

    @RequestMapping(value ="/login3/{userid}")//接受POST和GET
    public String userLogin3(@PathVariable("userid") String userId){
        if(userId.equals("200")){
            return "success";
        }
        else{
            return "fail";
        }
    }

//    表单提交，保存测试
    @RequestMapping(value = "/userAdd", method = RequestMethod.POST)
    public String saveUser(User user) {
        System.out.println(user.getUserName() + " " + user.getUserPass() + " " + user.getUserSex() + " " + user.getUserAge());
        return "success";
    }

//    sevlet API接口可以被调用
    @RequestMapping(value = "/userAdd2", method = RequestMethod.POST)
    public String saveUser2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsps/success.jsp").forward(request, response);
        return null;
    }

//    通过后台的获取的对象转换成前台json字符串
    @ResponseBody
    @RequestMapping(value = "/getUsers")
    public List<User> getUserByJson() {
        List<User> userList = new ArrayList<User>();
        User user = new User();
        user.setUserName("bobo");
        user.setUserPass("123456");
        user.setUserAge("12");
        user.setUserSex("男");

        User user2 = new User();
        user2.setUserName("lily");
        user2.setUserPass("123456");
        user2.setUserAge("12");
        user2.setUserSex("女");

        userList.add(user);
        userList.add(user2);

        return userList;
    }

//    modelAndView|Modelmap|model
    @RequestMapping(value = "/testModel", method = RequestMethod.POST)
    public ModelAndView testModel(User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        modelAndView.addObject(user);
        return modelAndView;
    }

    @RequestMapping(value = "/testModel2", method = RequestMethod.POST)
    public String testModel2(User user, Model model) {
        model.addAttribute("user", user);
        return "success";
    }

    @RequestMapping(value = "/userLogin")
    public String getLogin(Account account, Model model) {
        Account account1 = accountLoginService.getLoginUser(account);
        List<User> users = userService.queryAllUser();
        model.addAttribute("users", users);
//        model.addAttribute("account", account);
//        System.out.println(model);
        if (account1 != null) {
            return "showUser";
        }
        else {
            return "fail";
        }
    }

    @RequestMapping(value = "/jumpToAddUser")
    public String jumpToAddUser() {
        return "addUser";
    }

    @RequestMapping(value = "/updateUser/{userid}")
    public String jumpToUpdateUser(@PathVariable("userid") int userId, Model model) {
        User user = new User();
        user.setUserId(userId);
        User user1 = userService.queryUserById(user);
        model.addAttribute("user", user1);
        return "updateUser";
    }

    @RequestMapping(value = "/updateUser")
    public String updateUser(User user) {
        userService.updateUser(user);
        return "updateSuccess";
    }

    @RequestMapping(value = "/addUser")
    public String addUser(User user) {
        userService.addUserBackId(user);
        return "addSuccess";
    }

    @RequestMapping(value = "/deleteUser/{userid}")
    public String deleteUser(@PathVariable("userid") int userId) {
        User user = new User();
        user.setUserId(userId);
        userService.deleteUserById(user);
        return "deleteSuccess";
    }

}
