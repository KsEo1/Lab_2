public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        for (byte i = 100; i < 802; i++)
        {
            if (i == 200)
                break;
            System.out.println(i + "");

        }

        for ( short s = 5335; s < 5355; s++)
        {
            if (s == 5340)
                continue;
            System.out.println(s + "");
        }
        for ( long l = 802; l < 1400; l++) {
            if (l == 950)
                return;
            System.out.println(l + "");
        }




    }
}

