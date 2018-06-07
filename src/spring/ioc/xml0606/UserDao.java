package spring.ioc.xml0606;

public class UserDao implements IUserDao {
	
	/* (non-Javadoc)
	 * @see springpractice.xml.IUserDao#usernameExists(java.lang.String)
	 */
	@Override
	public boolean usernameExists(String username) {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see springpractice.xml.IUserDao#insert(java.lang.String, java.lang.String)
	 */
	@Override
	public void insert (String username,String encodedPassword) {
		System.out.println("插入用户："+username+":"+encodedPassword);
	}
	
	
}
