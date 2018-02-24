/**
 * PwnedPassword checker
 * Uses third-party service https://haveibeenpwned.com/Passwords
 *
 * This util does not collect any kind of personal information!
 *
 * @author nick
 * @version 0.1
 */

/**
 *  Main service which does the main work
 */

package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class PwnedPasswordService {

    /**
     * Block of constants
     */
    private final int INDEX_START = 0;
    private final int INDEX_END = 5;

    /**
     * Main method which rocks
     *
     * @param strPassToCheck contains password we want to check
     * @return string answer
     */
    public String checkHashedPassword(String strPassToCheck) {
        checkString(strPassToCheck);
        String answer, strHash = getSHA1Hash(strPassToCheck);
        checkString(strHash);
        int times = countOfHashesInBase(strHash);
        if (times != 0) {
            answer = "Your password found " + times + " times! It's better to change it.";
        } else {
            answer = "Looks like your password wasn't leaked!";
        }
        return answer;
    }

    /**
     * Method get map and search it with given hash
     *
     * @param strHash contains hash
     * @return count of times hash was found
     */
    private int countOfHashesInBase(String strHash) {
        Map<String, Integer> hashedPasswords = getSHA1HashesFromServer(strHash.substring(INDEX_START, INDEX_END));
        for (Map.Entry<String, Integer> entry : hashedPasswords.entrySet()) {
            if (entry.getKey().equals(strHash.substring(INDEX_END, strHash.length()))) {
                return entry.getValue();
            }
        }
        return 0;
    }

    /**
     * Method check of str is empty or null
     *
     * @param str
     */
    private void checkString(String str) {
        if (str == null || str.isEmpty()) throw new IllegalArgumentException("Request cannot be empty!");
    }

    /**
     * Method convert string to SHA-1 representation
     *
     * @param str contains String value
     * @return String SHA-1 representation of given string
     */
    private String getSHA1Hash(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.reset();
            md.update(str.getBytes(Charset.forName("UTF-8")));
            return new BigInteger(1, md.digest()).toString(16).toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method open connection and passes values to service then make a map with hashes and counts of them
     *
     * @param str contains first 5 chars of SHA-1 hash
     * @return HashMap which contains hashes and counts of them from service
     */
    private Map<String, Integer> getSHA1HashesFromServer(String str) {
        Map<String, Integer> hashedPasswords = new HashMap<>();
        try {
            URL url = new URL("https://api.pwnedpasswords.com/range/" + str);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/64.0.3282.167 Chrome/64.0.3282.167 Safari/537.36");
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                String[] args = inputLine.split(":");
                if (args.length == 2) hashedPasswords.put(args[0].trim(), Integer.valueOf(args[1].trim()));
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashedPasswords;
    }
}
