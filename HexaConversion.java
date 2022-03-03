package Mentee;
import java.util.Scanner;

public class HexaConversion {
    public static int hex_to_dec(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexa;
        int dec, i = 1, j;
        int bin[] = new int[100];
        int oct[] = new int[100];
        System.out.println("Enter the Hexadecimal num:");
        hexa = sc.nextLine();
        dec = hex_to_dec(hexa);
        System.out.println("Decimal num after conversion:" + dec);
        int dec1=dec;
        while (dec1>0) {
            bin[i++] = dec1 % 2;
            dec1 = dec1 / 2;
        }
        System.out.println("Binary number after conversion");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin[j]);
        }
        System.out.println();
        while (dec>0) {
            oct[i++] = dec % 8;
            dec = dec / 8;
        }
        System.out.println("Octal number after conversion");
        for (j = i - 1; j > 0; j--) {
            System.out.print(oct[j]);
        }
        System.out.println("\n");
    }
}

