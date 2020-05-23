package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContactsApplication {
    public ContactsApplication() {
        this.contacts = new ArrayList<>();
        Collections.addAll(
                this.contacts,
                new Contact("John Smith", "jsmith@example.com", "+447761234567"),
                new Contact("Jane Doe", "jane.doe@example.com", "+33123456789"),
                new Contact("Kate Smith", "katesmith@example.com", "+15551234567")
        );
    }

    public void run() {
        for (Contact c: this.contacts) {
            System.out.println(c.name);
        }
    }


    private final List<Contact> contacts;
}
