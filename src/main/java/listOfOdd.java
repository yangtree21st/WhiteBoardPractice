import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listOfOdd {

    public static List<Integer> listOfOdd(List<Integer> list) {
        List<Integer> result = list.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());

        return result;

    }




    public static void main(String[] args) {


    ArrayList<Integer> list= new ArrayList<>();

       list.add(1);
      list.add(5);
      list.add(10);
      list.add(20);
      list.add(23);
      list.add(24);
        System.out.println(list);
      System.out.println(listOfOdd(list));

}
}
