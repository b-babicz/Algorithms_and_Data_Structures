public class Main {
    public static void main(String[] args) {
        final int K = 5;
        final int N = 3;
        System.out.println(dwumianNewtona(K,N));
    }

    public static int dwumianNewtona(int k, int n)
    {
        if (n==k || k==0) {
            return 1;
        }
        else if (0<k && k<n && 0<n)
        {
            return dwumianNewtona(k-1,n-1)+dwumianNewtona(k,n-1);
        }
        else
            return 0;
    }


}