import java.util.Arrays;

public class Tasks1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 6, 5, 6};
        Arrays.sort(a);
        for (int j = 0; j < a.length; j++) {
            System.out.println("Posortowana tablica: " + a[j]);
        }
        for (int i = 0; i < a.length; i++) {
            for (int k = i + 1; k < a.length; k++) {
                if (a[i] == a[k]) {
                    System.out.println("W tablicy są dwa indeksy o wartości: " + a[i]);
                }
            }
        }
    }


}
