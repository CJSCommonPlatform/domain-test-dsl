package uk.gov.justice.services.test.domain.event;

import uk.gov.justice.domain.annotation.Event;

import java.util.UUID;

@Event("cake-sent")
public class CakeSent {

    private final UUID id;

    public CakeSent(final UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
