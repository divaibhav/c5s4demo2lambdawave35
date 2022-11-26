public class FactorialMain {
    public static void main(String[] args) {
        Factorial reference = number -> {
            int fact = 1;
            for (int i = 1; i <= 5 ; i++) {
                fact = fact * i;
            }
            return String.valueOf(fact);
        };
        System.out.println("reference.factorial(5) = " + reference.factorial(5));
    }
}
