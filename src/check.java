import java.util.Scanner;

public class check {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num;
        for(int i=1;i<=10;i++){
            System.out.println("Enter a number:");
            num = input.nextInt();
            if (num % 2 == 0)
                System.out.println("The entered number is even");
            else
                System.out.println("The entered number is odd");
        }
    }
}
