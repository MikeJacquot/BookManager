package com.company;

import java.util.Scanner;

public enum UserActions {


    EXIT(UserActions.exitValue, UserActions.exit),
    CREATE_LIBRARY("1", "Create a library"),
    DELETE_LIBRARY("2", "Delete a library"),
    ADD_BOOK("3", "Add book"),
    REMOVE_BOOK("4", "Remove book"),
    LIST_BOOK("5","List all books"),
    LIST_LIBRARIES("6","List libraries");

    private static final String exit = "Exit";
    private static final String exitValue = "0";
    private String value;
    private String desc;


    public String getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    UserActions(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }


        public static boolean containsAction(String value) {
           UserActions[] actions = UserActions.values();

            for (UserActions action : actions) {
                if (action.getValue().equalsIgnoreCase(value)) {
                    return true;
                }
            }

            return false;
        }

        public static String userInput(){
            Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
        }

}