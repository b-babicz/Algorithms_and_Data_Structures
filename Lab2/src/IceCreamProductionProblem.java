import java.util.Scanner;

public class IceCreamProductionProblem {

//Wypisywanie kosztów dla każdej generowanej permutacji smaków lodów

        final static int N = 6; // permutacje n-elementowe
        private static int[] L = new int[N];

        static int [][] table = new int[N][N];


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            for(int i=0; i<=N-1; i++)
                for (int j=0; j<=N-1;j++)
                {
                    table[i][j]=sc.nextInt();
                }

            permutacje(0);
        }

        static void permutacje(int i) {
            System.out.println("permutacje(" + i + ") - START");
            if (i == N) {
                System.out.print(">>> PERMUTACJA: ");
                for (int j = 0; j < N; j++) {
                    System.out.print(L[j] + " ");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= N; j++) // j - element do wstawienia do tablicy
                {
                    System.out.println(" j = " + j);
                    int k; // index tablicy (miejsce wstawienia wartosci j)
                    for (k = 0; k < i; k++) {
                        System.out.println("  k = " + k);
                        if (L[k] == j) {
                            System.out.println("  break");
                            break;
                        }
                    }
                    if (k == i) {
                        L[k] = j;
                        System.out.println("L[k] = j : L[" + k + "]=" + j);
                        permutacje(i + 1);
                    }
                }
            }
            System.out.println("permutacje(" + i + ") - KONIEC");
        }


}
