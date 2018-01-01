public class problem28 {
    public static void main(String args[]) {
        int sum = 1;
        int ref = 1;
        for(int i = 2; i <= 1000; i+=2) {
            for(int j = 1; j<=4; j++) {
                ref+=i;
                sum+=ref;
                System.out.println(sum);
            }
        }
    }
}