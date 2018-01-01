public class problem35 {
    public static void main(String args[]) {
        int counter = 0;
        for(int n = 1; n < 1000000; n+=2) {
            if(isPrime(n)) {
                if(isArrayPrime(circulars(n))) {
                    counter++;
                }
            } else { continue; }
        }
        System.out.println(counter);
    }
    static int[] circulars(int n) {
        String nString = Integer.toString(n);
        String[] nArray = stringToArray(nString);
        int[] resultArray = new int[nString.length()];
        for(int a = 0; a < nString.length(); a++) {
            String temp = "";
            for(int b = a; b < nString.length()+a; b++) {
                if(b>=nString.length()) {
                    temp+=nArray[b-nString.length()];
                } else {
                    temp+=nArray[b];
                }
            }
            resultArray[a] = Integer.parseInt(temp);
        }
        return resultArray;
    }
    static String[] stringToArray(String string) {
        String[] stringArray = new String[string.length()];
        for(int i = 0; i < string.length(); i++) {
            stringArray[i] = String.valueOf(string.charAt(i));
        }
        return stringArray;
    }
    static boolean isArrayPrime(int[] n) {
        int counter = 0;
        for(int i = 0; i < n.length; i++) {    
            for(int j = 1; Math.pow(j,2) < n[i]; j++) {
                if(n[i]%j==0) {
                    counter++;
                }
            }
        }
        return counter==n.length;
    }
    static boolean isPrime(int n) {
        int counter = 0;  
        for(int i = 1; Math.pow(i,2) < n; i++) {
            if(n%i==0) {
                counter++;
            }
        }
        return counter==1;
    }
}