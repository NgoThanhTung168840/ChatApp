package com.mercure.dto;

import com.mercure.utils.RtcActionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
//@AllArgsConstructor
//@NoArgsConstructor
public class RtcTransportDTO {

    private int userId;

    private String groupUrl;

    private RtcActionEnum action;

    private Object offer;

    private Object answer;

    public RtcTransportDTO() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getGroupUrl() {
        return groupUrl;
    }

    public void setGroupUrl(String groupUrl) {
        this.groupUrl = groupUrl;
    }

    public RtcActionEnum getAction() {
        return action;
    }

    public void setAction(RtcActionEnum action) {
        this.action = action;
    }

    public Object getOffer() {
        return offer;
    }

    public void setOffer(Object offer) {
        this.offer = offer;
    }

    public Object getAnswer() {
        return answer;
    }

    public void setAnswer(Object answer) {
        this.answer = answer;
    }
}
