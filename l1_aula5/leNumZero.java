public class leNumZero{
    public static int seqsearchzero(int[] v, int k) {
        int c=0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 0) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] w = {2, 8, 10, 1, 11, 0, 0, 26, 120, 146};
        System.out.println("Zero encontrado "+seqsearchzero(w, 0)+" vezes");

    }
}
