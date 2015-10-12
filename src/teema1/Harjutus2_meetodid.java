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
        kasutajaSisestus(0, 100);
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

    public static void kasutajaSisestus(int min, int max) {
        Scanner kasutajaSisestus = new Scanner(System.in);

        while (true) {
            System.out.println("Siesta üks nr");
            int num = kasutajaSisestus.nextInt();

            if (num > min && num < max) {
                System.out.println("Number on lubatud vahemikus. Valitud number on " + num);
                break;
            } else {
                System.out.println("Valitud arv ei sobi, sisesta uus nr");
            }
        }
    }
}



