import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int size = n * 2 + 1;

        int arr[][] = new int[size][size];

        if (n <= 0 || n > 9) {
            System.out.print("Error");
        } else {
            System.out.println('\n');
            int start = 0, end = size - 1;
            while(n!=0){
                for (int i = start; i <= end; i++) {
                    for (int j = start; j <= end; j++) {
                        if (i == start || i == end || j == start || j == end) {
                            arr[i][j] = n;

                        } else if (j == i && i == size / 2) {
                            arr[i][j] = 0;
                        }
                    }
                }
                start++;
                end--;
                n--;
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
