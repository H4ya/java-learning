//this code will take a number and count the digits in it that can divide it without a reminder
import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n="1";
        while (n!="0"){
        n = in.nextLine();
        int num = Integer.parseInt(n),c=0;
        
        for(int i=0;i<n.length();i++){
            int nx = (n.charAt(i));
            nx-='0';
            if (nx!=0){
            if(num%nx==0) c++;}
        }
        System.out.println(c);
    }
    }
}
