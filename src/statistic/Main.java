package statistic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double[] X = new double[N];
        int i = 1;
        StringBuilder str = new StringBuilder();
        while (i <= N) {
            str.append(sc.next()).append(" ");
            i++;
        }
        String[] s = str.toString().split(" ");
        System.out.println(s.length);
        System.out.println(X.length);
        for (int j = 0; j < X.length; j++) {
            X[j] = Double.parseDouble(s[j]);
        }
        for (double x : X) {
            System.out.print(x + " ");
        }
        sc.close();

    }

}
