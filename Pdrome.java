import java.util.Scanner;

public class Pdrome{
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number to check it is pallindrome or not");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println(num + " is a pallindrome");
        }
        else
        {
            System.out.println(num + " is not a pallindrome");
        }
           sc.close();    
        }

        public static boolean isPalindrome(int num){
            
            int originalNum = num;
            int rev = 0 ;
            while(num>0){
                
                int rem = num % 10 ;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            return originalNum == rev;
        }
    }