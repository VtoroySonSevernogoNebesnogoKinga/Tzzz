import java.util.Scanner;

class Main {
    static int result;
    static int num1;
    static int num2;
    static char op;
    static String finalResult;

    public static void main(String[] args) throws Exception {

        System.out.println("Enter two numbers and the operation sign in the format [2 + 2]:");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        calc(s);
    }

    public static String calc(String input) throws Exception {

        String[] numbers = input.split(" ");

        if (numbers.length != 3) {
            throw new Exception("Exception in input line");
        }

        try {
            num1 = Integer.parseInt(numbers[0]);
            op = numbers[1].charAt(0);
            num2 = Integer.parseInt(numbers[2]);
            result = operations(num1, op, num2);
        } catch (Exception e) {
            System.out.println(e);
        }

        return finalResult = "" + result;
    }

    private static int operations(int num1, char op, int num2) throws Exception {
        check(num1, num2);
        return switch (op) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> throw new Exception("Invalid operator!");
        };
    }

    private static void check(int num1, int num2) throws Exception {
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new Exception("You can input only 1 - 10 numbers.");
        }
    }
}