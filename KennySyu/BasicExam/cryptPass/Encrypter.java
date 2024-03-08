package cryptPass;

// import org.jasypt.util.text.BasicTextEncryptor;

import java.util.Scanner;

public class Encrypter {

    public static void main(String[] args) {
        // BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        // 設定密碼，與 application.properties 相同
        // textEncryptor.setPassword("CtWPbC7U2AgTAYJ6wnZXxH0RsIuOFGEe");

        System.out.println("Input string to encrypt: ");

        String encryptedText;

        try (Scanner scan = new Scanner(System.in)) {
            // encryptedText = textEncryptor.encrypt(scan.next());
            // System.out.println("Encrypted text: " + encryptedText);
        }

        // 解密之前加密的文本
        // System.out.println("Decrypted text: " +
        // textEncryptor.decrypt(encryptedText));
    }
}
