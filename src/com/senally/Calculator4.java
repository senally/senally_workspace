package com.senally;

/**
 * �ȈՓd��v���O����
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
			System.out.println("�����͂R�ȏ���͂��ĉ�����");
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
			System.out.println("�����Z��add�A�����Z��minus�A�|���Z��multi�A����Z��div���w�肵�ĉ�����");
			return;
		}
		System.out.println("�v�Z���ʁF"+result);
	}

}
