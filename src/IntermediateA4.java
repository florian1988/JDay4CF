import java.util.Scanner;

public class IntermediateA4 {

    public static void A4(){

        Scanner ScannerNumber = new Scanner(System.in);

        System.out.print("write a number: ");
        int Number = ScannerNumber.nextInt();
        Number = Number +1;

        int sum = 0;

        for ( int i = 0; i < Number ; i++) {


            sum = sum + i;


        }
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        A4();
    }
}
