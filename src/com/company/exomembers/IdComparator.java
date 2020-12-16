package com.company.exomembers;

import java.util.Comparator;

public class IdComparator implements Comparator<Member> {
    Member member = new Member();

    @Override
    public int compare(Member o1, Member o2) {

        if (o1.getId() < o2.getId()) {
            return -1;
        }
        if (o1.getId() == o2.getId()) {
            return 0;
        }
        return 1;
    }
}

