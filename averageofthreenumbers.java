import java.util.Scanner;

public class averageofthreenumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();


        double average = (number1 + number2 + number3) / 3;


        System.out.println("The average of the three numbers is: " + average);

        scanner.close();
    }
}

