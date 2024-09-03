import java.util.Scanner;

public class Factorial{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the start of the number");
        int start = sc.nextInt();
        System.out.println("Enter the end range of the number");
        int end = sc.nextInt();

        for (int j = start; j <= end; j++){
            int fact = 1;
            for (int i = 1; i<=j; i++){
                fact = fact * i;
            }
            System.out.println("Factorial of number "+j+" is "+fact);
        }

    }
}