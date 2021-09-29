import java.util.Scanner;
public class Q8 {
    static  void usingwhile() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();
        while (!word.equals("done")) {
            if
            (word.charAt(0) == word.charAt(word.length() - 1))
            {
                System.out.println("first and last character are equal for word" + word);
            }
            else
            {
                System.out.println("first and last character are not equal to word" + word);
            }

        word = scan.next();
    }

        }

    static void usingDoWhile() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();
        do {
            if (word.charAt(0) == word.charAt(word.length() - 1))
            {
                System.out.println("first and last character are equal for the word" + word);
            } else
            {
                System.out.println("first and last character are not equal to word" + word);
            }
            word = scan.next();
        } while (!word.equals("done"));
    }

    public static void main(String[] args) {
        System.out.println("using while loop");
        Q8.usingwhile();
        System.out.println("using do-while loop");
        Q8.usingDoWhile();
    }


}


