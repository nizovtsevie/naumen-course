package com.example.demo.entity;

import javax.persistence.Entity;
import com.example.demo.entity.enums;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table
public class Msg {

    @Id
    @GeneratedValue
    @Column(name="msgId", length = 6, nullable=false)
    private long MsgId;

    @Column(name="UId", length = 6, nullable=false)
    private long UId;

    @Column(name="msgBox", length = 140, nullable=false)
    private long MsgBox;

    @Column(name="relationType", nullable=true)
    private RelationType Relation;

    @Column(name="relatedMsgId", length = 6, nullable=true)
    private long RelatedMsgId;

    @ManyToOne(fetch =FetchType.LAZY,)
    @JoinColumn(name = "UId", nullable=false)
    private User user;

    public long getUId() {
        return UId;
    }

    public void setUId(long UId) {
        this.UId = UId;
    }

    public long getMsgId() {
        return MsgId;
    }

    public void setMsgId(long msgId) {
        this.MsgIdId = msgId;
    }

    public long getMsgBox() {
        return MsgBox;
    }

    public void setMsgBox(long msgBox) {
        MsgBox = msgBox;
    }

    public RelationType getRelation() {
        return Relation;
    }

    public void setRelation(RelationType relation) {
        Relation = relation;
    }

    public long getRelatedMsgId() {
        return RelatedMsgId;
    }

    public void setRelatedMsgId(long relatedMsgId) {
        RelatedMsgId = relatedMsgId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}