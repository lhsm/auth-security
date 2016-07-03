package com.github.lhsm.auth.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutablePrincipal.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Principal {

    String getPrsId();

}
