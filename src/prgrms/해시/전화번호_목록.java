package prgrms.해시;

import java.util.HashSet;

public class 전화번호_목록 {

    public boolean solution(String[] phone_book) {

        int phoneBookLength = phone_book.length;
        HashSet<String> stringHashSet = new HashSet<>();

        for (int i = 0; i < phoneBookLength; i++) {
            stringHashSet.add(phone_book[i]);
        }

        for(String hashString : stringHashSet){

            for (int i = 0; i < hashString.length(); i++) {

                if (stringHashSet.contains(hashString.substring(0, i))) {
                    return false;
                }

            }

        }

        return true;

    }

}
