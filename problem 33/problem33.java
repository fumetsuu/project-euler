public class problem33 {
    public static void main(String args[]) {
        double productA=1;
        double productB=1;
        for (double a = 10; a < 100; a++) {
            for (double b = 11; b < 100; b++) {
                if(a%10==0 || b%10 ==0 || a==b) {
                    continue;
                }
                double n = a/b;
                double a1 = Double.parseDouble(String.valueOf(Double.toString(a).charAt(0)));
                double a2 = Double.parseDouble(String.valueOf(Double.toString(a).charAt(1)));
                double b1 = Double.parseDouble(String.valueOf(Double.toString(b).charAt(0)));
                double b2 = Double.parseDouble(String.valueOf(Double.toString(b).charAt(1)));
                double divideResult=0;
                //oh well
                if(a2==b1) {
                    divideResult = a1/b2;
                }
                if(divideResult==n) {
                    productA=productA*a1;
                    productB=productB*b2;
                }
            }
        }
        System.out.println(productA+" / "+productB);
    }
}