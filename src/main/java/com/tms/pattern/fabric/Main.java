package com.tms.pattern.fabric;

public class Main {
    public static void main(String[] args) {
        String param  = "cpp";
        Course course = switch (param){
            case "Java" -> new JavaCourse();
            case "cpp" -> new CppCourse();
            default -> throw new  RuntimeException();
        };
        course.courseDescription();
    }
}
