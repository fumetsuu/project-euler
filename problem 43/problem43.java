import java.util.Arrays;

public class problem43 {
    public static void main(String args[]) {
        long sum = 0l;
        for(long d = 1023456789l; d < 9876543210l; d++) {
            if(subStringsDivisible(d)) {
                if(isPandigital(d)) {
                    sum+=d;
                } else {
                    continue;
                }
            }
        }
        System.out.println(sum);
    }
    static boolean isPandigital(long p) {
        String orderedString = sortedStringToArrayToString(Long.toString(p));
        return orderedString.equals("0123456789");
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
    static int getNthPrime(int N) {
        switch(N) {
            case 1: return 2;
            case 2: return 3;
            case 3: return 5;
            case 4: return 7;
            case 5: return 11;
            case 6: return 13;
            case 7: return 17;
            default: return 1;
        }
    }
    static boolean subStringsDivisible(long d) {
        String dString = Long.toString(d);
        for(int a = 1; a <= 7; a++) {
            if(Integer.parseInt(dString.substring(a,a+3))%getNthPrime(a)==0) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}