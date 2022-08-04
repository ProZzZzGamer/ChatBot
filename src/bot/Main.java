package bot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pozdrav ja sam Hazimova Kafana, napravljen sam 4.8.2022 u 14:07h.");

        System.out.println("Kako se zoveš?");

        Scanner unos = new Scanner(System.in);
        String ime = unos.nextLine();

        System.out.println(ime + " dobrodošao na server :D!");

    }
}