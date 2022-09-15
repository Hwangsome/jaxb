package com.bh.marshalling;

import com.bh.jaxb.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Unmarshaller {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(Book.class);
        Book book = (Book)context.createUnmarshaller().unmarshal(new FileReader("./book.xml"));
        System.out.println("book = " + book);
    }
}
