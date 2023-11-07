package lab1;

import java.util.Scanner;

public class Lab1_3 {
    public Lab1_3() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("BBEDUTE KOJIU4ECTBO 4UCEJI: ");
            int num = in.nextInt();
            int sum = 0;
            int[] arr = new int[num];
            System.out.printf("BBEDUTE 4UCJIA: ", num);
            int i = 0;

            while(true) {
                if (i >= num) {
                    System.out.printf("CYMMA: %d, CPEDHEE: %d", sum, sum / num);
                    break;
                }

                arr[i] = in.nextInt();
                sum += arr[i];
                ++i;
            }
        } catch (Throwable var7) {
            try {
                in.close();
            } catch (Throwable var6) {
                var7.addSuppressed(var6);
            }

            throw var7;
        }

        in.close();
    }
}