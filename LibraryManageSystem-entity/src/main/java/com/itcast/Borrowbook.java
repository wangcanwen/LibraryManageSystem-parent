package com.itcast;

import lombok.Data;

import java.util.Date;

@Data
public class Borrowbook {
    String readerid;
    String isbn;
    Date borrowdate;
    Date returndate;
    Double fine;
}
