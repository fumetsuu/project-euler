public class problem36 {
    public static void main(String args[]) {
        int sum = 0;
        for(int i = 0; i < 1000000; i++) {
            if(isPalindrome(Integer.toString(i)) && isPalindrome(Integer.toBinaryString(i))) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    static boolean isPalindrome(String s) {
        int halfLength = s.length()/2;
        for(int f = 0; f < halfLength; f++) {
            if(s.charAt(f) == s.charAt(s.length()-f-1)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}