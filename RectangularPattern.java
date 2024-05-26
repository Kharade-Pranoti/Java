// To print Rectangular Pattern

public class Solution {
    public static void nForest(int n) {
        // outer loop: for rows
        for(int i=1; i<=n; i++){
            // inner loop: for cols
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Input : 3 
// Ouptut :
// * * * *
// * * * *
// * * * *
// * * * *
