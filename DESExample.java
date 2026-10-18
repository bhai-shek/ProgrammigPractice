import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class DESExample {

    // Method to encrypt plaintext using DES
    public static String encrypt(String plainText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding"); // DES algorithm
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes); // convert to readable format
    }

    // Method to decrypt ciphertext using DES
    public static String decrypt(String encryptedText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        return new String(decryptedBytes);
    }

    public static void main(String[] args) {
        try {
            // 1. Generate a DES key
            KeyGenerator keyGen = KeyGenerator.getInstance("DES");
            SecretKey secretKey = keyGen.generateKey();

            // 2. Message to encrypt
            String message = "Hello DES";

            // 3. Encrypt the message
            String encrypted = encrypt(message, secretKey);
            System.out.println("Encrypted Text: " + encrypted);

            // 4. Decrypt the message
            String decrypted = decrypt(encrypted, secretKey);
            System.out.println("Decrypted Text: " + decrypted);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
