
public class leNumY{
    public static boolean seqsearch(int[] v, int key) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] w = {2, 8, 10, 18, 28, 25, 46, 74, 120, 194};
        if (seqsearch(w, 25)) {
            System.out.println("SIM ");
        } else {
            System.out.println("NÃO");
        }
    }
}
