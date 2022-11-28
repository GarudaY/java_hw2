import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String string = "Это предложение содержит какие-то слова с большой длиной";

        System.out.println(Arrays.toString(metLongWord(string)));
    }


    public static String[] metLongWord(String splitText) {
        String[] array = splitText.split(" ");

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < 7) {
                array[i] = null;
                continue;
            }
            count++;
        }


        String[] arrResult = new String[count];
        count = 0;
        

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                arrResult[count] = array[i];
                arrResult[count] = arrResult[count].substring(0, 1).toUpperCase() + arrResult[count].substring(1, arrResult[count].length() - 1) + arrResult[count].substring(arrResult[count].length() - 1).toUpperCase();
                count++;
            }
        }
        return arrResult;
    }
}