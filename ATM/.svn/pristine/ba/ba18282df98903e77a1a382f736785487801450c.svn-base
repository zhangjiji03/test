package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import CardService.CardService;
import DBManager.DBManager;
import database.CardDao;
import entity.Card;
import systemutil.SystemUtil;

public class Land {
	public static void  scanner() throws SQLException{
		Scanner s=new Scanner(System.in);
		System.out.println("********欢迎使用中国人民银行ATM机********");
		System.out.println("*请输入银行卡号：");
		int x=s.nextInt();
		System.out.println("*请输入银行卡密码：");
		int y=s.nextInt();
		Card cc=new Card();
		cc.setUsercard(x);
		cc.setUserpassword(y);
		CardService cs=new CardService();
		boolean aa=cs.isLand(cc);
		if(aa) {
			menu me=new menu();
			me.menu();
		}else {
			System.out.println("登陆失败");
			Land.scanner();
		}
	}
}

