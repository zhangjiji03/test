package entity;

import java.io.Serializable;

//ӳ�����ݿ�user��
public  class Card implements Serializable {
	private int usercard;
	private int userpassword;
	private int money;
	public int getUsercard() {
		return usercard;
	}
	public void setUsercard(int usercard) {
		this.usercard = usercard;
	}
	public int getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(int userpassword) {
		this.userpassword = userpassword;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String toString() {
		return "�˻���" + usercard + ",  ��" + money;
	}
}
