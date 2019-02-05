package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import DBManager.DBManager;
import entity.Card;
import systemutil.SystemUtil;
import view.menu;
import view.view;

//Dao管理card数据表 数据访问对象
public class CardDao extends DBManager{
	//查询账号
	 Card s=null;
	public Card loadByUsercard(Card a) throws SQLException{
		//Card s=null;
		Connection conn=this.openConnection();
		String sql="select * from user where usercard=? and userpassword=? ";
		Object[] parameters=new Object[] {a.getUsercard(),a.getUserpassword()};
		ResultSet rs=this.executeQuery(conn, sql,parameters);
		while(rs.next()) {
			s=new Card();
			s.setUsercard(rs.getInt("usercard"));
			s.setUserpassword(rs.getInt("userpassword"));	
		}
		this.closeConnection(conn);
		return s;
	}
	//查询余额
	public Card query() throws SQLException {
		Connection conn=this.openConnection();
		String sql="select money from user where usercard=? ";
		Object[] parameters=new Object[] {SystemUtil.currentCard.getUsercard()};
		ResultSet rs=this.executeQuery(conn, sql,parameters);
		while(rs.next()) {
			s=new Card();
			s.setMoney(rs.getInt("money"));	
		}
		this.closeConnection(conn);
		return s;
	}
	//存钱
	public int save(int money) throws SQLException {
		//int aa=view.page();
		Connection conn=this.openConnection();
		String sql="update user set money=money+? where usercard=?";
		Object[] parameters=new Object[] {money,SystemUtil.currentCard.getUsercard()};
		int rs=this.execute(conn, sql,parameters);
		this.closeConnection(conn);
		return rs;
	}
	//取款
	public int draw(int money) throws SQLException {
		Connection conn=this.openConnection();
		//int aa=view.page();
		String sql="update user set money=money-? where usercard=?";
		Object[] parameters=new Object[] {money,SystemUtil.currentCard.getUsercard()};
		int rs=this.execute(conn, sql,parameters);
		this.closeConnection(conn);
		return rs;
	}
	//转账
	/*public Card (Card a) throws SQLException{
		Card s=null;
		Connection conn=this.openConnection();
		String sql="select * from user where usercard=? and userpassword=? ";
		Object[] parameters=new Object[] {a.getUsercard(),a.getUserpassword()};
		ResultSet rs=this.executeQuery(conn, sql,parameters);
		if(rs.next()) {
			s=new Card();
			s.setUsercard(rs.getInt("usercard"));
			s.setUserpassword(rs.getInt("userpassword"));
			s.setMoney(rs.getInt("money"));
		}
		this.closeConnection(conn);
		return s;
	}*/
	
}
