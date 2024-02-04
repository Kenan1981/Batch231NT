package Alistirmalar;

public class Elmas_Deseni {
    public static void main(String[] args) {

        int satirSayisi = 9;

        for (int i = 1; i < satirSayisi; i++) {

            for (int j = satirSayisi - i; j > 0; j--) {

                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print(i + " ");
            }
            System.out.println();
        }
        int input = 8;

        for (int i = input - 1; i > 0; i--) {

            for (int j = 0; j < satirSayisi - i; j++) {

                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {

                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
