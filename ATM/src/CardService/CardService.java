
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
	//��֤��¼
	public boolean isLand (Card a) throws SQLException {
		boolean bol=false;
		
		card=ca.loadByUsercard(a);
		if(card!=null) {
			SystemUtil.currentCard=card;
			bol=true;
		}
		return bol;
	}
	//��ѯ���int
	public int moneyQuery() throws SQLException {
		int money = 0;
		card=ca.query();
		money=card.getMoney();
		return money;
		
	}
	//���
	public int saveMoney(int money) throws SQLException {
		int i=0;
		i=ca.save(money);
		return i;
	}
	//ȡ��
	public int takeMoney(int money) throws SQLException {
		int i=0;
		i=ca.draw(money);
		return i;
	}
}
