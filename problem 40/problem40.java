public class problem40 {
    public static void main(String args[]) {
        //#region old
        String decimalString = "";
        int product = 1;
        int lengthCount = 0;
        for(int i = 0; i < 187500; i++) {
            String workingString = Integer.toString(i);
            decimalString+=workingString;
            lengthCount+=workingString.length();
        }
        for(int n = 0; n <= 6; n++) {
            product*=Integer.parseInt(String.valueOf(decimalString.charAt((int)(Math.pow(10,n)))));
        }
        System.out.println(product);
        //#endregion

        //#region
        // String s = "";
        // int l = s.length();
        // int x = 1;
        // int next = 1;
        // int prev = 0;
        // int sum = 1;
        // while(l < 1000000) {
        //     s = Integer.toString(x);
        //     l+=s.length();
        //     if(l>=next) {
        //         sum*=Integer.parseInt(String.valueOf(s.charAt(next-prev-1)));
        //         next*=10;
        //     }
        //     prev = l;
        //     x++;
        // }
        // System.out.println(sum);
        //#endregion
    }
}