import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        // Input the string of length 10
        String X = sc.nextLine();

        // Chef's lucky letter is the 7th character in the string
        char chefLuckyLetter = X.charAt(6);

        // Output Chef's lucky letter
        System.out.println(chefLuckyLetter);

        sc.close();
    }
}
