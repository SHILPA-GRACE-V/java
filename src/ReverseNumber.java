import java.util.Scanner;


public class ReverseNumber {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number, reverse = 0;
        System.out.println("Enter a number:");
        number = input.nextInt();
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
