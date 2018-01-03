public class problem45 {
    public static void main(String args[]) {
        int counter = 0;
        double testingNumber = 2;
        while(counter!=2) {
            if(isTriangle(testingNumber) && isPentagonal(testingNumber) && isHexagonal(testingNumber)) {
                System.out.println(testingNumber);
                counter++;
            }
            testingNumber++;
        }
    }
    static boolean isTriangle(double n) {
        double pn = (Math.sqrt(8*n+1)-1)/2;
        return pn == Math.ceil(pn);
    }
    static boolean isPentagonal(double n) {
        double pn = (Math.sqrt(1+24*n)+1)/6;
        return pn == Math.ceil(pn);
    }
    static boolean isHexagonal(double n) {
        double pn = (Math.sqrt(1+8*n)+1)/4;
        return pn == Math.ceil(pn);
    }
}