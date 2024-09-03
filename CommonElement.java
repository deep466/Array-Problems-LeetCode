import java.util.*;
public class CommonElement{

public static void commonElement(int[] arr1 , int[] arr2, int[] arr3){
    // Arrays.sort(arr1);
    // Arrays.sort(arr2);
    // Arrays.sort(arr3);
    int i=0,j=0,k=0;

    while(i<arr1.length && j< arr2.length && k< arr3.length){
        if (arr1[i] == arr2[j] && arr2[j]== arr3[k]){
            System.out.print(arr1[i]+" ");
            i++;
            j++;
            k++;
        }
        else if ( arr1[i]<arr2[j]){
            i++;
        }
        else if  ( arr2[j]<arr3[k]){
            j++;
        }

        else{
            k++;
        }
    }
     
}




    public static void main (String [] args){

        int [] arr1 = {2,3,4,5,6};
        int [] arr2 = {3,6,8,9,11,23};
        int [] arr3 = {2,3,6,7,8,9};
       
        commonElement(arr1,arr2,arr3);
        
    }
}