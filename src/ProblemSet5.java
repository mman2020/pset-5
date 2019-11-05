/**
 * Problem Set 5.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section.
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {

    public static void main(String[] args) {
      ProblemSet5 ps = new ProblemSet5();
      System.out.println(ps.surroundMe("ckeyMou", "Mise"));
      System.out.println(ps.endsMeet("Kunay gFu", 3));
      System.out.println(ps.middleMan("Nooplsyes"));
      System.out.println(ps.isCentered("APCSA", "PCS"));
      System.out.println(ps.countMe("I am an example sentence", 'e'));
      System.out.println(ps.triplets("aaabbbccc"));
      // System.out.println(ps.addMe("Why was 6 scared of 7? Because 789."));
      // System.out.println(ps.sequence("Waaaaaaaaaaaaaaaaait, you know Jaaaaaaaaaaaaaaaaaaaake? Oh my goooooooooooooood!"));
      // System.out.println(ps.intertwine("I hswrsImgo.", "fti ok \' od"));
      // System.out.println(ps.isPalindrome("racecar"));
    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {
      if (!in.equals(null) & !out.equals(null) && out.length() == 4) {
        String firstHalf = out.substring(0, 2);
        String lastHalf = out.substring(2);
        String combinedString = firstHalf + in + lastHalf;
        return combinedString;
      } else {
        return in;
      }
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */

    public String endsMeet(String text, int n) {
      String firstPart;
      String lastPart;
      String firstLastPart;
      if (1 <= text.length() && text.length() <= 10 && 1 <= n && n <= text.length()) {
        firstPart = text.substring(0, n);
        lastPart = text.substring(text.length() - n);
        firstLastPart = firstPart + lastPart;

        return firstLastPart;
      } else {
        return text;
      }
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */

    public String middleMan(String text) {
      if (!text.equals(null) && text.length() % 2 == 1 && text.length() >= 3) {
        int startingString = (text.length() - 3) / 2;
        String middleString = text.substring(startingString, startingString + 3);

        return middleString;
      } else {
        return text;
      }
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */

    public boolean isCentered(String text, String target) {
      if (!text.equals(null) && text.length() % 2 == 1 && text.length() >= 3 && !target.equals(null) && target.length() == 3) {
        int startingString = (text.length() - 3) / 2;
        String middleString = text.substring(startingString, startingString + 3);

        if (middleString.equals(target)) {
          return true;
        } else {
          return false;
        }
      } else {
        return false;
      }
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */

    public int countMe(String text, char suffix) {
      int numWords = 0;

      if (!text.equals(null) && ((suffix >= 'a' && suffix <= 'z') || (suffix >= 'A' && suffix <= 'Z'))) {
        boolean firstWord = true;
        boolean newWord;
        for (int i = 0; i < text.length(); i++) {
          if (text.charAt(i) == ' ') {
            if(text.charAt(i - 1) == suffix) {
              numWords++;
            }
          } else if (i == text.length() - 1) {
            if (text.charAt(i - 1) == suffix) {
              numWords++;
            }
          }
        }
      } else {
        numWords = -1;
      }
      return numWords;
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */

    public int triplets(String text) {
      int numTriplets = 0;

      if (text != null) {
        for (char tripletLetter = 'a'; tripletLetter <= 'z'; tripletLetter++) {
          for (int i = 0; i < text.length() - 2; i++) {
            if (text.charAt(i) == tripletLetter && text.charAt(i + 1) == tripletLetter && text.charAt(i + 2) == tripletLetter) {
              numTriplets++;
            }
          }
        }
        for (char tripletLetter = 'A'; tripletLetter <= 'Z'; tripletLetter++) {
          for (int i = 0; i < text.length() - 2; i++) {
            if (text.charAt(i) == tripletLetter && text.charAt(i + 1) == tripletLetter && text.charAt(i + 2) == tripletLetter) {
              numTriplets++;
            }
          }
        }
      } else {
        numTriplets = -1;
      }
      return numTriplets;
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */

    public long addMe(String text) {
      int digitSum = 0;

    if (text != null) {
      for (int i = 0; i < text.length(); i++) {
        if (Character.isDigit(text.charAt(i))) {
          digitSum = digitSum + (Character.getNumericValue(text.charAt(i)));
        }
      }
    } else {
      digitSum = -1;
    }
    return digitSum;
    }

    // /*
    //  * Exercise 8.
    //  *
    //  * Given a string, compute the length of the longest sequence.
    //  */
    //
    // public long sequence(String text) {
    //
    // }
    //
    // /*
    //  * Exercise 9.
    //  *
    //  * Given two strings, return a new string built by intertwining each of the
    //  * characters of a and b.
    //  */
    //
    // public String intertwine(String a, String b) {
    //
    // }
    //
    // /*
    //  * Exercise 10.
    //  *
    //  * Given a string, determine whether or not it is a palindrome.
    //  */
    //
    // public boolean isPalindrome(String text) {
    //
    // }
}
