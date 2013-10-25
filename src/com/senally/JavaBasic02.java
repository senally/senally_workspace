/**
 * 
 */
package com.senally;

/**
 * ランダムに格納された数字を引数２によって、昇順または降順に
 * 並び替えるファンクションです
 * 
 * @author fujisawa
 * @since 1.0.0
 * 
 */
public class JavaBasic02{
	public static void main(String[] args){
		
		
		if(args.length != 1){
			//引数が入力されなかった場合のエラーメッセージ
			System.out.println("引数を入力して下さい。昇順に並び替える場合は0、"
					+ "降順に並び替える場合は1。");
			return;
		}
		
		//ランダムな数字0~9までを格納する配列
		int[] intArray = {8, 0, 6, 1, 3, 9, 4, 7, 2, 5};
		
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
		NumberOrder numO = new NumberOrder();
		
		//ansArrayにメソッドsortの戻り値を代入
		ansArray= numO.chooseOrder(intArray,order);
		
		System.out.println("数字を並び替えます：");
		for(int i=0;i<ansArray.length;i++){
			//数字が格納されたnewArrayを表示します
			System.out.println(ansArray[i]);
		}
	}
}