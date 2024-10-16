
interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class pr22{
    public static void main(String[] args) {
        MyCalculator calculatorobj = new MyCalculator();
        int number = 6;
        System.out.println("Sum of divisors of " + number + ": " + calculatorobj.divisor_sum(number));
    }
}
