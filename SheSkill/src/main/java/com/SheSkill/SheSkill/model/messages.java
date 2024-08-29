package com.SheSkill.SheSkill.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class messages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="message_id")
    private Integer messageId;
    @JoinColumn(name="sender_id")
    private String senderId;
    @JoinColumn(name="receiver_id")
    private String receiverId;
    private String content;
}
