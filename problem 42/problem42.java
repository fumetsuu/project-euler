import java.io.BufferedReader;
import java.io.FileReader;

public class problem42 {
    static String alphabet = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String args[]) {
        int counter = 0;
        String[] words = {};
        try {
        BufferedReader br = new BufferedReader(new FileReader("p042_words.txt"));
        words = br.readLine().replace("\"","").split(",");
        } catch(Exception e) {
            System.out.println(e);
        }
        for(int i = 0; i < words.length; i++) {
            if(isTriangleWord(words[i])) {
                counter++;
            }
        }
        System.out.println(counter);
    }
    static int wordToValue(String word) {
        int value = 0;
        for(int i = 0; i < word.length(); i++) {
            value+=alphabet.indexOf(word.charAt(i));
        }
        return value;
    }
    static boolean isTriangleNumber(int n) {
        //return true if 2*n can be expressed as x^2 + x
        int x = (int)Math.sqrt(2*n);
        return 2*n==x*(x+1);
    }
    static boolean isTriangleWord(String word) {
        return isTriangleNumber(wordToValue(word));
    }
}