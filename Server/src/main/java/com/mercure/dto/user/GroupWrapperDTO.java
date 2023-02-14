package com.mercure.dto.user;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GroupWrapperDTO {

    private GroupDTO group;

    private GroupCallDTO groupCall;

    public GroupDTO getGroup() {
        return group;
    }

    public void setGroup(GroupDTO group) {
        this.group = group;
    }

    public GroupCallDTO getGroupCall() {
        return groupCall;
    }

    public void setGroupCall(GroupCallDTO groupCall) {
        this.groupCall = groupCall;
    }
}
