package com.example;

public class CommaRowWriter implements RowWriter {
    @Override
    public String writeRow(Contact c) {
        return c.name + "," + c.email + "," + c.phoneNumber;
    }
}
