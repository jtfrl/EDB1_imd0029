import java.util.ArrayList;
import java.util.List;

public class leNumZeroPos{
    public static List<Integer> seqsearchzeroPos(int[] v, int k) {
        List<Integer> pos=new ArrayList<>();
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 0) {
                pos.add(i);
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] w = {2, 8, 10, 1, 11, 0, 0, 26, 120, 146};
        List<Integer> zeroPos = seqsearchzeroPos(w, 0);
        System.out.println("Zero encontrado nas posições "+zeroPos);

    }
}
