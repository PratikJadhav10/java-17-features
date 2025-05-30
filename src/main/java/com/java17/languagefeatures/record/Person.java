package com.java17.languagefeatures.record;

public record Person(String name, int age) {
    public String greeting() {
        return "Hello, I'm " + name + " and I'm " + age + " years old.";
    }

    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        System.out.println(p.greeting());
    }
}