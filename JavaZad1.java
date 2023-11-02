//Użytkownik podaje n łańcuchów. Należy zapamiętać łańcuch
//najdłuższy. Podać, ile ma znaków i go wypisać.
//Policzyć wystąpienia litery podanej przez użytkownika w łańcuchu

import java.util.Scanner;

public class JavaZad1 {
    public static void main(String[] args) throws Exception {
        Scanner scanerek = new Scanner(System.in);
        // Ile lancuchow chcesz porownywac?
        System.out.println("Podaj liczbe lancuchow, ktore chcesz porownywac:");
        int n = scanerek.nextInt();
        scanerek.nextLine(); // czyszczenie bufora
        // Wczytywanie lancuchow
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj lancuch nr " + (i + 1) + ": ");
            strings[i] = scanerek.nextLine().trim();
        }
        // Szukanie najdluzszego lancucha
        int max = strings[0].length();
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (strings[i].length() > max) {
                max = strings[i].length();
                index = i;
            } else if (strings[i].length() == max) {
                System.out.println("Lancuch nr " + (i + 1) + " ma tyle samo znakow co lancuch nr " + (index + 1));
            }
        }
        // Wypisywanie lancuchow
        for (int i = 0; i < n; i++) {
            System.out.println("Lancuch nr " + (i + 1) + " wyglada: \"" + strings[i] + "\" i ma " + strings[i].length()
                    + " znakow.");
        }
        // Wypisywanie najdluzszego lancucha
        System.out.println("Najdluzszy lancuch to: " + strings[index] + " i ma on " + max + " znakow.");
        // Wypisywanie wystapien znaku w lancuchu
        System.out.println("Podaj lancuch, w ktorym chcesz sprawdzic wystepowanie czestotliwosc dowolnego znaku: ");

        int j = scanerek.nextInt();
        String s = strings[j - 1];
        System.out.println("Podaj znaku, ktora chcesz policzyc w lancuchu " + j + ": ");
        char c = scanerek.next().charAt(0);
        // sprawdzanie wystapien
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Liczba wystapien litery " + c + " we wszystkich lancuchach to: " + count);
        scanerek.close();
    }
}