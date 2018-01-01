import java.util.Arrays;

//bad..
public class problem41 {
    public static void main(String args[]) {
        int largestN = 0;
        for(int n = 1000000; n < 8000000; n++) {
            if(!isPrime(n)) {
                continue;
            } else {
                String target = "";
                for(int d = 1; d <= Integer.toString(n).length(); d++) {
                    target+=Integer.toString(d);
                }
                if(Integer.parseInt(sortedStringToArrayToString(Integer.toString(n)))==Integer.parseInt(target)) {
                    if(n>largestN) {
                        largestN = n;
                    }
                }
            }
        }
        System.out.println(largestN);
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
    static boolean isPrime(int n) {
        if(n == 1) { return false; }
        int counter = 0;
        for(int i = 2; Math.pow(i,2)-1 < n; i++) {
            if(n%i == 0) {
                counter++;
            }
            if(counter>0) {
                return false;
            }
        }
        return true;
    }
}