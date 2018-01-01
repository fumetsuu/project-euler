import java.util.HashMap;

public class problem29 {
    public static void main(String args[]) {
        HashMap<String, Integer> ab = new HashMap<String, Integer>();
        for(int a = 2; a <= 100; a++) {
            for(int b = 2; b <= 100; b++) {
                int[] bd = breakDown(a);
                String kii = Integer.toString(bd[0])+"^"+Integer.toString(bd[1]*b);
                if(ab.containsKey(kii)) { 
                } else {
                    ab.put(kii,1);
                }
            }
        }
        System.out.println(ab.size());
    }
    static int[] breakDown(int number) {
        int[] results = {number, 1};
            for(int i = 2; i <= number; i++) {
                for(int j = 2; j <= number; j++) {
                    if((int)Math.pow(i,j)==number) {
                        results[0]=i; results[1]=j;
                        return results;
                    } else if((int)Math.pow(i,j)>number) {
                        break;
                    }  
                }
            }
        return results;
    }
}