public class JavaZad3 {
    public static void main(String[] args) {
        String str = "Ala ma kota";
        char from = 'a';
        char to = 'o';

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == from) {
                chars[i] = to;
            }
        }
        String replaced = new String(chars);
        System.out.println(replaced);

        String str2 = "aabbbcc";
        char[] chars2 = str2.toCharArray();
        char prevChar = '\0';
        int writeIndex = 0;
        for (int i = 0; i < chars2.length; i++) {
            if (chars2[i] != prevChar) {
                chars2[writeIndex++] = chars2[i];
                prevChar = chars2[i];
            }
        }
        String replaced2 = new String(chars2, 0, writeIndex);
        System.out.println(replaced2);
    }
}
