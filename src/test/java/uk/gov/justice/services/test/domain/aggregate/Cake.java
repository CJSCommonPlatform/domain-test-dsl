package uk.gov.justice.services.test.domain.aggregate;

import static uk.gov.justice.domain.aggregate.matcher.EventSwitcher.match;
import static uk.gov.justice.domain.aggregate.matcher.EventSwitcher.when;

import uk.gov.justice.domain.aggregate.Aggregate;
import uk.gov.justice.services.test.domain.event.CakeFailed;
import uk.gov.justice.services.test.domain.event.CakeSent;

import java.util.UUID;
import java.util.stream.Stream;

public class Cake implements Aggregate {

    private UUID id;

    public Stream<Object> send(final UUID id) {
        return apply(Stream.of(new CakeSent(id)));
    }

    public Stream<Object> markAsFailed(final UUID id) {
        return Stream.of(new CakeFailed(id));
    }

    @Override
    public Object apply(final Object event) {
        return match(event).with(
                when(CakeSent.class).apply(x -> this.id = x.getId())
        );
    }
}
