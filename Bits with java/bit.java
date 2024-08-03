import java.util.Scanner;

public class bit {
    static void NOT(int x, String bit1, String bit2) {

        if (x == 1) {
            System.out.println("The Not operation in the first bit result in:");

            for (int i = 0; i < bit1.length(); i++) {

                if (bit1.charAt(i) == '1')
                    System.out.print('0');
                else
                    System.out.print('1');
            }
            System.out.println();
        } else if (x == 2) {
            System.out.println("The Not operation in the second bit result in:");
            for (int i = 0; i < bit1.length(); i++) {

                if (bit2.charAt(i) == '1')
                    System.out.print('0');
                else
                    System.out.print('1');
            }
            System.out.println();
        } else {
            System.out.println("The Not operation in the first bit result in:");
            for (int i = 0; i < bit1.length(); i++) {
                if (bit1.charAt(i) == '1')
                    System.out.print('0');
                else
                    System.out.print('1');
            }
            System.out.println();
            System.out.println("The Not operation in the second bit result in:");
            for (int i = 0; i < bit2.length(); i++) {
                if (bit2.charAt(i) == '1')
                    System.out.print('0');
                else
                    System.out.print('1');
            }
            System.out.println();
        }

    }

    static void Calc(int method, String bit1, String bit2) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < bit1.length(); i++) {
            switch (method) { // 1.OR 2.XOR 3.AND 4.NOT
                case 1:
                    if (bit1.charAt(i) == '1' || bit2.charAt(i) == '1')
                        System.out.print('1');
                    else
                        System.out.println('0');
                    break;
                case 2:
                    if (bit1.charAt(i) == '1' ^ bit2.charAt(i) == '1')
                        System.out.print('1');
                    else
                        System.out.print('0');
                    break;
                case 3:
                    if (bit1.charAt(i) == '1' && bit2.charAt(i) == '1')
                        System.out.print('1');
                    else
                        System.out.print('0');
                    break;
                default:
                    if(method!=4)
                    System.out.println("Wrong output, try again!");
                    break;

            }
            if(method ==4){
                System.out.print("Press one for the first bit, 2 for the second or 3 for both: ");
                int x = sc.nextInt();
            if (x > 0 && x < 4) {
                NOT(x, bit1, bit2); break;
            }   
            else
                continue;}
        }
        System.out.println();

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int again = 1;
        while (again != 0) {
            System.out.println("Type two bits with new line in between:");
            String strBit = sc.nextLine();
            String strBit2 = sc.nextLine();
            if (!(strBit.length() == strBit2.length()))
                continue;
            System.out.println("Choose: \n1.OR\n2.XOR\n3.AND\n4.NOT");
            int method = sc.nextInt();
            Calc(method, strBit, strBit2);
            System.out.println("Do you wish to continue? enter 1, otherwise enter 0");
            again = sc.nextInt();
        }

        sc.close();
    }
}
