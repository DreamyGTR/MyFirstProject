package com.example.demo.cases;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private Integer id;
    private String  userName;
    private String  password;
    private String  age;
    private String  sex;
    private String  permission;
    private String  isDelete;

}
