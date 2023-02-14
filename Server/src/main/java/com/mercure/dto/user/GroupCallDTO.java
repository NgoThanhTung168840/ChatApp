package com.mercure.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
//@NoArgsConstructor
public class GroupCallDTO {

    private Boolean anyCallActive;

    private String activeCallUrl;

    public GroupCallDTO() {
    }

    public Boolean getAnyCallActive() {
        return anyCallActive;
    }

    public void setAnyCallActive(Boolean anyCallActive) {
        this.anyCallActive = anyCallActive;
    }

    public String getActiveCallUrl() {
        return activeCallUrl;
    }

    public void setActiveCallUrl(String activeCallUrl) {
        this.activeCallUrl = activeCallUrl;
    }
}
