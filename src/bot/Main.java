package bot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pozdrav ja sam Hazimova Kafana, napravljen sam 4.8.2022 u 14:07h.");

        System.out.println("Kako se zoveš?");

        Scanner unos = new Scanner(System.in);
        String ime = unos.nextLine();

        System.out.println(ime + " dobrodošao na server :D!");
        // TODO napravi da bot pogodi koliko godina
        // godine = (ostatak3 * 70 + ostatak5 * 21 + ostatak7 * 15) % 105
        // bot treba uzeti ostatak3/5/7 iz unosa, te varijable predstavljaju ostatak od dijeljenja korisnikovih godina sa tim brojevima.
    }
}