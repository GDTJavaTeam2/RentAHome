package com.rentahome.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MessageDTO {

    private int messageId;
    private String senderId;
    private String receiverId;
    private String content;
    private Date time;

    private List<ReplyDTO> replies = new ArrayList<>();

}