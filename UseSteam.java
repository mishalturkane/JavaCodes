package cryptography;

import java.util.Scanner;

public class UseSteam {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
       SteamCipher sc=new SteamCipher();
        System.out.println("******************************** [Steam Cipher] ********************************");
        System.out.println("**    Select the option                                                       **");
        System.out.println("**    1.Encryption                                                            **");
        System.out.println("**    2.Decryption                                                            **");
        System.out.println("********************************************************************************");
        System.out.print("Enter:");
        int choice= kb.nextInt();
        switch (choice)
        {
            case 1:
                sc.encryption();
                break;
            case 2:
                sc.decryption();
                break;
            default:
                System.exit(0);
        }
    }

}
