package mavenTest.service.impl;

import mavenTest.mapper.AccountMapper;
import mavenTest.pojo.Account;
import mavenTest.service.AccountLoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountLoginServiceImpl implements AccountLoginService {

    @Autowired
    private AccountMapper userMapper; //将UserMapper注入到业务实现类中

    public Account getLoginUser(Account user) {
        return userMapper.getLoginUser(user);
    }

    public void registerUser(Account user) {
        userMapper.registerUser(user);

    }
}
