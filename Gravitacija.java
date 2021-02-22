import java.util.Scanner;

public class Gravitacija {
    private static final double GRAVITACIJSKA_KONSTANTA = 6.674 * Math.pow(10, -11);
    private static final double MASA_ZEMLJE = 5.972 * Math.pow(10, 24);
    private static final double POLMER_ZEMLJE = 6.371 * Math.pow(10, 6);

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nadVisina = sc.nextInt();
        izpis(nadVisina, izracunPospeska(nadVisina));

    }

    public static void izpis(double n, double k) {
        System.out.println(n);
        System.out.println(k);

    }

    public static double izracunPospeska(double nadVisina) {
        double gravitacijskiPospesek = (GRAVITACIJSKA_KONSTANTA * MASA_ZEMLJE)/Math.pow((POLMER_ZEMLJE + nadVisina), 2);
        return gravitacijskiPospesek;
    }
}
