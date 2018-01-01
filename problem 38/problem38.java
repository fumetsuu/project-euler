import java.util.Arrays;

public class problem38 {
    public static void main(String args[]) {
        for(int p = 1; p < 10000000; p++) {
            if(isPandigital(p)) {
                System.out.println(p);
            }
        }
    }
    static boolean isPandigital(int p) {
        String concatted="";
        for(int n = 1; n < 10; n++) {
            concatted+=Integer.toString(p*n);
            System.out.println(concatted);
            if(concatted.length() > 9) {
                continue;
            } else if(Integer.parseInt(sortedStringToArrayToString(concatted)) == 123456789) {
                return true;
            }
        }
        return false;
    }
    static String sortedStringToArrayToString(String string) {
        String retString = "";
        String[] stringArray = new String[string.length()];
        for(int i = 0; i < string.length(); i++) {
            stringArray[i] = String.valueOf(string.charAt(i));
        }
        Arrays.sort(stringArray);
        for(int i = 0; i < string.length(); i++) {
            retString+=stringArray[i];
        }
        return retString;
    }
}