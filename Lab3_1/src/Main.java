import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random g = new Random();
        final int N = 1000;
        int a = 0;
        int b = 1000;
        final int szukana = g.nextInt(N);
        System.out.println(szukanaLiczba(szukana,a,b));

    }

    public static int szukanaLiczba(int szukana, int a, int b)
    {
        int p=(a+b)/2;

        if (szukana==p)
        {
            System.out.println("Znaleziono liczbę szukaną. Wynosi ona:");
            return szukana;
        }
        else if (szukana>p)
        {
            System.out.println("Propozycja jest za mała względem szukanej!");
            return szukanaLiczba(szukana,p+1,b);
        }
        else {
            System.out.println("Propozycja jest za duża względem szukanej!");
            return szukanaLiczba(szukana,a,p-1);
        }

    }
}