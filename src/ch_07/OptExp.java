package ch_07;

public class OptExp {
	private String exp;
	private int expSize;
	private char testCh, openPair;
	
	public boolean testPair(String exp) {
		this.exp = exp;
		expSize = this.exp.length();
		
		LinkedStack S = new LinkedStack();
//		ArrayStack S = new ArrayStack(expSize);

		for(int i=0; i<expSize; i++) {
			testCh = this.exp.charAt(i);
			switch(testCh) {
			case '(' :
			case '{' :
			case '[' :
				S.push(testCh); break;
			case ')' :
			case '}' :
			case ']' :
				if(S.isEmpty()) return false;
				else {
					openPair = S.pop();
					if( (openPair == '(' && testCh != ')') ||
						(openPair == '{' && testCh != '}') ||
						(openPair == '[' && testCh != ']'))
						return false;
					else break;
				}
			default:
			}
		}
		if(S.isEmpty()) return true;
		else return false;
	}
	
	public char[] infix_to_postfix(String infix) {
		int infixSize = infix.length();
		char postfix[] = new char[infixSize];
		int j = 0;
		LinkedStack S = new LinkedStack();
		
		for(int i=0; i<expSize; i++) {
				char symbol = this.exp.charAt(i);

			switch(symbol) {
				case '0' :
				case '1' :
				case '2' :
				case '3' :
				case '4' :
				case '5' :
				case '6' :
				case '7' :
				case '8' :
				case '9' :
					postfix[j++] = symbol; break;
				case '+' :
				case '-' :
				case '*' :
				case '/' :
					S.push(symbol); break;
				case ')' : 
					postfix[j++] = S.pop(); break;
				case '\0' :
					while (S.isEmpty() != true) postfix[j++] = S.pop(); 
					break; 
				default:
			}	
		}
		return postfix;
	}
}
