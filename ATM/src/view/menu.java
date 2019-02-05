package view;

import java.sql.SQLException;
import java.util.Scanner;

public class menu {
	public void menu() throws SQLException {
		Scanner rr=new Scanner(System.in);
		System.out.println("********欢迎进入中国人民银行业务办理系统********");
		System.out.println("*1：查询余额");
		System.out.println("*2：存款");
		System.out.println("*3：取款");
		System.out.println("*4：转账");
		System.out.println("*5：退出");
		int xx=rr.nextInt();
		judge jj=new judge();
		jj.judge(xx);
	}
}
