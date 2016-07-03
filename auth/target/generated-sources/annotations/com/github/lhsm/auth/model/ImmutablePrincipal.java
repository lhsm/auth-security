package com.github.lhsm.auth.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Principal}.
 * <p>
 * Use builder to create immutable instances:
 * {@code ImmutablePrincipal.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "Principal"})
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutablePrincipal implements Principal {
  private final String prsId;

  private ImmutablePrincipal(String prsId) {
    this.prsId = prsId;
  }

  /**
   * @return value of {@code prsId} attribute
   */
  @JsonProperty
  @Override
  public String getPrsId() {
    return prsId;
  }

  /**
   * Copy current immutable object by setting value for {@link Principal#getPrsId() prsId}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for prsId
   * @return modified copy of the {@code this} object
   */
  public final ImmutablePrincipal withPrsId(String value) {
    if (this.prsId == value) return this;
    String newValue = Objects.requireNonNull(value);
    return new ImmutablePrincipal(newValue);
  }

  /**
   * This instance is equal to instances of {@code ImmutablePrincipal} with equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePrincipal
        && equalTo((ImmutablePrincipal) another);
  }

  private boolean equalTo(ImmutablePrincipal another) {
    return prsId.equals(another.prsId);
  }

  /**
   * Computes hash code from attributes: {@code prsId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + prsId.hashCode();
    return h;
  }

  /**
   * Prints immutable value {@code Principal...} with attribute values,
   * excluding any non-generated and auxiliary attributes.
   * @return string representation of value
   */
  @Override
  public String toString() {
    return "Principal{"
        + "prsId=" + prsId
        + "}";
  }

  /**
   * Simple representation of this value type suitable Jackson binding
   * @deprecated Do not use this type directly, it exists only for <em>Jackson</em>-binding infrastructure
   */
  @JsonIgnoreProperties(ignoreUnknown = true)
  @Deprecated
  static final class Json {
    @JsonProperty
    String prsId;
  }


  /**
   * @param json JSON-bindable data structure
   * @return immutable value type
   * @deprecated Do not use this method directly, it exists only for <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator
  static ImmutablePrincipal fromJson(Json json) {
    ImmutablePrincipal.Builder builder = ImmutablePrincipal.builder();
    if (json.prsId != null) {
      builder.prsId(json.prsId);
    }
    return builder.build();
  }

  /**
   * Creates immutable copy of {@link Principal}.
   * Uses accessors to get values to initialize immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance instance to copy
   * @return copied immutable Principal instance
   */
  public static ImmutablePrincipal copyOf(Principal instance) {
    if (instance instanceof ImmutablePrincipal) {
      return (ImmutablePrincipal) instance;
    }
    return ImmutablePrincipal.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates builder for {@link com.github.lhsm.auth.model.ImmutablePrincipal ImmutablePrincipal}.
   * @return new ImmutablePrincipal builder
   */
  public static ImmutablePrincipal.Builder builder() {
    return new ImmutablePrincipal.Builder();
  }

  /**
   * Builds instances of {@link com.github.lhsm.auth.model.ImmutablePrincipal ImmutablePrincipal}.
   * Initialize attributes and then invoke {@link #build()} method to create
   * immutable instance.
   * <p><em>{@code Builder} is not thread safe and generally should not be stored in field or collection,
   * but used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_PRS_ID = 0x1L;
    private long initBits = 0x1;

    private String prsId;

    private Builder() {}

    /**
     * Fill builder with attribute values from provided {@link Principal} instance.
     * Regular attribute values will be replaced with ones of an instance.
     * Instance's absent optional values will not replace present values.
     * @param instance instance to copy values from
     * @return {@code this} builder for chained invocation
     */
    public final Builder from(Principal instance) {
      Objects.requireNonNull(instance);
      prsId(instance.getPrsId());
      return this;
    }

    /**
     * Initializes value for {@link Principal#getPrsId() prsId}.
     * @param prsId value for prsId
     * @return {@code this} builder for chained invocation
     */
    public final Builder prsId(String prsId) {
      this.prsId = Objects.requireNonNull(prsId);
      initBits &= ~INIT_BIT_PRS_ID;
      return this;
    }
    /**
     * Builds new {@link com.github.lhsm.auth.model.ImmutablePrincipal ImmutablePrincipal}.
     * @return immutable instance of Principal
     * @throws exception {@code java.lang.IllegalStateException} if any required attributes are missing
     */
    public ImmutablePrincipal build()
        throws IllegalStateException {
      checkRequiredAttributes(); return new ImmutablePrincipal(prsId);
    }

    private boolean prsIdIsSet() {
      return (initBits & INIT_BIT_PRS_ID) == 0;
    }

    private void checkRequiredAttributes() throws IllegalStateException {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }
    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if (!prsIdIsSet()) attributes.add("prsId");
      return "Cannot build Principal, some of required attributes are not set " + attributes;
    }
  }
}
