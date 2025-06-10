package level0.day1;

public class Day1_2 {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for (int i = 0; i < change.length; i++) {
            usage += usage * change[i] / 100;
            total_usage += usage;
            if (total_usage > storage) {
                return i;
            }
        }
        return -1;
    }
}
