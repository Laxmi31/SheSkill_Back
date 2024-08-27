package com.SheSkill.SheSkill.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class messages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="sender_id")
    private Integer senderId;
    @JoinColumn(name="receiver_id")
    private String receiverId;
    @JoinColumn(name="message_id")
    private String messageId;
    private String content;
}
