package spring.ioc.xml0606;

public class UserController {
	
	private IUserService userservice;
	
	public UserController(IUserService userservice) {
		this.userservice = userservice;
	}

	public void register(String username,String password) {
		System.out.println("注册账户"+username+"……");
		userservice.register(username, password);
	}
}
