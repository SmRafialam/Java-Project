package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
    ArrayList<Book> books = new ArrayList<Book>();
    void sell(String bookTitle,int noOfCopies)
    {
        int idx=-1;
        boolean found=false ;
        for(int i=0;i<books.size();i++)
        {
            Book b=books.get(i);
            if(bookTitle.equals(b.bookTitle))
            {
                found=true;
                b.numOfCopies-=noOfCopies;
                idx=i;
                break;
            }
        }
        if(!found)
        {
            System.out.println("This book isn't available.");
        }


    }
    void order(String isbn ,int noOfCopies)
    {
        int idx=-1;
        boolean found=false ;
        for(int i=0;i<books.size();i++)
        {
            Book b=books.get(i);
            if(isbn.equals(b.ISBN))
            {
                found=true;
                idx=i;
                break;
            }
        }
        if (!found) {

            Scanner in=new Scanner(System.in);
            System.out.println("Enter the name of the book.");
            String bName=in.nextLine();
            System.out.println("Enter the name of the author of the book.");
            String aName=in.nextLine();


            books.add(new Book(bName,aName,isbn,noOfCopies));
        } else {
            Book b=books.get(idx);
            b.numOfCopies+=noOfCopies;


        }
    }

    void display()
    {
        for(int i=0;i<books.size();i++)
        {
            Book b=books.get(i);
            b.display();
        }

    }

}
