package com.example.demo.model.bean;

import lombok.Data;
import lombok.ToString;

@ToString
@Data

public class APIReponse {
    private int status;
    private String message;
    private String data;
}
