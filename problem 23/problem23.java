import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class problem23 {

    static ArrayList<Integer> abundantList = new ArrayList<Integer>();
    static ArrayList<Integer> abundantListTwo = new ArrayList<Integer>();
    static Set<Integer> hs = new HashSet<>();

    public static void main(String args[]) {
    int testuptonum = 21000;
        for(int i=0; i < testuptonum; i++) {
            if(isAbundant(i)) {
                abundantList.add(i);
            }
        }

        for(int j=0; j<abundantList.size(); j++) {
            for(int p=0; p<abundantList.size(); p++) {
                int vale = abundantList.get(j)+abundantList.get(p);
                if (vale > testuptonum) {
                    continue;
                } else {
                    hs.add(vale);
                }
            }
        }

        abundantListTwo.addAll(hs);
        long res = 0;
        for(int n = 0; n < abundantListTwo.size(); n++) {
            res+=abundantListTwo.get(n);
        }
        int apsum = (1+testuptonum)*(testuptonum/2);
        System.out.println("answer: "+(apsum-res));


    }

    static Boolean isAbundant(int number) {
        int dSum = 0;
        for(int i = 1; i < number/2+1; i++) {
            if(number%i == 0) {
                dSum+=i;
            }
        }
        return dSum > number;
        }
    }

