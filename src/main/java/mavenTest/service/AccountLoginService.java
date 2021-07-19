package mavenTest.service;

import mavenTest.pojo.Account;

public interface AccountLoginService {

    public Account getLoginUser(Account account);  //用户登录

    public void registerUser(Account account);  //用户注册
}
