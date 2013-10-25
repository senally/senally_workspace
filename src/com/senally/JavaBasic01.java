/**
 * 
 */
package com.senally;

/**
 * 配列を表示するファンクションです
 * 
 * @author fujisawa
 *
 */
public class JavaBasic01 {	
	public static void main(String args[]){	
		
		//ランダムな数字0~9までを格納する配列
		int[] intArray = {8, 0, 6, 1, 3, 9, 4, 7, 2, 5};
		//戻り値を受けるための変数
		int[] ansArray;
		//ansArrayにメソッドsortの戻り値を代入
		ansArray=sort(intArray);
		//昇順に数字が格納されたnewArrayを表示します
		System.out.println("数字を昇順に並び替えます：");
		for(int i=0;i<ansArray.length;i++){
			System.out.println(ansArray[i]);
		}
}
		
	/**
	 * ランダムな数字が格納された配列を昇順に配列するファンクションです
	 * 
	 * @param sortArray
	 * @return 	 *
	 */	
	public static int[] sort(int sortArray[]){
		
		
		int[] retArray =  new int[sortArray.length];
		//昇順から数字を格納するための配列
		int numbers=0;
		//intArray配列数をwhile文中0からカウントしてくれる変数
		int cat= 0;
		/**
		 *while文中新しい配列数をカウントし、同時に新しい配列の格納の際に
		 *格納数となって0からカウントしてくれる変数
		 **/
		while(cat<sortArray.length){
			//intArray配列数がcatより大きい間while文が回り続ける
			if(sortArray[numbers]==cat){
				//intArray[numbers]*一回目は8とcat*一回目は0が一緒なら
				retArray[cat] = sortArray[numbers];
				//intArray[numbers]の数値をretArray[cat]へ格納する
				cat++;
				//catを１カウントする
			}
			
			//System.out.println("numbers: "+numbers+" cat: "+cat);
			//各変数が正確にカウントされているか確認するためのコードです
				
			numbers++;
			//numbersを１カウントする
			if(numbers==sortArray.length){
				numbers=0;
				//numbersがintArray配列数10より大きくなった場合は0にリセットする
		}
		}
		return retArray;
		//retArrey配列を戻り値として返します
	}
}