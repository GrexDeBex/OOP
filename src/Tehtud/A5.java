package Tehtud;

public class A5 {

    static int JuhuPikkus(int alumine, int ylemine){
        return (int) Math.round(Math.random() * (ylemine - alumine) + alumine);
    }

    static int[] LastePikkused(int alumine, int ylemine, int laste_arv) {
        int[] Massiiv = new int[laste_arv];

        for (int i = 0; i < laste_arv; i++) {
            Massiiv[i] = JuhuPikkus(alumine, ylemine);
        }
        return Massiiv;
    }

    static double Harmoonia(int[] massiiv) {
        double sum = 0;
        for (double elem : massiiv){
            sum += 1/elem;
        }

        return massiiv.length/sum;
    }

    public static void main(String[] args) {
        int[] mini = LastePikkused(60, 100, 10);
        int[] micro = LastePikkused(101, 140, 15);
        int[] giga = LastePikkused(141, 200, 20);

        System.out.println("Väiksed lapsed:");
        for (int elem : mini){System.out.println(elem);}
        System.out.println("\nKeskmised lapsed:");
        for (int elem : micro){System.out.println(elem);}
        System.out.println("\nSuured lapsed:");
        for (int elem : giga){System.out.println(elem);}

        System.out.println("\nÜle 80:");
        for (int i = 0; i < mini.length; i++){
            int elem = mini[i];

            if (elem > 80) {
                System.out.println(elem);
            }
        }

        System.out.println("\nHarmooniline keskmine kõige suurematest lastest: " + Harmoonia(giga));

    }
}
