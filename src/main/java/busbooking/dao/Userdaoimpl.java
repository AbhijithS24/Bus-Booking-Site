package busbooking.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import busbooking.model.User;

@Repository
public class Userdaoimpl implements Userdao {

	private JdbcTemplate jdbctemplate;

	public int insert(User user) {
		String query = "insert into user(name,email,password) values(?,?,?)";
		int r = this.jdbctemplate.update(query, user.getName(), user.getEmail(), user.getPassword());
		return r;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public int userlogin(String email, String password) {
		String query = "SELECT COUNT(*) FROM user WHERE email = ? AND password =?";
		int r = this.jdbctemplate.queryForObject(query, Integer.class, email, password);
		return r;
	}

}
