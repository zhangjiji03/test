package DBManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public abstract class DBManager {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Connection openConnection() throws SQLException {
		String url="jdbc:mysql://localhost:3306/user?useSSL=false";
		return DriverManager.getConnection(url, "root", "a111");
	}
	public void closeConnection(Connection c) throws SQLException {
		if(c!=null&&!c.isClosed()) {
			c.close();
		}
	}
	public int execute(Connection c,String sql,Object...parameters) throws SQLException {
		int count=0;
		if(c!=null && !c.isClosed()) {
			PreparedStatement ps= c.prepareStatement(sql);
			if(parameters!=null) {
				for(int i=0;i<parameters.length;i++) {
					ps.setObject(i+1, parameters[i]);
				}
			}
			count=ps.executeUpdate();
		}
		return count;
	}
	public ResultSet executeQuery(Connection c,String sql,Object...parameters) throws SQLException {
		ResultSet re=null;
		if(c!=null && !c.isClosed()) {
			PreparedStatement ps= c.prepareStatement(sql);
			if(parameters!=null) {
				for(int i=0;i<parameters.length;i++) {
					ps.setObject(i+1, parameters[i]);
				}
			}
			re=ps.executeQuery();
		}
		return re;
	}
}
