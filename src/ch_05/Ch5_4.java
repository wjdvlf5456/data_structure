package ch_05;

public class Ch5_4 {

	public static void main(String[] args) {
		float a[] = new float[] { 5, 2, 0, 0, 0, -3, 0, 2, 10 };
		float b[] = new float[] { 4, 3, 5, 0, 3, 0, 5, 0 };
        Polynomial A = new Polynomial(8, a);
        Polynomial B = new Polynomial(7, b);
        OperatePoly optPoly = new OperatePoly();
        Polynomial C = optPoly.addPoly(A, B);
        System.out.printf("A(x)=");
        A.printPoly();
        System.out.printf("B(x)=");
        B.printPoly();
        System.out.printf("C(x)=");
        C.printPoly();
    }
}

class OperatePoly {
    private int degree_A = 0, degree_B = 0, degree_C = 0, index_A = 0, index_B = 0, index_C = 0;
    private int expo_A, expo_B;
    private float coef_A, coef_B, coef_C;

    public Polynomial addPoly(Polynomial A, Polynomial B) {
        degree_A = A.getDegree();
        degree_B = B.getDegree();
        expo_A = degree_A;
        expo_B = B.getDegree();
        if (degree_A >= degree_B)
            degree_C = degree_A;
        else
            degree_C = degree_B;

        Polynomial C = new Polynomial(degree_C);

        while (index_A <= degree_A && index_B <= degree_B) {
            if (expo_A > expo_B) {
                C.setCoef(index_C++, A.getCoef(index_A++));
                expo_A--;
            } else if (expo_A == expo_B) {
                C.setCoef(index_C++, A.getCoef(index_A++) + B.getCoef(index_B++));
                expo_A--;
                expo_B--;

            } else {
                C.setCoef(index_C++, B.getCoef(index_B++));
                expo_B--;
            }

        }

        return C;

    }
}

class Polynomial {
    private int degree;
    private float coef[] = new float[20];

    Polynomial(int degree, float coef[]) {
        this.degree = degree;
        this.coef = coef;
    }
    Polynomial(int degree) {
        this.degree = degree;
        for (int i = 0; i <= degree; i++)
            this.coef[i] = 0;
    }
    public int getDegree() {
        return this.degree;
    }
    public float getCoef(int i) {
        return this.coef[i];
    }
    public float setCoef(int i, float coef) {
        return this.coef[i] = coef;
    }
    public void printPoly() {
        int temp = this.degree;
        for (int i = 0; i <= this.degree; i++) {

            if (this.coef[i] == 0) {
                temp--;
            } else {
                if (temp == 0) {
                    System.out.printf("%3.0f", this.coef[i]); // coef[i]:계수 temp:차수
                } else {
                    System.out.printf("%3.0fx^%d", this.coef[i], temp--); // coef[i]:계수 temp:차수
                }
            }
        }
        System.out.println();
    }
}
