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
        
        int size = 2*n-1;
        int mat[][] = new int[size][size];
        
        int left = 0;
        int right = size - 1;
        int top = 0;
        int bottom = size - 1;
        
        while(n > 0) {
            
            for(int i=left; i<=right; i++) {
                mat[top][i] = n;
            }
            
            for(int i=top; i<=bottom; i++) {
                mat[i][right] = n;
            }
            
            for(int i=right; i>=left; i--) {
                mat[bottom][i] = n;
            }
            
            for(int i=bottom; i>=top; i--) {
                mat[i][left] = n;
            }
            
            left++;
            right--;
            top++;
            bottom--;
            n--;
        }
        
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}