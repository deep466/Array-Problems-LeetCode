import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is a palindrome or not: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
        sc.close(); // Always close the Scanner when done
    }

    public static boolean isPalindrome(int num) {
        int rev = 0;
        int originalNum = num; // Store the original number to compare with reversed number
        
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return originalNum == rev;
    }
}
