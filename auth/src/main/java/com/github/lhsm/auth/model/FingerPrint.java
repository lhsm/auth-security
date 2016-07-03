package com.github.lhsm.auth.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableFingerPrint.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface FingerPrint {

    Object getProperties();
}
