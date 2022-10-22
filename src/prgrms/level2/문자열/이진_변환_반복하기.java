package prgrms.level2.문자열;

public class 이진_변환_반복하기 {

    public int[] solution(String s) {
        String beforeStr = s;
        StringBuilder sb = new StringBuilder();
        int transCount = 0;
        int zeroCount = 0;
        String endStr = "";

        while (true) {

            String sbStr = "";

            for (int i = 0; i < beforeStr.length(); i++) {

                char ch = beforeStr.charAt(i);

                if (ch == '1') {
                    sb.append("1");
                } else {
                    zeroCount++;
                }

                sbStr = sb.toString();
                endStr = Integer.toBinaryString(sbStr.length());
            }

            if (endStr.equals("1")) break;

            beforeStr = endStr;
            sb.setLength(0);
            transCount++;

        }

        return new int[]{transCount + 1, zeroCount};
    }

}
