package yoproduction.beitak.dal;

import java.sql.Connection;

import yoproduction.beitak.entities.Login;

public class LoginDAL {

	private Connection conn; // place holder for the SQLite connection

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public int getByUsernameAndPassword(String un, String pw) {
		int id = -1;
		// TODO: add the SQL query
		return id;
	}

	public boolean insert(Login login) {
		boolean result = false;
		// TODO: add the SQL query
		return result;

	}

	// TODO: add other functions (update\ delete\ ...)as needed
}
