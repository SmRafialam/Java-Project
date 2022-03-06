package com.company;

public class Book {
    String bookTitle;
    String author;
    String ISBN;
    int numOfCopies;
    public Book(String bookTitle,String author,String ISBN,int numOfCopies)
    {
        this.bookTitle=bookTitle;
        this.author=author;
        this.ISBN=ISBN;
        this.numOfCopies=numOfCopies;
    }
    void display()
    {
        System.out.println("Book Name : "+bookTitle);
        System.out.println("Author's name : "+author);
        System.out.println("ISBN : "+ISBN);
        System.out.println("Quantity : "+numOfCopies);
        System.out.println();

    }
}

