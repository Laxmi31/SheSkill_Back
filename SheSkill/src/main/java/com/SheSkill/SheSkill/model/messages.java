package com.SheSkill.SheSkill.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class messages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="message_id")
    private Integer messageId;
    @Column(name="sender_id")
    private String senderId;
    @Column(name="receiver_id")
    private String receiverId;
    private String content;
}
