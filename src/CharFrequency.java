import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        char C = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                count++;
            }
        }

        System.out.println(count);
    }
}

