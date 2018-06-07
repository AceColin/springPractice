package spring.ioc.xml0606;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserService implements IUserService {
	
	private IUserDao userDao;
	private BCryptPasswordEncoder passwordEncoder; //BCrypt 是跨平台的文件加密工具，是专门为密码存储而设计的算法

	//用构造注入依赖，多个依赖的参数，要写在一个构造方法中，因当实例化调用方法时只会实例化一次，调用一个方法
	//多个依赖写多个构造方法，是重载，不同构造方法只是参数不同，名字一样，所以没必要，写一个构造方法就够了
	public UserService(IUserDao userDao, BCryptPasswordEncoder passwordEncoder) {
		this.userDao = userDao;
		this.passwordEncoder = passwordEncoder;
	}


	@Override
	public void register(String username,String password) {
		System.out.println("检查用户名"+username+"是否存在……");
		
		if (userDao.usernameExists(username)) {
			System.out.println("注册失败！用户名"+username+"已存在！");
		}
		else {
			System.out.println("加密明文密码……");
			String encodedpassword = passwordEncoder.encode(password);
			userDao.insert(username, encodedpassword);
		}
	}
	
	
}
