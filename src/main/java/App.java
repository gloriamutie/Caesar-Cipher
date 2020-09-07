import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password;
        int key;

        System.out.print("Enter the sentence: ");
        password = scanner.nextLine();

        do {
            System.out.print("Please enter a key between 1 to 25: ");
            key = scanner.nextInt();

            //checking  key errors
            if (key < 1 || key > 25) {
                System.out.printf(" Enter the correct key.It must be between 1 and 25, you entered %d.\n", key);
            }
        } while (key < 1 || key > 25);


        System.out.println("Password:\t" + password);
        Cipher cipher = new Cipher(password,key);
        String encryption = cipher.myCipher();
        System.out.println("Encrypted:\t" + encryption);

        //decryption
        Cipher cipherDec = new Cipher(encryption,-key);
        System.out.println("Decrypted:\t" + cipherDec.myCipher());

    }

}
