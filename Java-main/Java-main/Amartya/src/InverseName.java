import java.util.Scanner;

public class InverseName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String n = s.nextLine();

        for (int i = n.length()-1; i >= 0; i--){
            System.out.printf("%c", n.charAt(i));
        }
        System.out.println();
    }
}
