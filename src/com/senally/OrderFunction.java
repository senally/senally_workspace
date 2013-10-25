/**
 * 
 */
package com.senally;

/**
 * 数字をソートするクラスです
 * 
 * @author fujisawa
 * @since 1.0.0
 * 
 */
public class OrderFunction {
	
	/**
	 * 引数を受けて、昇順または降順にソートした配列を戻り値として返します
	 * 
	 * @param sortArray　ソート対象となる配列
	 * @param sortOrder　0=昇順　1=降順
	 * @return ソートされたint配列
	 * 
	 */
	public int[] chooseOrder(int[] sortArray, int sortOrder){
		if(sortOrder==0){
			//昇順
			return countUp(sortArray);
		}else if(sortOrder==1){
			//降順
			return countDown(sortArray);
		}
		return sortArray;
	}
	
	/**
	 * 昇順にソートします
	 * 
	 * @param sortArray　ソート対象となる配列
	 * @return 昇順にソートされた配列
	 * 
	 */
	public int[] countUp(int[] sortArray){
		
		//昇順からsortArrayに格納された値を格納するための配列
		int[] upArray =  new int[sortArray.length];
		
		//一時的に最少の値を代入するための変数
		int smallest;
		
		//配列添え字カウンター
		//iはupArray配列の添え字をカウントします
		int i = 0;
		//dはsmallestへ代入する値をsortArray配列から出力する際に使用します
		int d=0;
		
		//smallestへsortArray[i]を代入します
		smallest = sortArray[i];
		
		//最小の値をupArray[0]へ格納します
		for(int v=0;v<sortArray.length;v++){
			if(smallest>sortArray[v])
				smallest = sortArray[v];
		}
		upArray[i] = smallest;
		i++;
		
		//二番目に小さい値から最大の値をupArray配列へ格納します
		while(i<sortArray.length){
			//dの値がsortArray配列数をオーバーしていた場合0にリセットします。
			if(d<sortArray.length)
				d = 0;
			//smallestへsortArray[d]を代入します
			smallest = sortArray[d];
			
			//ただしsmallestの値がupArrayへ格納した最後の値より小さいまたは同じ場合は
			//sortArray配列の中からupArray配列に格納した最後の値より大きくなる他の値を探します
			while(smallest<=upArray[i-1]){
				if(d!=sortArray.length){
					d = d+1;
					smallest = sortArray[d];
				}else{
						d = 0;
						smallest = sortArray[d];
				}
			}
			
			//smallestとsortArrayに格納された全ての数字を比較します
			for(int r=0;r<sortArray.length;r++){
				//smallestがsortArray[r]より大きく、かつsortArray[r]はupArrayへ最後に
				//格納された数字より大きい場合はsmallestへsortArray[r]の値を代入します
				if(smallest>sortArray[r]&&sortArray[r]>upArray[i-1])
					smallest = sortArray[r];
			}
			//upArray[i]へsmallestの値を格納します
			upArray[i] = smallest;
			i++;
			d++;
		}
		//upArrey配列を戻り値として返します
		return upArray;
	}

	

	/**
	 * 降順にソートします
	 * 
	 * @param sortArray　ソート対象となる配列
	 * @return 降順にソートされた配列
	 * 
	 */
	public int[] countDown(int[] sortArray){
	
		//降順からsortArrayに格納された値を格納するための配列
		int[] downArray =  new int[sortArray.length];
		
		//一時的に最大の値を代入するための変数
		int biggest;
		
		//配列添え字カウンター
		//iはdownArray配列の添え字をカウントします
		int i = 0;
		//dはbiggestへ代入する値をsortArray配列から出力する際に使用します
		int d=0;
		
		//biggestへsortArray[i]を代入します
		biggest = sortArray[i];
		
		//最大の値を探し、downArray[0]へ格納します
		for(int v=0;v<sortArray.length;v++){
			if(biggest<sortArray[v])
				biggest = sortArray[v];
		}
		downArray[i] = biggest;
		i++;
		
		//二番目に大きい値から最小の値までをdownArray配列へ格納します
		while(i<sortArray.length){
			//dの値がsortArray配列数をオーバーしていた場合0にリセットします。
			if(d<sortArray.length)
				d = 0;
			//biggestへsortArray[d]を代入します
			biggest = sortArray[d];
			
			//ただしbiggestの値がdownArrayへ格納した最後の値より大きいまたは同じ場合は
			//sortArray配列の中からupArray配列に格納した最後の値より小さい他の値を探します
			while(biggest>=downArray[i-1]){
				if(d!=sortArray.length){
					d = d+1;
					biggest = sortArray[d];
				}else{
						d = 0;
						biggest = sortArray[d];
				}
			}
			
			//biggestとsortArrayに格納された全ての数字を比較します
			for(int r=0;r<sortArray.length;r++){
				//biggestがsortArray[r]より大きく、かつsortArray[r]はdownArrayへ最後に
				//格納された数字より小さい場合はbiggestへsortArray[r]の値を代入します
				if(biggest<sortArray[r]&&sortArray[r]<downArray[i-1])
					biggest = sortArray[r];
			}
			//downArray[i]へbiggestの値を格納します
			downArray[i] = biggest;
			i++;
			d++;
		}
		//downArray配列を戻り値として返します
		return downArray;
	}
}
