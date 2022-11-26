public class Main {
    public static void main(String[] args) {
        EvenOddCheck evenOddCheck = (number) -> number % 2 == 0;
        System.out.println(evenOddCheck.checkEven(10));
        System.out.println(evenOddCheck.checkEven(9));

    }
}
