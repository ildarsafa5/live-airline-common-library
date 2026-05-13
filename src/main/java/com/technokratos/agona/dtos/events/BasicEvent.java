package com.technokratos.agona.dtos.events;

import lombok.experimental.SuperBuilder;

import java.util.UUID;

@SuperBuilder(toBuilder = true)
public class BasicEvent {
    private UUID messageId;

    public UUID getMessageId() {
        return messageId;
    }

    public void setMessageId(UUID messageId) {
        this.messageId = messageId;
    }
}
