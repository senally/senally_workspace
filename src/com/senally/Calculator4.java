package com.senally;

/**
 * 簡易電卓プログラム
 * 
 * @author fujisawa
 * @since 1.0
 *
 */
/**
 * @author fujisawa
 *
 */
public class Calculator4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length != 3){
			System.out.println("引数は３つ以上入力して下さい");
			return;
		}
		
		int result=0;
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		String operator=args[2];
		
		if(operator.equals("add")){
			result=num1+num2;
		}else if(operator.equals("minus")){
			result=num1-num2;
		}else if(operator.equals("multi")){
			result=num1*num2;
		}else if(operator.equals("div")){
			result=num1/num2;
		}else{
			System.out.println("足し算はadd、引き算はminus、掛け算はmulti、割り算はdivを指定して下さい");
			return;
		}
		System.out.println("計算結果："+result);
	}

}
