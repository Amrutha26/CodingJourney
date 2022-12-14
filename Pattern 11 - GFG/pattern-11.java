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
        for(int i=1; i<=n; i++) {
            
            boolean flag = false;
            if(i % 2 != 0) {
                for(int j=1; j<=i; j++) {
                    if(flag == false) {
                        System.out.print("1 ");
                        flag = true;
                    } else {
                        System.out.print("0 ");
                        flag = false;
                    }
                }
            } else {
                flag = false;
                 for(int j=1; j<=i; j++) {
                    if(flag == false) {
                        System.out.print("0 ");
                        flag = true;
                    } else {
                        System.out.print("1 ");
                        flag = false;
                    }
                }
            }
            
            System.out.println();
        }
    }
}

