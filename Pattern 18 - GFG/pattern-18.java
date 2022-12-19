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
        
        int ascii = 64 + n;
        for(int i=1; i<=n; i++) {
            
            ascii = 64 + n;
            for(int j=1; j<=i; j++) {
                System.out.print((char)ascii + " ");
                ascii--;
            }
            
            System.out.println();
        }
    }
}