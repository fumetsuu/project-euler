import java.util.HashMap;
import java.util.Map;

public class problem26 {
    public static void main(String args[]) {
    int maxDecCount=0;
    int maxD=0;
        for(int i = 1; i < 1000; i++) {
            if(getDecCount(i)>maxDecCount) {
                maxDecCount=getDecCount(i);
                maxD=i;
            }
        }
        System.out.println("1 divided by "+maxD+" contains a "+maxDecCount+" digit recurring cycle.");
    }
    static int getDecCount(int n) {
        Map<Integer, Integer> decs = new HashMap<Integer, Integer>();
        int rm = 1;
        int counter = 0;
        while(!decs.containsKey(rm)) {
            decs.put(rm,counter);
            rm=rm*10 %n;
            counter++;
        }
        if(counter-decs.get(rm)==1){
            return 0;
        }
        return counter-decs.get(rm);
    }
}