package prgrms.level1.카카오_블라인드_채용;

public class 신규_아이디_추천 {

    public String solution(String new_id) {
        String answer = firstStep(new_id);
        answer = secondStep(answer);
        answer = thirdStep(answer);
        answer = fourthStep(answer);
        answer = fifthStep(answer);
        answer = sixthStep(answer);
        answer = seventhStep(answer);
        return answer;
    }

    private String firstStep(String id) {
        return id.toLowerCase();
    }

    private String secondStep(String id) {
        return id.replaceAll("[^-_.a-z0-9]", "");
    }

    private String thirdStep(String id) {
        while (id.contains("..")) {
            id = id.replace("..", ".");
        }
        return id;
    }

    private String fourthStep(String id) {
        if (id.length() > 0) {
            if (id.charAt(0) == '.') {
                id = id.substring(1, id.length());
            }
        }
        if (id.length() > 0) {
            if (id.endsWith(".")) {
                id = id.substring(0, id.length() - 1);
            }
        }
        return id;
    }

    private String fifthStep(String id) {
        if (id.length() == 0) {
            return "a";
        }
        return id;
    }

    private String sixthStep(String id) {

        if (id.length() >= 16) {

            id = id.substring(0, 15);

            if (id.charAt(id.length() - 1) == '.') {
                id = id.substring(0, id.length() - 1);
            }

        }

        return id;
    }

    private String seventhStep(String id) {
        while (id.length() <= 2) {
            id += id.charAt(id.length() - 1);
        }
        return id;
    }

}
