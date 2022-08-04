package bot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pozdrav ja sam Hazimova Kafana, napravljen sam 4.8.2022 u 14:07h.");

        System.out.println("Kako se zoveš?");

        Scanner unos = new Scanner(System.in);
        String ime = unos.nextLine();

        System.out.println(ime + " dobrodošao/la na server :D!");

        System.out.println("Da bi dalje nastavio/la konverzaciju, upiši ostatak broja svojih godina sa 3 i upiši u knzolu, tako sa 5 i 7. :D");

        int o3 = unos.nextInt();
        int o5 = unos.nextInt();
        int o7 = unos.nextInt();

        System.out.print("Tvoj broj godina je ");
        System.out.println((o3 * 70 + o5 * 21 + o7 * 15) % 105);
    }
}