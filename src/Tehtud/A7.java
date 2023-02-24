package Tehtud;

public class A7 {
    public static void main(String[] args) {
        String nimi = args[0];
        int kaal = Integer.parseInt(args[1]);
        double pikkus = Double.parseDouble(args[2]);

        double kmi = kaal / (pikkus*pikkus);
        if (kmi < 19){
            System.out.println(nimi + ", kanna raskustega jalanõusid, et tuulega ära ei lendaks");
        }
        else if (kmi < 25){
            System.out.println(nimi + ", võta rahulikult, elu on lill");
            }
            else {
                System.out.println(nimi + ", on vaja teha paar kätekõverdust");
            }
    }
}
