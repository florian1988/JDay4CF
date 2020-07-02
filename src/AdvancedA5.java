import java.util.Scanner;

public class AdvancedA5 {

    public static void A5(){

        Scanner ScannerNumber = new Scanner(System.in);

        System.out.print("Write a number: ");

        int InputNumber = ScannerNumber.nextInt();
        int FoundItems = 0;
        int[] items = {
            10, 20, 30, 40, 50, 60, 10, 20, 30, 40, 50, 60, 15,
        };

        for ( int i = 0; i < items.length; i++) {

            if (items[i] == InputNumber){
                FoundItems = FoundItems + 1;
            }
        }
        if ( FoundItems == 1) {
            System.out.print(FoundItems + " item found!");
        } else if(FoundItems != 0){
            System.out.print(FoundItems + " items found!");
        } else {
            System.out.print("No items found");
        }
    }

    public static void main(String[] args) {
        A5();
    }
}
