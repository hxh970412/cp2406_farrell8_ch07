import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args)
    {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer >>> ");
        num = input.nextInt();
        calEvenOdd(num);
    }
    public static void calEvenOdd(int a)
    {
        if (a % 2 == 0)
        {
            System.out.println( a + " is an even.");
        }
        else
        {
            System.out.println(a + " is an odd.");
        }
    }
}
