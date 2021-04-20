package com.example.entity;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "t_user")
public class User implements Serializable {

    private Integer id;

    private String userName;

    private String passWord;

    private String realName;
}
