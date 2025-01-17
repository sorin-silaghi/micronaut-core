package io.micronaut.inject.visitor.beans.reflection;

import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.OptionalLong;

@Introspected(accessKind = Introspected.AccessKind.FIELD, visibility = Introspected.Visibility.ANY)
class OptionalLongHolder {
    private final @NotNull @Min(5L) OptionalLong optionalLong;

    OptionalLongHolder(OptionalLong optionalLong) {
        this.optionalLong = optionalLong;
    }
}
