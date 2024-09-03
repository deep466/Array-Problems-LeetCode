public class secLargest{
    public static void main(String [] args){
        int [] arr = {34,45,67,7,56,87,33};

        int Largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr){
            if (num > Largest){
                secondLargest = Largest;
                Largest = num;
            }
            else if (num>secondLargest && num < Largest){
                secondLargest = num ;
            }
        }
        System.out.println("second largest number is " + secondLargest);
    }
}