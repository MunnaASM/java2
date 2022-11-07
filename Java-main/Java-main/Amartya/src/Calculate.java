import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Add ad = new Add();
        Subtract su = new Subtract();
        Multiply mu = new Multiply();
        Division di = new Division();

        double v1 = s.nextDouble();
        char op = s.next().charAt(0);
        double v2 = s.nextDouble();

        double ans = 0.0;

        switch (op){
            case '+':
                ans = ad.calculation(v1, v2);
                break;
            case '-':
                ans = su.calculation(v1, v2);
                break;
            case '*':
                ans = mu.calculation(v1, v2);
                break;
            case '/':
                ans = di.calculation(v1, v2);
                break;
        }

        System.out.println(ans);
    }
}
