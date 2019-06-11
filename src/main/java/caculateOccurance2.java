import java.util.ArrayList;
import java.util.List;

public class caculateOccurance2 {
    public static void main(String[] args) {

        String str = "no no no there is yes and two string";

        String strFind = "no";
        String strYes = "yes";

        int numberNo = caculate(str,strFind);
        int numberYes = caculate(str,strYes);

        System.out.println("the no is appeard " + numberNo);
        System.out.println("the yes is appeard" + numberYes );
        System.out.println(numberNo == numberYes);
    }



    public static int caculate(String str, String strFind){
        int count = 0, fromIndex = 0;

        while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1 ){

            System.out.println("Found at index: " + fromIndex);
            count++;
            fromIndex++;

        }

        return count;
    }

    public static String[] packConsecutiveDuplicates(String[] array) {
        List removed = new ArrayList();
        for(int i = 0; i < array.length; i++){
            if(i + 1 != array.length) {
                String next = array[i];
                while(array[i].equals(array[i+1])){
                    next += array[i];
                    i++;
                    if (i + 1 == array.length)
                    {break;}
                }
                removed.add(next);
            } else {
                removed.add(array[i]);
            }
        }
        String[] combined = new String[removed.size()];
        removed.toArray(combined);
        return combined;
    }
    public static String[] packConsecutiveDuplicates2(String[] array) {
        List<String> arrList = new ArrayList<>();
        String str = array[0];
        for (int i = 1; i < array.length; i ++) {
            if (array[i].equals(array[i-1])) {
                str += array[i];
            } else {
                arrList.add(str);
                str = array[i];
            }
        }
        arrList.add(str);
        String [] packDups = arrList.toArray(new String[arrList.size()]);
        return packDups;
    }
}

