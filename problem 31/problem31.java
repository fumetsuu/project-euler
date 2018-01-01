public class problem31 {
    public static void main(String args[]) {
        int counter = 1;
        for(int h = 0; h <= 2; h++) {
            for(int f = 0; f <= 4; f++) {
                for(int t = 0; t <= 10; t++) {
                    for(int tn = 0; tn <= 20; tn++) {
                        for(int fv = 0; fv <= 40; fv++) {
                            for(int tw = 0; tw <= 100; tw++) {
                                for(int o = 0; o <= 200; o++) {
                                    if(100*h+50*f+20*t+10*tn+5*fv+2*tw+o==200) {
                                        counter++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}