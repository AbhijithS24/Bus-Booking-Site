package busbooking.dao;

import busbooking.model.User;

public interface Userdao {

	public int insert(User user);

	public int userlogin(String email, String password);
}
