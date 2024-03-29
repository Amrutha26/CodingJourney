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
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
        for(int i=0; i<n; i++) {
            if(i==0 || i==n-1) {
                for(int j=1; j<=n; j++) {
                    System.out.print("*");
                }
            } else {
                for(int j=1; j<=n; j++) {
                    if(j==1 || j==n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            
            System.out.println();
        }
    }
}