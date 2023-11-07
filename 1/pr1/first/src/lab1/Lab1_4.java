package lab1;

import java.util.Scanner;

public class Lab1_4 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("BBEDITE KOJIU4ECTBO 4UCEJI: ");
            int count = in.nextInt();
            int sum = 0;
            int[] arr = new int[count];
            int i = 0;
            System.out.printf("BBEDUTE 4UCJIA: ");
            while (i < count) {
                arr[i] = in.nextInt();
                sum += arr[i];
                i++;
            }
            i = 1;
            int max = arr[0];
            int min = arr[0];
            do {
                if (arr[i] > max) {
                    max = arr[i];
                } else if (arr[i] < min) {
                    min = arr[i];
                }
                i++;
            } while (i < count);
            System.out.printf("CYMMA: %d, MAKCUMAJIHOE: %d, MUHUMAJIHOE: %d", sum, max, min);
        }
    }
}
