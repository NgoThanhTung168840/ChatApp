package com.mercure.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "message_user")
@IdClass(MessageUserKey.class)
@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
public class MessageUserEntity implements Serializable {

    @Id
    private int messageId;

    @Id
    private int userId;

    private boolean seen;

    @Override
    public int hashCode() {
        return Objects.hash(messageId, userId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MessageUserEntity groupRoleKey = (MessageUserEntity) obj;
        return messageId == groupRoleKey.messageId &&
                userId == groupRoleKey.userId;
    }

    public MessageUserEntity() {
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }
}
