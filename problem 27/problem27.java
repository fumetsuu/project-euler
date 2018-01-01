public class problem27 {
    public static void main(String args[]) {
        int maxn = 0;
        int maxa = 0;
        int maxb = 0;
        for(int a = -1000; a < 1000; a++) {
            for(int b = -1000; b < 1000; b++) {
                if((a%2!=0 && b%2==0) || (a%2==0 && b%2!=0)) { continue; }
                int consecutiveCounter=0;
                int n = 0;
                while(true) {
                    if(isPrime((n*n)+a*n+b)) {
                        consecutiveCounter++;
                        n++;
                    } else {
                        if(consecutiveCounter>maxn) {
                            maxn=consecutiveCounter;
                            maxa = a;
                            maxb = b;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println("a="+maxa +'\n'+ "b="+maxb +'\n' + "n="+maxn);
    }
    static boolean isPrime(int n) {
        if(n==0||n==1) { return false; }
        int counter=0;
        for(int i = 1; i <= n/2; i++) {
            if(n%i==0) {
                counter++;
            }
        }
        if(counter==1) {
        return true;
        } else { 
        return false; 
        }
    }
}