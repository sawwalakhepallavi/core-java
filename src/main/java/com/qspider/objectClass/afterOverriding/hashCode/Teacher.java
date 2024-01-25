package com.qspider.objectClass.afterOverriding.hashCode;

import java.util.Objects;

public class Teacher {
    String name;
    int id;

    public Teacher(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
