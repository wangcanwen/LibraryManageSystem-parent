package com.itcast;

import lombok.Data;

import java.util.Date;

@Data
public class Borrowbook {
    long readerid;
    long bid;
    Date borrowdate;
    Date returndate;
    Double fine;
}
