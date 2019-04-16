package com.example.demo.service.impl;

import com.example.demo.entity.Msg;
import com.example.demo.repository.MsgRepository;
import com.example.demo.service.MsgService;
import org.springframework.stereotype.Service;

import java.util.List;

public class MsgServiceImpl implements MsgService{

    @Autowired
    private MsgRepository msgRepository;

    @Override
    Msg addMsg(Msg msg) {
        return msgRepository.saveAndFlush(msg);
    }

    @Override
    public void delete(long msgId) { msgRepository.delete(msgId)}

    @Override
    public Msg editMsg(Msg msg) {
        return msgRepository.saveAndFlush(msg);
    }

    @Override
    public List<Msg> getAll() {
        return msgRepository.findAll();
    }
}