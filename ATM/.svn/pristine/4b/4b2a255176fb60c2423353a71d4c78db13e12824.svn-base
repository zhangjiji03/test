package view;

import java.sql.SQLException;
import java.util.Scanner;

import CardService.CardService;
import database.CardDao;
import entity.Card;
import systemutil.SystemUtil;

public class judge {
	public void judge(int xx) throws SQLException {
		CardService cc=new CardService(); 
		int money=0;
		menu m=new menu();
		switch (xx) {
		case 1:
			System.out.println( "余额："+cc.moneyQuery());
			m.menu();
			break;
		case 2:
			 money=view.page();
			if(cc.saveMoney(money)>0) {
				System.out.println("存钱成功");
			}else {
				System.out.println("存钱失败");
			}
			m.menu();
			break;
		case 3:
			 money=view.page();
			if(cc.takeMoney(money)>0) {
				System.out.println("取款成功");
			}else {
				System.out.println("取款失败");
			}
			m.menu();
			break;
		case 4:
			System.out.println("尽情期待ATM2.0版本");
			m.menu();
			break;
		case 5:
			System.out.println("感谢使用");
			break;
		}
	}
}