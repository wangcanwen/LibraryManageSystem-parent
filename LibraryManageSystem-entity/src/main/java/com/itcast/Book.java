package com.itcast;

import lombok.Data;

import java.util.Date;

@Data
public class Book {
    long id;
    int typeid;
    String bookname;
    String author;
    String publish;
    Date publishdate;
    int publishtime;
    Double unitprice;
}
