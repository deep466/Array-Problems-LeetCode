import java.util.HashSet;

public class containsDuplicate{

    public static boolean containsDuplicate(int [] arr){

        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr){
            if (seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main (String [] args){

        int [] arr = {1,1,1,3,3,4,3,2,4,2};

        boolean result = containsDuplicate(arr);
        
        System.out.println(result);

    }
}