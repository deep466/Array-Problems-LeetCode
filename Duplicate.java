import java.util.Set;
import java.util.HashSet;

public class Duplicate 
{
    public static void main (String [] args) {
        int [] arr = {1,2,3,4,2,1,3,5,7,5,7,3,8,9};

        Set<Integer> seen = new HashSet<> ();
        Set<Integer> duplicates = new HashSet<>();
        for(int num : arr ){
        if(seen.contains(num)){
            duplicates.add(num);
        }
        else {
            seen.add(num);
        }
      }
        System.out.println(duplicates);
    }
}