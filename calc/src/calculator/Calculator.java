package calculator;

public class Calculator implements CalculatorIF {

    public int sum(int m, int n) {
        while (n-- > 0) {
            m++;
        }
        return m;
    }

    public int divide(int m, int n) {
        int quotient = 0;
        while ((m-=n) > 0) {
            quotient++;
        }
        return quotient;
    }

    public int multiply(int m, int n) {
        return m*n;
    }

}
