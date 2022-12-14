//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            Solution ob = new Solution();
            ob.printDiamond(n);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    void printDiamond(int n) {
        for(int i=1; i<=2*n; i++) {
            
            // spaces
            
            if(i<=n+1) {
                for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
              }
            }else {
                for(int j=1; j<= i-n-1; j++) {
                    System.out.print(" ");
                }
            } 
            
            // star
            
            if(i <=n) {
                for(int k=1; k<=i; k++) {
                System.out.print("* ");
              }
            } else {
                for(int k=1; k<=(2*n - i) + 1; k++) {
                    System.out.print("* ");
                }
            }
            
            
            System.out.println();
        }
    }
}
