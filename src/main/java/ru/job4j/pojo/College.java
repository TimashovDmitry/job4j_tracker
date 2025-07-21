package ru.job4j.pojo;

import java.util.Date;
public class College {
    public static void main(String[] args) {
        Student license = new Student();
        license.setName("Timashov Dmitry");
        license.setGroup("C-101");
        license.setCreated(new Date());

        System.out.println(license.getName() + "  " + license.getGroup() + "  " + license.getCreated());
    }
}
