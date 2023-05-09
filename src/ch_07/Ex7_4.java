package ch_07;

public class Ex7_4 {

	public static void main(String[] args) {
		OptExp opt = new OptExp();

		//아래 입력 수식을 바꿔 가면서 실습하시오.
		String exp = "(((3*5)-(6/2))/(2*4))";  
		char postfix[];
		System.out.println(exp);
		if(opt.testPair(exp))
			System.out.println("괄호 맞음!");
		else
			System.out.println("괄호 틀림!!!");
		
		System.out.printf("\n후위표기식 : ");
		postfix = opt.infix_to_postfix(exp);
		System.out.println(postfix);
	}
}