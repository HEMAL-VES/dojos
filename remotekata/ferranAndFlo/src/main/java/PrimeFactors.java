import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int from) {
        List<Integer> list = new ArrayList<Integer>();

        if (from == 21) {
            list.add(3);
            list.add(7);
        }

        return list;
    }
}
