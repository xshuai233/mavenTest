package mavenTest.mapper;
import mavenTest.pojo.Account;

public interface AccountMapper {

    //查询用户
    public Account getLoginUser(Account user);

    //注册用户
    public void registerUser(Account user);

}
