package com.example.demo.model;

import java.util.List;

public class AjaxResponseBody {

    String msg;
    List<User> result;

    //getters and setters


    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setResult(List<User> result) {
        this.result = result;
    }

    public List<User> getResult() {
        return result;
    }

    public String getMsg() {
        return msg;
    }
}
