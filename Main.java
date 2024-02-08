import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Enter Number for conversion");
        int num = console.nextInt();
        int binary = binary(num);
        System.out.println(binary);
    }
    public static int binary(int decimal){
        int place=1;
        int digit;
        int binary=0;

        if (decimal == 0){
            return 0;
        }
        while(decimal>0){
            decimal = decimal/2;
            digit = decimal%2;
            place =place *10;
            binary = binary + (digit * place);
        }
        return binary;

    }
}