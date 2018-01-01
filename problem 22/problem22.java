import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class problem22 {

    static char[] values = {'0', 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public static void main(String args[]) {

        String[] namedata = null;
        long score = 0;

        try{
            BufferedReader br = new BufferedReader(new FileReader("p022_names.txt"));
            namedata = br.readLine().replace("\"", "").split(",");
        } catch(Exception e){ 
            System.out.println(e);
        }

        Arrays.sort(namedata);
        for(int i=0; i < namedata.length; i++) {
            int tempscore = 0;
            for(int c=0; c<namedata[i].length(); c++) {
               tempscore += Arrays.binarySearch(values, namedata[i].charAt(c));
            }
            long nameScore = (1+i)*tempscore;
            score+=nameScore;
        }
        System.out.println(score);
        



    }
}