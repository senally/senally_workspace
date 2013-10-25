/**
 * 
 */
package com.senally;

/**
 * ‚¨à•zƒvƒƒOƒ‰ƒ€
 * @author fujisawa
 *
 */
public class Wallet {
	private int money;
	public Wallet(int money){
		this.money = money;
	}

	public void clashIn(int money){
		this.money = this.money + money;
				
	}
	
	public boolean cashOut(int money){
		if(this.money - money < 0){
			this.money=0;
			return true;
		}
		
		this.money=this.money - money;
		return false;

	}
	
	public int getMoney(){
		return this.money;
		
	}
	
}
