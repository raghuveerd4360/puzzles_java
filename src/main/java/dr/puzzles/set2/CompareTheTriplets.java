package dr.puzzles.set2;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> ret = new ArrayList<>(2);

        Integer aScore = 0;
        Integer bScore = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aScore++;
            } else if (a.get(i) < b.get(i)) {
                bScore++;
            }
        }

        ret.add(aScore);
        ret.add(bScore);

        return ret;

    }
}
