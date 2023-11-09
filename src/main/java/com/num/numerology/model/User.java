package com.num.numerology.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Builder
@Getter
public class User {

    private long id;

    private String name;

    @Setter
    private String password;

    private Date birthday;

}
