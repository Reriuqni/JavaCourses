/**
 * PwnedPassword checker
 * Uses third-party service https://haveibeenpwned.com/Passwords
 *
 * This util does not collect any kind of personal information!
 *
 * @author nick
 * @version 0.1
 */

package util;

import service.PwnedPasswordService;
import java.util.Scanner;

public class TestPwnedPasswordChecker {

    public static void main(String[] args) {

        System.out.print("Enter password to check: ");

        Scanner sc = new Scanner(System.in);

        String strPassToCheck = sc.nextLine().trim();

        PwnedPasswordService pwnedPasswordService = new PwnedPasswordService();

        String result = pwnedPasswordService.checkHashedPassword(strPassToCheck);

        System.out.println(result);
    }
}
