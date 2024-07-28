import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String sep = in.nextLine();
        String serie = in.nextLine(),current;
        char f=sep.charAt(0),l=sep.charAt(1);
        int index = 0,start=0,end,sum=0;
        /*for (int i=0;i<serie.length();i++){
            if(serie.charAt(i)==f){ start=i; f='\t';}
            if(serie.charAt(i)==l) index=i;
        }
        end=index;
        for(int i=start;i<end;i++){
            current = serie.charAt(i);
            if (Character.isDigit(current)){
                sum+= Integer.parseInt(current);
            }
        
        }*/
        start=serie.indexOf(f);end=serie.lastIndexOf(l);
        for(int i=start;i<end;i++){
            if(Character.isDigit(serie.charAt(i))){
                sum += serie.charAt(i)-'0';
            }


        }System.out.println(sum);
    }
}