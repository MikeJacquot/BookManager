package com.company;

import java.util.Scanner;

public enum UserActions {


    EXIT(UserActions.exitValue, UserActions.exit),
    ADD_BOOK("1", "Add a book"),
    REMOVE_BOOK("2", "Remove a book"),
    BORROW_BOOK("3", "Borrow book"),
    RETURN_BOOK("4", "Return book"),
    LIST_BOOK("5","List all books"),
    LIST_LOANS("6","List all loans"),
    FILL_LIBRARY("7","Fill library for testing");

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