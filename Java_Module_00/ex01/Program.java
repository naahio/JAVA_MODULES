import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 0 || number == 1)
        {
            System.out.println("IllegalArgument");
            System.exit (-1);
        }
        int i;
        for (i = 2 ; i < Math.sqrt(number) ; i++)
        {
            if (number % i == 0)
            {
                System.out.println("false " + (i - 1));
                System.exit(1);
            }
        }
        System.out.println("true "+ (i - 1));
        scanner.close();
    }
}
