import java.util.*;


/**
 * Enjoy the Trip
 **/
public class idk  {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String homeCountry = in.next();
        int budget = in.nextInt();
        int N = in.nextInt(),num=0,c=0;
        String [] name = new String[N];
        boolean b = false;
        for (int i = 0; i < N; i++) {
            String country = in.next();
            
            int ticketCost = in.nextInt();
            if(budget-ticketCost>=0)
            budget-=ticketCost;
            else{
                b=true;
                name [c++] = country;
                num+=ticketCost;
            }
        }
        if(b){
System.out.println("BOOHISS\n"+num);
for (int i = 0; i < name.length; i++) {
    System.out.print(name[i]);
}}
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
else{
        System.out.println("YAY");
        System.out.println(budget);}
    }
}
