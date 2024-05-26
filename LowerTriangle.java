// To display the pattern of lower triangle with *

public class Solution {
    public static void nForest(int n) {
        // outer loop : rows
        for(int i=1; i<=n; i++){
            // inner loop :cols
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
