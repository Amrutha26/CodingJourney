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
        int ascii = 65;
    
        for(int i=1; i<=n; i++) {
            
            //spaces
            ascii = 65;
            for(int a=1; i<=n-a; a++) {
                System.out.print(" ");
            }
            
            //
            for(int j=1; j<=i; j++) {
                
                System.out.print((char)ascii);
                ascii++;
            }
            
            ascii -= 2;
            for(int k=1; k<=i-1; k++) {
                
                System.out.print((char)ascii);
                ascii--;
            }
            
            System.out.println();
        }
    }
}