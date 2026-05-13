package com.technokratos.agona.dtos.events;

import java.util.UUID;

public class BasicEvent {
    private UUID messageId;

    public UUID getMessageId() {
        return messageId;
    }

    public void setMessageId(UUID messageId) {
        this.messageId = messageId;
    }
}
