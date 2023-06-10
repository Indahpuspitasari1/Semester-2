import java.util.Scanner;

public class enkripsiKlasik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan pesan yang akan dienkripsi: ");
        String message = sc.nextLine();
        System.out.println("Masukkan kunci untuk Caesar cipher: ");
        int shift = sc.nextInt();
        String caesarCipher = caesarEncrypt(message, shift);
        System.out.println("Caesar cipher: " + caesarCipher);
        System.out.println("Masukkan kunci untuk Vigenere cipher: ");
        String key = sc.next();
        String vigenereCipher = vigenereEncrypt(message, key);
        System.out.println("Vigenere cipher: " + vigenereCipher);
        System.out.println("Masukkan matriks kunci untuk Hill cipher: ");
        int[][] keyMatrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                keyMatrix[i][j] = sc.nextInt();
            }
        }
        String hillCipher = hillEncrypt(message, keyMatrix);
        System.out.println("Hill cipher: " + hillCipher);
    }

    public static String caesarEncrypt(String message, int shift) {
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)) {
                ch = (char) (((ch - 'a' + shift) % 26) + 'a');
            }
            result += ch;
        }
        return result;
    }

    public static String vigenereEncrypt(String message, String key) {
        String result = "";
        for (int i = 0, j = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)) {
                ch = (char) ((ch + key.charAt(j) - 2 * 'a') % 26 + 'a');
                j = ++j % key.length();
            }
            result += ch;
        }
        return result;
    }

    public static String hillEncrypt(String message, int[][] keyMatrix) {
        String result = "";
        for (int i = 0; i < message.length(); i += 2) {
            int[] vector = new int[2];
            vector[0] = message.charAt(i) - 'a';
            vector[1] = message.charAt(i + 1) - 'a';
            int[] encryptedVector = new int[2];
            for (int j = 0; j < 2; j++) {
                encryptedVector[j] = 0;
                for (int k = 0; k < 2; k++) {
                    encryptedVector[j] += keyMatrix[j][k] * vector[k];
                }
                encryptedVector[j] %= 26;
            }
            result += (char) (encryptedVector[0] + 'a');
            result += (char) (encryptedVector[1] + 'a');
        }
        return result;
    }
}