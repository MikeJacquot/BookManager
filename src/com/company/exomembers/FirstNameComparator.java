package com.company.exomembers;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Member> {

    public int compare(Member m1, Member m2) {
         {
            return (m1.getFirstName().compareTo(m2.getFirstName()));

    }
}}

