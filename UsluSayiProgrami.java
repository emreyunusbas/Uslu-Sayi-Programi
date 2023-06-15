import java.util.Scanner;

public class UsluSayiProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini girin: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini girin: ");
        int us = scanner.nextInt();

        int sonuc = 1;
        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        // Sonucu ekrana yazdırma
        System.out.println(taban + " üzeri " + us + " = " + sonuc);
    }
}