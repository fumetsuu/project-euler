import java.math.BigInteger;
import java.util.Map;
import java.util.HashMap;

public class problem25 {
    static Map<Integer, BigInteger> threeMap = new HashMap<Integer, BigInteger>();

    public static void main(String args[]) {
        fib(4800);
        for(int n = 5; n < threeMap.size(); n++) {
            int longth = threeMap.get(n).toString().length();
            if(longth==1000) {
                System.out.println("Index number: "+n+" Fibonacci number: "+threeMap.get(n));
                break;
            }
        }
    }
    static Map fib(int index) {
        System.out.println("index("+1+"): "+"1");
        System.out.println("index("+2+"): "+"1");
        BigInteger x = new BigInteger("1");
        BigInteger y = new BigInteger("1");
        for(int i = 1; i < (index+1)/3; i++) {
            BigInteger z = x.add(y);
            threeMap.put((3*i),z);
            //System.out.println("index("+3*i+"): "+z);
            x = y.add(z);
            threeMap.put((3*i+1),x);
            //System.out.println("index("+(3*i+1)+"): "+x);
            y = x.add(z);
            threeMap.put((3*i+2),y);
            //System.out.println("index("+(3*i+2)+"): "+y);
        }
        return threeMap;
    }
}