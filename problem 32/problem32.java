import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class problem32 {
    public static void main(String args[]) {
        int answer = 0;
        HashMap<Integer,Integer> checker = new HashMap<Integer,Integer>();
        ArrayList<Integer> backer = new ArrayList<Integer>();
        for(int a = 1; a < 10000; a++) {
            for(int b = 1; b < 10000; b++) {
                String aS = Integer.toString(a);
                String bS = Integer.toString(b);
                String nS = Integer.toString(a*b);
                String addedStrings = aS+bS+nS;
                if(addedStrings.length()>9) { continue; }
                String[] addedArray = stringToArray(addedStrings);
                Arrays.sort(addedArray);
                if(Integer.parseInt(arrayToString(addedArray))==123456789) {
                    if(checker.containsKey(a*b)) {
                        continue;
                    } else {
                    System.out.println("a: "+a+" b: "+b+" n: "+(a*b));
                    backer.add(a*b);
                    checker.put((a*b),(a*b));
                    }
                }
            }
        }
        for(int backers:backer) {
            answer+=backers;
        }
        System.out.println(answer);
    }
    static String[] stringToArray(String string) {
        String[] stringArray = new String[string.length()];
        for(int i = 0; i < string.length(); i++) {
            stringArray[i]=String.valueOf(string.charAt(i));
        }
        return stringArray;
    }
    static String arrayToString(String[] stringArray) {
        String string="";
        for(int i = 0; i < stringArray.length; i++) {
            string+=stringArray[i];
        }
        return string;
    }
}