package com.example.demo.service;

import com.example.demo.entity.Msg;
import java.util.List;

public interface MsgService {

    Msg addMsg(Msg msg);
    void delete(long msgId);
    Msg editMsg(Msg msg);
    List<Msg> getAll();

}