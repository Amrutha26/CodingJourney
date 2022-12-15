//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        int spaces = 2*n - 2;
        for(int i=1; i<=n; i++) {
            
            // number 1
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
               
            }
            
            //spaces
            
            for(int k=1; k<=spaces*2; k++) {
                System.out.print(" ");
            }
            
            spaces -= 2;
            
            // number 2
            for(int l=i; l>=1; l--) {
                System.out.print(l + " ");
            
            }
            
            System.out.println();
        }
    }
}