package teema1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;

/**
 * Juhuslikkus
 *
 * 1. Kirjutada mäng kull ja kiri.
 *    Programm küsib kasutajalt: kas kull või kiri? "Viskab" mündi ja
 *    teatab, kas kasutaja arvas õigesti või mitte.
 *    Vihje: ära hakka jändama Stringidega, küsi kasutajalt number.
 *
 * 2. Kirjutada liisu tõmbamise programm.
 *    Küsida kasutajalt inimeste arv. Väljastada juhuslik number vahemikus 1
 *    kuni arv (kaasaarvatud).
 *    NB! Kontrollida, et töötab õigesti: st. öeldes mitu korda järjest
 *    arvuks 3, peab võimalike vastuste hulgas olema nii ühtesid, kahtesid kui kolmi.
 *
 * 3. Kirjutada täringumäng:
 *    Programm viskab kaks täringut mängijale ja kaks täringut endale
 *    (arvutile), arvutab mõlema mängija silmade summad ja teatab,
 *    kellel oli rohkem.
 */
public class Harjutus3_Juhuslikkus {
    public static void main(String[] args) {
        kullJaKiri();
        liist();
        taring();
    }

    public static void kullJaKiri() {
        Scanner sisestus = new Scanner(System.in);

        //double kordaja = Math.random();
        //Random kordaja = new Random();
        int vise = new Random().nextInt(2);

        System.out.println("Kas kull või kiri?");
        //String mynt = sisestus.next();

        while (true) {
            String mynt = sisestus.nextLine();
            //System.out.println(mynt != "kull");
            if (!mynt.equals("kull") && !mynt.equals("kiri")) {
                System.out.println("Õpi sisestama! Sobib ainult kull või kiri!");
                sisestus = new Scanner(System.in);
            } else {
                if ((mynt.equals("kull") && vise == 0) || (mynt.equals("kiri") && vise == 1)) {
                    System.out.println("Oujeah! Said täppi!");
                    break;
                } else {
                    System.out.println("Too bad, panid pange!");
                    break;
                }
            }
        }
    }

    public static void liist() {
        Scanner sisestus = new Scanner(System.in);
        System.out.println("Mitu mängijat?");
        int arv = sisestus.nextInt();
        System.out.println("Mängijaid on kokku " + arv + "tükki");
        int valik = new Random().nextInt(arv) + 1;
        System.out.println("Valituks osutus mängija " + valik);
    }

    public static int veere () {
        return new Random().nextInt(6) + 1;
    }
    public static void taring() {

        int mangijaSkoor = veere() + veere();
        int arvutiSkoor = veere() + veere();

        System.out.println("Mängija sai kokku " + mangijaSkoor + "punkti.");
        System.out.println("Arvuti sai kokku " + arvutiSkoor + "punkti.");

        if (mangijaSkoor > arvutiSkoor) {
            System.out.println("Võitsid!");
        } else if (arvutiSkoor < mangijaSkoor) {
            System.out.println("Kaotasid!");
        } else {
            System.out.println("Viik!");
        }
    }
}





