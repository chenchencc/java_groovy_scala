package com.jason.finalClass;


public class Test {

    public static void main(String[] args) {
        final Person p = new Person();
        p.setName("11");

        System.out.println(p.getName());
        p.a = 7;
        System.out.println(p.a);

    }
}
