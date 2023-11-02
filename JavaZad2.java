import java.util.Scanner;

public class JavaZad2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadanie 2 czesc 1: \nUzytkownik podaje 2 lancuchy. Nalezy sprawdzic, czy sa takie same.");
        // poczatek zad 2 cz 1
        System.out.println("Podaj pierwszy lancuch: ");
        String str1 = scanner.nextLine();
        System.out.println("Podaj drugi lancuch: ");
        String str2 = scanner.nextLine();
        // Sprawdzanie lancuchow
        if (MojcompareTO(str1, str2) == 0)
            System.out.println(
                    "Sprawdzamy twoje lancuchy....\n....\n....\nWynik wyszedl, ze oba lancuchy sa rowne sobie.");
        else if (MojcompareTO(str1, str2) == 1)
            System.out.println(
                    "Sprawdzamy twoje lancuchy....\n....\n....\nWynik wyszedl, ze pierwszy lancuch jest dluzszy od drugiego.");
        else if (MojcompareTO(str1, str2) == -1)
            System.out.println(
                    "Sprawdzamy twoje lancuchy....\n....\n....\nWynik wyszedl, ze pierwszy lancuch jest krotszy od drugiego.");
        else
            System.out.println("Sprawdzamy twoje lancuchy....\n....\n....\nWynik wyszedl, ze cos poszlo nie tak.");

        // poczatek zad 2 cz 2
        System.out.println(
                "Zadanie 2 czesc 2: \nUzytkownik podaje lancuch. Nalezy sprawdzic, czy konczy sie on na podany przez uzytkownika znak.");
        System.out.println("Podaj lancuch: ");
        String str3 = scanner.nextLine();
        System.out.println("Podaj znak, na ktory chcesz sprawdzic, czy konczy sie lancuch: ");
        char suffix = scanner.nextLine().charAt(0);
        // Sprawdzanie lancucha
        if (MojendsWith(str3, suffix))
            System.out.println(
                    "Sprawdzamy twoj lancuch....\n....\n....\nWynik wyszedl, ze lancuch konczy sie na podany przez ciebie znak.");
        else
            System.out.println(
                    "Sprawdzamy twoj lancuch....\n....\n....\nWynik wyszedl, ze lancuch nie konczy sie na podany przez ciebie znak.");

        // poczatek zad 2 cz 3
        System.out.println(
                "Zadanie 2 czesc 3: \nUzytkownik podaje lancuch. Nalezy sprawdzic, na ktorej pozycji w lancuchu znajduje sie podany przez uzytkownika znak.");
        System.out.println("Podaj lancuch: ");
        String str4 = scanner.nextLine();
        System.out.println("Podaj znak, ktory chcesz wyszukac w lancuchu: ");
        char ch = scanner.nextLine().charAt(0);
        // Sprawdzanie lancucha
        if (MojindexOf(str4, ch) != -1)
            System.out.println("Sprawdzamy twoj lancuch....\n....\n....\nWynik wyszedl, ze znak " + ch
                    + " znajduje sie na pozycji " + MojindexOf(str4, ch) + " w lancuchu.");
        else
            System.out.println("Sprawdzamy twoj lancuch....\n....\n....\nWynik wyszedl, ze znak " + ch
                    + " nie znajduje sie w lancuchu.");

        // poczatek zad 2 cz 4
        System.out.println(
                "Zadanie 2 czesc 4: \nUzytkownik podaje lancuch. Nalezy zamienic w nim wszystkie wystapienia podanego przez uzytkownika znaku na inny podany przez uzytkownika znak.");
        System.out.println("Podaj lancuch: ");
        String str5 = scanner.nextLine();
        System.out.println("Podaj znak, ktory chcesz zamienic w lancuchu: ");
        char oldChar = scanner.nextLine().charAt(0);
        System.out.println("Podaj znak, na ktory chcesz zamienic znak " + oldChar + " w lancuchu: ");
        char newChar = scanner.nextLine().charAt(0);
        // Sprawdzanie lancucha
        System.out
                .println("Sprawdzamy twoj lancuch....\n....\n....\nWynik wyszedl, ze lancuch po zamianie wyglada tak: "
                        + Mojreplace(str5, oldChar, newChar));

        // poczatek zad 2 cz 5
        System.out.println(
                "Zadanie 2 czesc 5: \nUzytkownik podaje lancuch. Nalezy wypisac jego fragment od podanej przez uzytkownika pozycji do podanej przez uzytkownika pozycji.");
        System.out.println("Podaj lancuch: ");
        String str6 = scanner.nextLine();
        System.out.println("Podaj pozycje poczatkowa: ");
        int beginIndex = scanner.nextInt();
        System.out.println("Podaj pozycje koncowa: ");
        int endIndex = scanner.nextInt();
        // Sprawdzanie lancucha
        System.out.println("Sprawdzamy twoj lancuch....\n....\n....\nWynik wyszedl, ze fragment lancucha od pozycji "
                + beginIndex + " do pozycji " + endIndex + " wyglada tak: " + Mojsubstring(str6, beginIndex, endIndex));

        scanner.close();
    }

    public static int MojcompareTO(String str1, String str2) {
        int rezult = 0;
        if ((str1 != null && str2 != null) & str1.equals(str2)) {
            rezult = 0;
        } else if ((str1 == null && str2 == null) & str1.length() > str2.length()) {
            rezult = 1;
        } else if ((str1 == null && str2 == null) & str1.length() < str2.length()) {
            rezult = -1;
        }

        return rezult;
    }

    public static boolean MojendsWith(String slowo, char suffix) {
        boolean rezult = false;
        if (slowo != null && slowo.length() > 0) {
            char last = slowo.charAt(slowo.length() - 1);
            if (last == suffix) {
                rezult = true;
            }
        }
        return rezult;
    }

    public static int MojindexOf(String str, char ch) {
        int rezult = -1;
        if (str != null && str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    rezult = i;
                    break;
                }
            }
        }
        return rezult;
    }

    public static String Mojreplace(String str, char oldChar, char newChar) {
        String rezult = "";
        if (str != null && str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == oldChar) {
                    rezult += newChar;
                } else {
                    rezult += str.charAt(i);
                }
            }
        }
        return rezult;
    }

    public static String Mojsubstring(String str, int beginIndex, int endIndex) {
        String rezult = "";
        if (str != null && str.length() > 0) {
            for (int i = beginIndex; i < endIndex; i++) {
                rezult += str.charAt(i);
            }
        }
        return rezult;
    }
}
