import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int H = scanner.nextInt();

        int[] sequence = new int[N];
        int[] marks = new int[N];

        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            marks[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int currentSum = 0;
            int markedCount = 0;

            for (int j = i; j < N; j++) {
                currentSum += sequence[j];
                markedCount += marks[j];

                if (markedCount >= L && markedCount <= H) {
                    maxSum = Math.max(maxSum, currentSum);
                } else if (markedCount > H) {
                    break;
                }
            }
        }

        System.out.println(maxSum);

        scanner.close();
    }
}

