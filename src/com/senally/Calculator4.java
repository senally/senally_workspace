package com.senally;

/**
 * ŠÈˆÕ“d‘ìƒvƒƒOƒ‰ƒ€
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
			System.out.println("ˆø”‚Í‚R‚ÂˆÈã“ü—Í‚µ‚Ä‰º‚³‚¢");
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
			System.out.println("‘«‚µZ‚ÍaddAˆø‚«Z‚ÍminusAŠ|‚¯Z‚ÍmultiAŠ„‚èZ‚Ídiv‚ğw’è‚µ‚Ä‰º‚³‚¢");
			return;
		}
		System.out.println("ŒvZŒ‹‰ÊF"+result);
	}

}
