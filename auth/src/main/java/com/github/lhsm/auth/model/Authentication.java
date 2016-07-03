package com.github.lhsm.auth.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableAuthentication.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Authentication {

    Principal getPrincipal();

    List<String> roles();

    String getRemoteAddress();

    FingerPrint getFingerPrint();

    String getSign();

    String getAclData();

}
