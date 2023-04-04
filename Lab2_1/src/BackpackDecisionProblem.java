public class BackpackDecisionProblem {

    public static void main(String[] args) {

        final int N = 6; //stała odpowiadająca za ilość przedmiotów
        final int MAX_VOLUME = 10; //stała odpowiadająca za maksymalną objętość zajmowaną przez przedmiot

        int[] volume = new int[] {6,2,3,2,3,1}; //tablica z objętościami przedmiotów testowanych
        int[] value = new int[] {6,4,5,7,10,2}; //tablica z wartościami przedmiotów

        int vi,wi; //wi - suma wag dla wariantów, vi - suma objętości dla wariantów

        int maxValue = 0; 
        int b1,b2,b3,b4,b5,b6;
        int[] table = new int[N];
        for (b1 = 0; b1 <= 1; b1++)
            for (b2 = 0; b2 <= 1; b2++)
                for (b3 = 0; b3 <= 1; b3++)
                    for (b4 = 0; b4 <= 1; b4++)
                        for (b5 = 0; b5 <= 1; b5++)
                            for (b6 = 0; b6 <= 1; b6++)
                            {
                                vi=(b1*volume[0])+(b2*volume[1])+(b3*volume[2])+(b4*volume[3])+(b5*volume[4])+(b6*volume[5]);
                                if(vi<=MAX_VOLUME)
                                {
                                    wi=(b1*value[0])+(b2*value[1])+(b3*value[2])+(b4*value[3])+(b5*value[4])+(b6*value[5]);
                                    if(wi>maxValue)
                                    {
                                        maxValue=wi;
                                        table[0]=b1;
                                        table[1]=b2;
                                        table[2]=b3;
                                        table[3]=b4;
                                        table[4]=b5;
                                        table[5]=b6;

                                    }
                                }
                            }

        System.out.println("Wartość wszystkich przedmiotów umieszczonych w plecaku wynosi: " + maxValue);
        System.out.println("W plecaku są następujące przedmioty: ");
        for(int k = 0; k<N; k++)
        {
            if (table[k] == 1) System.out.print(k + " ");
        }

    }


}
