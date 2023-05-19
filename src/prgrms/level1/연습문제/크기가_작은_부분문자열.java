package prgrms.level1.연습문제;

public class 크기가_작은_부분문자열 {

    public int solution(String t, String p) {
        long pNumber = Long.parseLong(p);
        int pLength = p.length();

        int count = 0;
        for (int i = 0; i < t.length() - pLength + 1; i++) {
            String partOfT = t.substring(i, i + pLength);
            long partNumber = Long.parseLong(partOfT);

            if (partNumber <= pNumber) {
                count++;
            }
        }

        return count;
    }

}
