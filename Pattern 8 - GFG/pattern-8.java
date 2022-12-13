//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj=new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        
        int odd = 2*n - 1;
        for(int i=n; i>=1; i--) {
            
            for(int k=1; k<=n-i; k++) {
                System.out.print(" ");
            }
            
            for(int j=1; j<=odd; j++) {
                System.out.print("*");
            }
            
            odd -= 2;
            
         
            
            System.out.println();
        }
    }
}