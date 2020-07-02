import java.util.Scanner;

public class IntermediateA3 {

    public static void A3(){

        Scanner ScannerNumber = new Scanner(System.in);

        System.out.print("write the first number: ");
        int FNumber = ScannerNumber.nextInt();
        System.out.print("write the second number: ");
        int SNumber = ScannerNumber.nextInt();

        SNumber = SNumber + 1;
        int reminder;

        for ( int i = FNumber; i < SNumber; i++) {

            reminder = i % 2;
            if( reminder != 0)
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        A3();
    }
}
