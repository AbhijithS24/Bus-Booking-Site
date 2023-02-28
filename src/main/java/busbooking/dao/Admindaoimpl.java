package busbooking.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import busbooking.model.Admin;

@Repository
public class Admindaoimpl implements Admindao {

	private JdbcTemplate jdbctemplate;

	public int adminlogin(Admin admin) {
		String query = "SELECT COUNT(*) FROM admin WHERE username = ? AND password =?";
		int r = this.jdbctemplate.queryForObject(query, Integer.class, admin.getUsername(), admin.getPassword());
		return r;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

}
