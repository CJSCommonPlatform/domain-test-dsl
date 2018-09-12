package uk.gov.justice.services.test.domain.event;

import uk.gov.justice.domain.annotation.Event;

import java.util.UUID;

@Event("cake-failed")
public class CakeFailed {

    private final UUID id;

    public CakeFailed(final UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
