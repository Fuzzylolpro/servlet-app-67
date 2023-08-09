package com.tms.SOLID;

public class Book {
    private String name;
    private String author;
    public String text;

    public void changeWorldsInTheText(String first,String second){
        text = text.replaceAll(first, second);
    }
    public void printTextInConsole(){
        System.out.println(text);
    }

}
