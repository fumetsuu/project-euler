import java.util.ArrayList;

public class problem19 {

 public static void main(String args[]) {
    int[] monthdays = {31,28,31,30,31,30,31,31,30,31,30,31};
    ArrayList<Integer> fotm = new ArrayList<>(); //first day of the month in days
    int counter = 0;
    int dayspassed = 0; //only adds full months in days 
    for(int n=1901; n <= 2000; n++) {
        for(int m = 0; m < 12; m++) {
            int daystogo =0;
            if(m==1) {
                if(n%4 != 0) {
                     daystogo = monthdays[m];
                } else {
                     daystogo = monthdays[m]+1;
                }
            } else {
                     daystogo = monthdays[m];
            }
            dayspassed += daystogo;
            fotm.add(dayspassed+1);
            
        }    
    }
    for(int i=0; i < fotm.size(); i++) {
        if((fotm.get(i)-6)%7==0) {
            counter++;
        }
    }
    System.out.println(counter);
    }
}