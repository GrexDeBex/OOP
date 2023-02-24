package Tehtud;

public class A4 {

    static int arvutus(int a, int b) {
        return a+b;
    }

    static int arvutus(double a) {
        return (int) Math.round(a*a);
    }

    static void arvutus(String a, int b){
        for (; b>0; b--) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        System.out.println(arvutus(1, 10));
        System.out.println(arvutus(1.9));
        arvutus("Kana", 3);
    }
}
