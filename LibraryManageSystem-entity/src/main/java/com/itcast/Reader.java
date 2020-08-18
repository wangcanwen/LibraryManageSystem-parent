package com.itcast;

import java.util.Date;
import lombok.Data;

@Data
public class Reader {
    String readerid;
    int type;
    String name;
    int age;
    String sex;
    String phone;
    String dept;
    Date regdate;
}
