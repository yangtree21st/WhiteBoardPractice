import java.util.*;

public class ReverseString {
    public static String reverseAstring(String s){

      return   new StringBuilder(s).reverse().toString();
    }


    public static void main(String[] args) {
        String example = "reversedString";
         isPalindrome(example);
        Integer [] array = new Integer[]{1,2,3,4,6,7,3,6,7,8,4,3,43,2,65,2};

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

        toAverage(arrayList);


        System.out.println(toAverage(arrayList));

    }
    public static  boolean isPalindrome (String s) {
        return reverseAstring(s).equals(s);
    }

    public static double toAverage(List<Integer> list){
         double b2 =  list.stream().
                    mapToDouble(d ->d)
                     .average()
                  .getAsDouble();
         return b2;


    }


}
