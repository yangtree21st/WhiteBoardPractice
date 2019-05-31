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
}
