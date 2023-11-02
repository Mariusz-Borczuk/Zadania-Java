import java.util.Scanner;

public class JavaZad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Napisz wiad do zaszyfrowania: ");
        String text = scanner.nextLine();

        System.out.print("Wpisz co ile zmiana: ");
        int zmiana = scanner.nextInt();

        String encryptedText = encrypt(text, zmiana);
        System.out.println("Zaszywrowany tekst: " + encryptedText);
        scanner.close();
    }

    public static String encrypt(String text, int zmiana) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char zmienionyChar = (char) (ch + zmiana);

                if ((Character.isLowerCase(ch) && zmienionyChar > 'z') || (Character.isUpperCase(ch) && zmienionyChar > 'Z')) {
                    zmienionyChar = (char) (ch - (26 - zmiana));
                }

                result.append(zmienionyChar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
