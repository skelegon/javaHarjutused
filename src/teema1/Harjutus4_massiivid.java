package teema1;

import java.util.*;

/**
 * 1. Salvesta kasutajalt 10 numbrit ja sorteeri suuruse järgi. (int[])
 * 2. Salvesta kasutajalt 10 sõne ja sorteeri tähestikulises järjekorras. (String[])
 * 3. Salvesta kasutajalt x arv numbreid, lõpeta küsimine kui number on 0
 *    ja sorteeri tulemus suuruse järgi. (ArrayList)
 *
 * main() meetodi saad lühendiga psvm.
 */
public class Harjutus4_massiivid {
    public static void main (String[] args){
        numbrid(10);
    }
    public static void numbrid (int nr) {
        Scanner sisestus = new Scanner(System.in);
        int arvud [] = new int [nr];
        int reverse [] = new int [nr];

        for (int i = 0; i < nr; i++) {
            System.out.println("Sisesta arv");
            int arv = sisestus.nextInt();
            arvud[i]=arv;
        }
        System.out.println("Sisestatud arvud:");
        System.out.println(Arrays.toString(arvud));

        Arrays.sort(arvud);
        System.out.println("Sisestatud arvud järjestades väikseimast suurimani:");
        System.out.println(Arrays.toString(arvud));

        // Miks järgnev ei toimi?
       for (int j = nr; j > 0; j--) {
            int l = nr - j;
            reverse[j] = arvud[l];
        }
        System.out.println(Arrays.toString(reverse));
    }
}

