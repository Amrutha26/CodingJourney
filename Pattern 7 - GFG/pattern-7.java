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
        
        int odd = 1;
        for(int i=1; i<=n; i++) {
            
            int totalSpaces = n - i;
            for(int j=1; j<=totalSpaces; j++) {
                System.out.print(" ");
            }
            
            
            for(int k=1; k<=odd; k++) {
                System.out.print("*");
                
            }
             odd +=2;
            
            System.out.println();
        }
    }
}