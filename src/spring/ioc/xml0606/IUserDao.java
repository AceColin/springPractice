package spring.ioc.xml0606;

public interface IUserDao {

	boolean usernameExists(String username);

	void insert(String username, String encodedPassword);

}