# Interface exercise

You're building a simple application to manage contacts and right now, all it does is print 
the name of each contact. The users would like to see all the fields for each contact (that is,
the name, email and phone number) and would like to choose whether the fields are separated by
commas or tabs. Your task is to make that happen, but there are some rules:

- You may not read any input in the `ContactsApplication` class (but you may do so in `Main`).
- You may introduce any classes and/or interfaces as you see fit.
- None of the classes you introduce should do any printing or reading of input.
- You may modify the `ContactsApplication` class any way you want, except that you may not use
`if`, `else`, `switch` or any loops. Those are all allowed anywhere else (including `Main`).

## Sample output

```
Enter 'c' to separate by commas, or 't' to separate by tabs: t

John Smith	jsmith@example.com	+447761234567
Jane Doe	jane.doe@example.com	+33123456789
Kate Smith	katesmith@example.com	+15551234567
```

```
Enter 'c' to separate by commas, or 't' to separate by tabs: c

John Smith,jsmith@example.com,+447761234567
Jane Doe,jane.doe@example.com,+33123456789
Kate Smith,katesmith@example.com,+15551234567
```
