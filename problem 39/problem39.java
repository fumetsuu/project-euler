/* If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.

{20,48,52}, {24,45,51}, {30,40,50}

For which value of p ≤ 1000, is the number of solutions maximised? */

public class problem39 {
    public static void main(String args[]) {
        int maxSolutions = 0;
        int pValue = 0;
        for(int p = 0; p < 1000; p++) {
            int solutions = getSolutions(p);
            if(solutions > maxSolutions) {
                maxSolutions = solutions;
                pValue = p;
            }
        }
        System.out.println(pValue);
    }
    static int getSolutions(int p) {
        int solutions = 0;
        //a^2 + b^2 == c^2 and a+b+c == p
        for(int a = 1; a < p; a++) {
            for(int b = 1; b < p; b++) {
                double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
                if(a+b+c==p) {
                    solutions++;
                }
            }
        }
        return solutions;
    }
}