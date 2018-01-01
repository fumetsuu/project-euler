public class problem30 {
    public static void main(String args[]) {
        int totalSum=0;
        for(int i = 2; i < 1000000; i++) {
            int tempSum=0;
            for(int l = 0; l < Integer.toString(i).length(); l++) {
                tempSum+=Math.pow(Integer.parseInt((String.valueOf(Integer.toString(i).charAt(l)))),5);
            }
            if(tempSum==i) {
                totalSum+=tempSum;
            }
        }
        System.out.println(totalSum);
    }
}