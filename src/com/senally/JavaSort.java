/**
 * 
 */
package com.senally;

/**
 * @author fujisawa
 *
 */
public class JavaSort {

	/**
	 * @param args
	 */
public static void main(String[] args){
		if(args.length != 1){
			//引数が入力されなかった場合のエラーメッセージ
			System.out.println("引数を入力して下さい。昇順に並び替える場合は0、"
					+ "降順に並び替える場合は1。");
			return;
		}
		
		//ランダムな数字５つを格納する配列
		int[] intArray = {36, 7, 12, 28, 0, 99, 17, 41, 5};
		
		//コマンドライン引数の	1番目をorderに代入
		int order = Integer.parseInt(args[0]);
		
		if(order > 1){
			//0または1以外の数が入力された場合のエラーメッセージ
			System.out.println("昇順に並び替える場合は0、"
					+ "降順に並び替える場合は1。それ以外の数字は入力出来ません");
			return;
		}
		
		//戻り値を受けるための変数
		int[] ansArray;
		
		//NumberOrderのインスタンス化をします
		OrderFunction orderF = new OrderFunction();
		
		//ansArrayにメソッドsortの戻り値を代入
		ansArray= orderF.chooseOrder(intArray,order);
		
		System.out.println("数字を並び替えます：");
		for(int i=0;i<ansArray.length;i++){
			//数字が格納されたnewArrayを表示します
			System.out.println(ansArray[i]);
		}
	}

}
