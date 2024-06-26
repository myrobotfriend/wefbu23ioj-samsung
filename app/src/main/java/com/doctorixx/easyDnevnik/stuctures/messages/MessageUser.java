package com.doctorixx.easyDnevnik.stuctures.messages;

public class MessageUser {
    private final String name;
    private final int id;

    public MessageUser(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s [id= %d]",name,id);
    }
}
