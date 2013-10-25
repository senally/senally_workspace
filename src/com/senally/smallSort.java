package com.senally;

public class smallSort {
	public static void main(String[] args){
	int[] intArray={101, 103, 102};
	//ランダムな数字が予め格納された配列の宣言
	int newArray[] =new int[3];
	//昇順に数字を格納するための配列の宣言
	int cat=0;
	int dog=0;
	//while文、if文でカウントに使うための変数
	while(dog<intArray.length){
		//while(dogのカウント数がintArray配列の配列数と一緒になるまで)
		if(intArray[cat]-101==dog){
			//if(intArray[cat=一回目は１なので]=1がdogと同じ数値なら)
			newArray[dog] = intArray[cat];
			//newArray[dog]一回目は0にintArray[cat]一回目101を挿入
			dog++;
			//dogを１カウント（二回目は1）
		}
		System.out.println("cat: "+cat+" dog: "+dog);
		//きちんと変数がカウントされているか確認するためのprintln
		cat++;
		//catを１カウント（二回目は1）
		if(cat==3){
			cat=0;
		}
		//catがintArray配列番地最大数2を超えてしまったら0にして
		//リセットしてから12行目に戻る
	}
	System.out.println("newSort: "+newArray[0]+newArray[1]+newArray[2]);
	//新しい配列を0から順に表示する
	}
}
