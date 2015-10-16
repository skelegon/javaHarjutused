package teema1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

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

    private static int dim =10;
    private static int[][] laud = new int[dim][dim];
    private static int laevadeArv = dim;
    private static String [] alfabeet = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V"};

    private static Boolean manglabi = false;

    public static void main(String[] args) {


        if(dim > alfabeet.length){
            System.out.println("Error - dim > " + alfabeet.length);
            return;
        }

        setStage();

        printMask();
        /*
        while(!manglabi){
            printMask();
            System.out.println("Sisesta ründevektor kujul: Täht, number");
            pomm(new Scanner(System.in).next());
        }
        */
    }

    public static void pomm(String input){
        String[] tykid = input.split(","); //"A,1"

        int Y = Arrays.asList(new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"}).indexOf(tykid[0]);
        int X = Integer.parseInt(tykid[1]) - 1;

       // System.out.println(Y + " " + X);

        if (laud [X][Y] == 1) {
            laud [X][Y] = 2;
            System.out.println("Pihtas!");
        } else if (laud [X][Y] == 0) {
            laud [X][Y] = 3;
            System.out.println("Möödas!");
        } else {
            System.out.println("Error! Õpi sisestama!");
        }

    }

    public static void setStage() {

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                laud[i][j] = 0;
            }
        }

        for (int i = 0; i < laevadeArv; i++) {
            int a = (int) Math.floor(Math.random() * dim);
            int b = (int) Math.floor(Math.random() * dim);
            if (laud[a][b] == 0) {
                laud[a][b] = 1;
            } else {
                i--;
            }
        }
        //printMask(laud, dim);


/*        int hitCounter = 0;
        Scanner kasutaja = new Scanner(System.in);

        while (hitCounter < dim) {
            System.out.println("Sisesta X koordinaat");
            int x = kasutaja.nextInt() - 1;
            System.out.println("Sisesta Y koordinaat");
            int y = kasutaja.nextInt() - 1;
            if (laud[y][x] == 1) {
                System.out.println("Pihtas!");
                laud[y][x] = 2;
                hitCounter++;
                System.out.println(hitCounter);
            } else if (laud[y][x] == 0) {
                System.out.println("Möödas!");
                laud[y][x] = 3;
            } else {
                System.out.println("Proovisid seda lahtrit juba!");
            }
        }
        System.out.println("Võit!");

        */
    }



/*    public static int sum(int laud[][], int dim) {
        int sum = 0;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                sum = sum + laud[i][j];
            }
        }
        return sum;
    }
*/
/*
public static String[][] mask = {
        {"**", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
        {"01", "", "", "", "", "", "", "", "", "", ""},
        {"02", "", "", "", "", "", "", "", "", "", ""},
        {"03", "", "", "", "", "", "", "", "", "", ""},
        {"04", "", "", "", "", "", "", "", "", "", ""},
        {"05", "", "", "", "", "", "", "", "", "", ""},
        {"06", "", "", "", "", "", "", "", "", "", ""},
        {"07", "", "", "", "", "", "", "", "", "", ""},
        {"08", "", "", "", "", "", "", "", "", "", ""},
        {"09", "", "", "", "", "", "", "", "", "", ""},
        {"10", "", "", "", "", "", "", "", "", "", ""},
};
    */

    private static void printMask() {

        String[][] mask = new String[laud.length+1][laud.length+1];
        mask [0][0] = "**";
        for (int i = 1; i < mask.length; i++) {
            System.arraycopy(alfabeet, 0, mask[0], 1, mask[0].length - 1);
            mask[i][0] = String.format("%02d", i);
        }


        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                mask[i + 1][j + 1] = korvutaja(laud[i][j]);
            }
        }
        for (String[] aMask : mask) {
            for (int j = 0; j < mask[0].length; j++) {
                System.out.print(aMask[j] + "|");
            }
            System.out.println();
        }
    }

    public static String korvutaja(int nr) {
        String a;
        switch (nr){
            case 3:
                a = "*";
                break;

            case 2:
                a = "X";
                break;

            /*
            case 1:
                a = "?";
                break;

            */

            default:
                a = Integer.toString(nr);
        }
        return a;
    }
}
