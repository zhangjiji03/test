package view;

import java.security.Provider.Service;
import java.util.Scanner;

import CardService.CardService;
import systemutil.SystemUtil;

public class view {
	
	static Scanner sr=new Scanner(System.in);
	static int yy;
	public static int page() {
		System.out.println("请输入金额：");
		int xx=sr.nextInt();
		if((xx%100==0)&&xx!=0) {
			yy=xx;
			CardService service=new CardService();
			//service.addmoney(yy, SystemUtil.currentCard);
		}else {
			view.page();
		}
		return yy;
	}
	/*public static int page() {
		System.out.println("请输入金额：");
		int xx=sr.nextInt();
		while(xx%100!=0||xx==0) {
			System.out.println("请输入金额：");
			xx=sr.nextInt();
		}
		return xx;
	}*/
}
