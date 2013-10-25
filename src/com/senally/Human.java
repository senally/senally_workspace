package com.senally;

class Human {

	public static void main(String[] args) {
		System.out.println("初期値5000円で財布クラスをインスタンス化します");
		Wallet wallet=new Wallet(5000);
		
		System.out.println("財布から3000円取り出します");
		boolean b = wallet.cashOut(3000);
		if (b){
			System.out.println("残高不足です");
		}
		System.out.println("只今の残高："+wallet.getMoney());
		
		System.out.println("財布から3000円取り出します");
		b = wallet.cashOut(3000);
		if (b){
			System.out.println("残高不足です");
		}
		System.out.println("只今の残高："+wallet.getMoney());		
	}

}
