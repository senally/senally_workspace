/**
 * 
 */
package com.senally;

/**
 * int配列をソートするクラスです
 * 
 * @author fujisawa
 * @version 1.0.0
 */
public class NumberOrder {
	
	/**
	 * 第二引数によって第一引数の配列を昇順または降順に並び替えるフィクションです
	 * 
	 * @param sortArray ソート対象の配列
	 * @param sortOrder 0:昇順,1:降順にソートします
	 * 
	 * @return　ソートした配列　　sortOrderが0と1以外の場合は、nullをそのまま返します
	 */
	public int[] chooseOrder(int[] sortArray, int sortOrder){
		
		///////////////////////////////////////
//		if(sortOrder==0){
//			//昇順
//			return orderAsc(sortArray);
//		}else if(sortOrder==1){
//			//降順
//			return orderDesc(sortArray);
//		}
//		return sortArray;
		///////////////////////////////////////
		
		//第二引数に0が代入された場合
		if(sortOrder==0){
			
			//昇順から数字を格納するための配列
			int[] upArray =  new int[sortArray.length];
			
			//sortArray配列数をwhile文中0からカウントしてくれる変数
			int numbers=0;
			
			//while文中新しい配列数をカウントし、同時に新しい配列の格納の際に
			//格納数となって0からカウントしてくれる変数
			int cat= 0;
			
			//intArray配列数がcatより大きい間while文が回り続ける
			while(cat<sortArray.length){
				//intArray[numbers]*一回目は8とcat*一回目は0が一緒なら
				if(sortArray[numbers]==cat){
					//intArray[numbers]の数値をsortArray[cat]へ格納する
					upArray[cat] = sortArray[numbers];
					//catを１カウントする
					cat++;
				}
				
				//numbersを１カウントする
				numbers++;
				//numbersがsortArray配列数10より大きくなった場合は0にリセットする
				if(numbers==sortArray.length){
					numbers=0;
				}
			}
			
			//upArrey配列を戻り値として返します
			return upArray;
			
			//sortOrderに１と入力された場合の降順並び替え
		}else{
			//降順から数字を格納するための配列
			int[] downArray =  new int[sortArray.length];
			//sortArray配列数をwhile文中0からカウントしてくれる変数
			int numbers2=0;
			//while文中9からカウントダウンしてくれる変数
			int dog= 9;
			//sortArrayの配列数カウントアップする変数
			int i = 0;
			
			//dogが0以上の間while文が回り続ける
			while(dog>=0){
				//sortArray[numbers]*一回目は8とdog*一回目は9が一緒なら
				if(sortArray[numbers2]==dog){
					//sortArray[numbers2]の数値をdownArray[i]へ格納する
					downArray[i] = sortArray[numbers2];
					//dogを１カウントダウンする
					dog--;
					//iを１カウントアップする
					i++;
				}
				//numbers2を１カウントする	
				numbers2++;
				//numbers2がsortArray配列数10より大きくなった場合は0にリセットする
				if(numbers2==sortArray.length){
					numbers2=0;
				}
			}
			//downArrey配列（降順並び替え）を戻り値として返します
			return downArray;
		}
	}
	
	/**
	 * 	昇順でソート
	 * @param array
	 * @return
	 */
	public int[] orderAsc(int[] array){
		int[] retArray =  new int[array.length];
		return retArray;
	}
	
	/**
	 * 降順でソート
	 * @param array
	 * @return
	 */
	public int[] orderDesc(int[] array){
		int[] retArray =  new int[array.length];
		return retArray;
		
	}
}