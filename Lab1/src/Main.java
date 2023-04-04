public class Main {
    public static void main(String[] args) {
        int a, b, c;
        int n=100;
        for (a = 1; a <= n; a++)
            for (b = a+1; b <= n; b++)
                for (c = b+1; c <= n; c++)
                    if (a * a + b * b == c * c) System.out.println(a + " " + b + " " + c);
    }
}