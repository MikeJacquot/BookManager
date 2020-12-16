package com.company.model;

import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Borrow {
    private LocalDateTime borrowDate;
    private String borrowerName;
    private LocalDateTime returnDate;



    public Borrow() {

    }

    public Borrow(LocalDateTime borrowDate, String borrowerName) {
        this.borrowDate = borrowDate;
        this.borrowerName = borrowerName;

    }

    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDateTime borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "Borrow {" +
                " borrowDate = " + borrowDate.format(format) +
                ", borrowerName = '" + borrowerName + '\'' +
                ", returnDate =" + returnDate.format(format) +
                '}';
    }
}
