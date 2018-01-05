import java.util.LinkedList;

public class problem46 {
    static LinkedList<Integer> primes = new LinkedList<Integer>();
    public static void main(String args[]) {
        primes.add(2);
        boolean found = false;
        int num = 5;
        while(!found) {
            num = findNextOC(num);
            if(!writableOC(num)) {
                System.out.println(num);
                found=true;
                break;
            }
        }
    }
    static boolean writableOC(int n) {
        addPrimesUpTo(n+100);
        for(int i = 0; primes.get(i) < n; i++) {
            double t = n - primes.get(i);
            double x = Math.sqrt((t)/2);
            if(x==Math.floor(x)) {
                return true;
            }
        }
        return false;
    }
    static int findNextOC(int num) {
        num++;
        while(isPrime(num) || num%2==0) {
            num++;
        }
        return num;
    }
    static void addPrimesUpTo(int n) {
        for(int i = primes.get(primes.size()-1)+1; i < n; i++) {
            if(isPrime(i)) {
                primes.add(i);
            }
        }
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