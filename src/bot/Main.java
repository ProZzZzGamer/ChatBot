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

        System.out.println("Hvala na datim informacijama :D, sad trebaš uraditi verifikaciju da si čovjek a ne robot. Upiši neki broj");

        int br = unos.nextInt();
        int brojac = 0;

        while (brojac <= br) {
            System.out.println(brojac);
            brojac++;
        }
        System.out.println("Bravo prošao/la si verifikaciju :D.");

        System.out.println("Da bi imao pristup kanalima na serveru, imaš još jedan korak da ispuniš.");
        System.out.println("Zadnji korak za pristup svim kanalima je: moraš odgovoriti tačno na pitanje o programskom jeziku Javi.");
        System.out.println("Ovo pitanje će biti lahko, a i da pogriješiš imati ćeš šansu opet odgovoriti dok tačno ne odgovoriš.");
        System.out.println("Pa da počemo :D.");

        String pitanje = "Koja vrsta variable je \"Hazim\"?";

        String odgovor = "1. int";
        String odgovor2 = "2. String";
        String odgovor3 = "3. double";
        String odgovor4 = "4. char";

        System.out.println(pitanje);

        System.out.println(odgovor);
        System.out.println(odgovor2);
        System.out.println(odgovor3);
        System.out.println(odgovor4);

        System.out.println("Upiši broj pitanja kao odgovor (bez tačke).");

        int odgNaPitanje = unos.nextInt();
        while (odgNaPitanje != 2) {
            System.out.println("Nije tačno!");
            System.out.println("Pokušaj ponovo. Uspjeti ćeš :D");
            odgNaPitanje = unos.nextInt();
        }
        System.out.println("Odgovor je tačan :D, svaka čast sad imaš pristup svim kanalima.");
    }
}