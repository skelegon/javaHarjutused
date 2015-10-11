package teema1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 *    tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 *    Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 *    arvu uuesti sisestada.
 *
 */
public class Harjutus2_meetodid {

    public static void main(String[] args) {
        System.out.println(tostaKuupi(3));
    }

    public static double tostaKuupi(int arv) {
        int temp = 1;
        int aste = 3;
        // return Math.pow(arv, 3);
        for (int i = 0; i < aste; i++) {
            temp = temp * arv;
        }
        arv = temp;
        return arv;
    }

    public static int kasutajaSisestus(String kysimus, int min, int max) {
        //Pooleli

        Scanner kasutaja = new Scanner(System.in);

        int algus = 0;
        int lopp = 100;
        int test = 0;

        while (test == 0) {
            System.out.println("Siesta üks nr");
            int num = kasutaja.nextInt();

            if (num > algus && num < lopp) {
                System.out.println("Number on lubatud vahemikus. Valitud number on " + num);
                test = test + 1;
            } else {
                System.out.println("Valitud arv ei sobi, sisesta uus nr");
            }
        }
        return 0;
    }
}



