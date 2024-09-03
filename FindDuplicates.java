import java.util.HashSet;
import java.util.Set;

public class FindDuplicates{
    public static void main (String [] args)
    {
//         int [] arr = {1,2,3,4,5,2,3,6};
//         Set<Integer> seen = new HashSet<>();
//         Set<Integer> duplicate = new HashSet<>();

//         for (int num : arr) {
//             if(seen.contains(num)){
//                 duplicate.add(num);
//             }else{
//                 seen.add(num);
//             }
//         }
//         System.out.println("Duplicates elements: "+duplicate);
     
     int [] arr = {2,3,4,5,6,2,3,6};
     Set<Integer> seen = new HashSet<> ();
     Set<Integer> duplicate = new HashSet<>();

     for (int num : arr){
        if(seen.contains(num)){
            duplicate.add(num);
        }else {
            seen.add(num);
        }
     }
     System.out.println("Duplicates element is : "+ duplicate);
     }
 }

