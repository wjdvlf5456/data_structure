package ch4;

public class AccessControl_1 {

	int num1, num2, sum;
	double ave;

	public AccessControl_1(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	int getSum() {
		sum = num1 + num2;
		
		return sum;
	}

	double getAve() {
		ave = sum / 2.0;
		
		return ave;
	}

}
