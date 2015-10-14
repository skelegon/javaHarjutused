package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {
        tabel();
    }

        public static void tabel() {
            int dim = 9;
            int laevadeArv = dim;
            int[][] laud = new int[dim][dim];

            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    laud[i][j] = 0;
                }
            }

            for (int i = 0; i < dim; i++) {
                int a = (int) Math.floor(Math.random() * dim);
                int b = (int) Math.floor(Math.random() * dim);
                if (laud[a][b] == 0) {
                    laud[a][b] = 1;
                } else {
                    i--;
                }
            }
            for (int i = 0; i < dim; i++) {
                System.out.println(Arrays.toString(laud[i]));
            }
        }

    public static void mang () {
        Scanner kasutaja = new Scanner(System.in);

        // Tuua loodud laud siia moodulisse
        // Kuidas kontrollida, kas laual on veel laevu?

        System.out.println("Sisesta X koordinaat");
        int x = kasutaja.nextInt();
        System.out.println("Sisesta Y koordinaat");
        int y = kasutaja.nextInt();
        if (laud[x][y] == 1) {
            System.out.println("Pihtas!");
            laud[x][y] = 2;
        } else if (laud [x][y] == 0) {
            System.out.println("Möödas!");
            laud [x][y]=3;
            else {
                System.out.println("Proovisid seda lahtrit juba!");
            }
        }
    }

    /*
    for (int i = 0; i < dim; i++) {
        for (int j = 0; j < dim; j++) {
            laud[i][j] = r();
        }
    }
    */


  //  Scanner kasutaja = new Scanner(System.in);

    /*while (gameover(laud)) {
        System.out.println(Arrays.toString(laud));
        System.out.println("Siesta üks nr");
        int sisestus = kasutaja.nextInt();
        int hit = laud[sisestus];
        if (hit == 0) {
            System.out.println("hahaa, mööda.");
        } else if (hit == 1) {
            System.out.println("ou fakk... pihtas");
            laud[sisestus] = 2;
        } else if (hit == 2) {
            System.out.println("jou, kuule....... sa juba lasid siin põhja.");
        }
    }

    System.out.println("Jee, võitsid (oli ka raske?)");
}

public static boolean gameover(int[] laud) {
    for (int i = 0; i < laud.length; i++) {
        if (laud[i] == 1) {
            return true;
        }
    }
    return false;
}
*/
    public static int r() {
        return (int) (Math.random() * 2);
    }
}





















