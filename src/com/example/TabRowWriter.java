package com.example;

public class TabRowWriter implements RowWriter {
    @Override
    public String writeRow(Contact c) {
        return c.name + "\t" + c.email + "\t" + c.phoneNumber;
    }
}
