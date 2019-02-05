
package CardService;

import java.security.Provider.Service;
import java.sql.SQLException;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;
import org.w3c.dom.UserDataHandler;

import database.CardDao;
import entity.Card;
import systemutil.SystemUtil;

public class CardService {
	CardDao ca=new CardDao();
	Card card=null;
	//验证登录
	public boolean isLand (Card a) throws SQLException {
		boolean bol=false;
		
		card=ca.loadByUsercard(a);
		if(card!=null) {
			SystemUtil.currentCard=card;
			bol=true;
		}
		return bol;
	}
	//查询余额int
	public int moneyQuery() throws SQLException {
		int money = 0;
		card=ca.query();
		money=card.getMoney();
		return money;
		
	}
	//存款
	public int saveMoney(int money) throws SQLException {
		int i=0;
		i=ca.save(money);
		return i;
	}
	//取款
	public int takeMoney(int money) throws SQLException {
		int i=0;
		i=ca.draw(money);
		return i;
	}
}
