package Tehtud;
import java.util.Arrays;

public class praks_2_1 {

    static int[] merge(int[] mas_1, int[] mas_2){
        int[] mas = new int[mas_1.length + mas_2.length];
        int count_1 = 0, count_2 = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas_1[count_1] < mas_2[count_2]){
                mas[i] = mas_1[count_1];
                count_1++;
            }else {
                mas[i] = mas_2[count_2];
                count_2++;
            }

            if (count_1 == mas_1.length){
                for (; count_2 < mas_2.length; count_2++) {
                    i++;
                    mas[i] = mas_2[count_2];
                }
                break;
            }
            if (count_2 == mas_2.length){
                for (; count_1 < mas_1.length; count_1++) {
                    i++;
                    mas[i] = mas_1[count_1];
                }
                break;
            }
        }

        return mas;
    }

    static int[] flip(int[] mas_1){
        int index = mas_1.length - 1;
        int[] mas = new int[index+1];
        for (int elem : mas_1) {
            mas[index] = -elem;
            index--;
        }
        return mas;
    }

    public static void main(String[] args) {
        int[] a = {-100, -10, 0, 17, 21, 40, 40, 100}, b = {-100, -2, 5, 17, 28};
        System.out.println("Algandmed: ");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("\nÜhildatud: ");
        System.out.println(Arrays.toString(merge(a, b)));

        System.out.println("\nPööratud:");
        System.out.println(Arrays.toString(flip(a)));
        System.out.println(Arrays.toString(flip(b)));
    }
}
