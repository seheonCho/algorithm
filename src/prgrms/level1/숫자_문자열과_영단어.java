package prgrms.level1.카카오_채용연계형_인턴십;

public class 숫자_문자열과_영단어 {

    public int solution(String s) {
        System.out.println(s);

        String[] mappingEng
                = new String[]{"zero","one","two","three","four",
                               "five","six","seven","eight","nine"};
        String[] mappingNum
                = new String[]{"0","1","2","3","4",
                               "5","6","7","8","9"};

        for (int i = 0; i < mappingEng.length; i++) {
            s = s.replaceAll(mappingEng[i], mappingNum[i]);
        }

        return Integer.parseInt(s);
    }

}
