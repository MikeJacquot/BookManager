package com.company.exomembers;

import java.time.LocalDate;
import java.util.*;

public class Member {
    public Member(Long id, String firstName, String lastName, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Member() {

    }

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return (id + " - " + firstName + " - " + lastName);
    }

    public void fillMembersList() {



        Member member5 = new Member(1L, "Matt", "Bastard", null);
        Member member3 = new Member(2L, "John", "Fruschiante", null);
        Member member4 = new Member(3L, "Matthew", "Bellamy", null);
        Member member2 = new Member(4L, "Brandon", "Boyd", null);
        Member member1 = new Member(5L, "Tom", "Morello", null);
        ArrayList<Member> members = new ArrayList<>(Arrays.asList(member1,member2,member3,member4,member5));
        System.out.println("------------------");
        System.out.println("pas de tri ");
        System.out.println("------------------");
        for (Member member : members) {
            System.out.println(member.toString());
        }

        members.sort(new IdComparator());
        System.out.println("------------------");
        System.out.println("tri par Id ");
        System.out.println("------------------");
        for (Member member : members) {
            System.out.println(member.toString());
        }

        members.sort(new FirstNameComparator());
        System.out.println("------------------");
        System.out.println("tri par FirstName ");
        System.out.println("------------------");
        for (Member member : members) {
            System.out.println(member.toString());
        }

        members.sort(new LastNameComparator());

        System.out.println("------------------");
        System.out.println("tri par LastName ");
        System.out.println("------------------");
        for (Member member : members) {
            System.out.println(member.toString());
        }

    }


}