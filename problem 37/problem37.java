public class problem37 {

    public static void main(String args[]) {
        int sum = 0;
        for(int i = 10; i < 1000000; i++) {
            if(truncatablePrime(i)) {
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println("sum: "+sum);
    }

    static boolean truncatablePrime(int number) {
        String numberString = Integer.toString(number);
        for(int r = 0; r < numberString.length(); r++) {
            String trunced="";
            trunced=numberString.substring(r, numberString.length());
            // System.out.println(trunced);
            if(isPrime(Integer.parseInt(trunced))) {
                continue;
            } else {
                return false;
            }
        }
        for(int l = 1; l < numberString.length(); l++) {
            String trunced="";
            trunced=numberString.substring(0, l);
            // System.out.println(trunced);
            if(isPrime(Integer.parseInt(trunced))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }
        int counter = 0;  
        for(int i = 1; Math.pow(i,2)-1 < n; i++) {
            if(n%i==0) {
                counter++;
            }
        }
        return counter==1;
    }
}