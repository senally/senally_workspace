package com.senally;

class Human {

	public static void main(String[] args) {
		System.out.println("�����l5000�~�ō��z�N���X���C���X�^���X�����܂�");
		Wallet wallet=new Wallet(5000);
		
		System.out.println("���z����3000�~���o���܂�");
		boolean b = wallet.cashOut(3000);
		if (b){
			System.out.println("�c���s���ł�");
		}
		System.out.println("�����̎c���F"+wallet.getMoney());
		
		System.out.println("���z����3000�~���o���܂�");
		b = wallet.cashOut(3000);
		if (b){
			System.out.println("�c���s���ł�");
		}
		System.out.println("�����̎c���F"+wallet.getMoney());		
	}

}
