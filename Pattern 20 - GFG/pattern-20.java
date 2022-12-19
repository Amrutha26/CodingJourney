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
        
        int a = 1;
        int b = 2*n-2;
        
        int c = n-1;
        int d = 2;
        
        for(int i=1; i<2*n; i++) {
            
            if(i<=n) {
                
                //stars
                for(int j=1; j<=a; j++) {
                    System.out.print("*");
                }
                
                //spaces
                for(int k=1; k<=b; k++) {
                    System.out.print(" ");
                }
                b -= 2;
                
                //stars
                for(int l=1; l<=a; l++) {
                    System.out.print("*");
                }
                a++;
            } else {
                
                //stars
                for(int j=1; j<=c; j++) {
                    System.out.print("*");
                }
                
                //spaces
                for(int k=1; k<=d; k++) {
                    System.out.print(" ");
                }
                d += 2;
                
                //stars
                 for(int l=1; l<=c; l++) {
                     System.out.print("*");
                 }
                 c--;
                }
                
                System.out.println();
           
            }
        }
    }
