package com.mercure.dto;

import com.mercure.utils.TransportActionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
public class OutputTransportDTO {

    private TransportActionEnum action;

    private Object object;

    public OutputTransportDTO() {
    }

    public TransportActionEnum getAction() {
        return action;
    }

    public void setAction(TransportActionEnum action) {
        this.action = action;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}