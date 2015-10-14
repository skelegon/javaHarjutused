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
    public static void main(String[] args) {
        numbrid(3);
        //     sonad(3);
        stringSort();
        xArvu();
    }

    public static void numbrid(int nr) {
        Scanner sisestus = new Scanner(System.in);
        int arvud[] = new int[nr];
        int reverse[] = new int[nr];

        for (int i = 0; i < nr; i++) {
            System.out.println("Sisesta arv");
            int arv = sisestus.nextInt();
            arvud[i] = arv;
        }
        System.out.println("Sisestatud arvud:");
        System.out.println(Arrays.toString(arvud));

        Arrays.sort(arvud);
        System.out.println("Sisestatud arvud järjestades väikseimast suurimani:");
        System.out.println(Arrays.toString(arvud));

        for (int j = nr; j > 0; j--) {
            reverse[j - 1] = arvud[nr - j];
        }
        System.out.println(Arrays.toString(reverse));
    }

    /*        public static void sonad (int nr) {
                Scanner sisestus = new Scanner(System.in);
                String [] sonad = new String [nr];
                String [] revSonad = new String [nr];

                for (int i = 0; i < nr; i++) {
                    System.out.println("Sisesta sõna");
                    String sona = sisestus.nextLine();
                    sonad [i]=sona;
                }
                System.out.println("Sisestatud sõnad:");
                System.out.println(Arrays.toString(sonad));

                Arrays.sort(sonad);
                System.out.println("Sisestatud sõnad tähestikujärjekorras:");
                System.out.println(Arrays.toString(sonad));

                for (int j = nr; j > 0; j--) {
                    revSonad[j-1] = sonad[nr-j];
                }
                System.out.println(Arrays.toString(revSonad));
            }
            */
    public static void stringSort() {
        String[] s = new String[10];
        System.out.println("Sisesta 10 sõne.");

        for (int i = 0; i < s.length; i++) {
            s[i] = new Scanner(System.in).next();
        }

        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        Arrays.sort(s, Collections.reverseOrder());
        System.out.println(Arrays.toString(s));
    }

    public static void xArvu(){
        ArrayList<Integer> numbrid = new ArrayList<>();

        System.out.println("Sisesta X numbrit, kui oled valmis sisesta 0, et printida sorteeritud kollektsioon");
        while(true){
            int nr = new Scanner(System.in).nextInt();
            numbrid.add(nr);
            if(nr == 0){
                break;
            }
        }

        Collections.sort(numbrid);

        for(int i:numbrid){
            System.out.print(i + " ");
        }
    }
}

