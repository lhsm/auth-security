package com.github.lhsm.auth.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link FingerPrint}.
 * <p>
 * Use builder to create immutable instances:
 * {@code ImmutableFingerPrint.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "FingerPrint"})
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableFingerPrint implements FingerPrint {
  private final java.lang.Object properties;

  private ImmutableFingerPrint(java.lang.Object properties) {
    this.properties = properties;
  }

  /**
   * @return value of {@code properties} attribute
   */
  @JsonProperty
  @Override
  public java.lang.Object getProperties() {
    return properties;
  }

  /**
   * Copy current immutable object by setting value for {@link FingerPrint#getProperties() properties}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for properties
   * @return modified copy of the {@code this} object
   */
  public final ImmutableFingerPrint withProperties(java.lang.Object value) {
    if (this.properties == value) return this;
    java.lang.Object newValue = Objects.requireNonNull(value);
    return new ImmutableFingerPrint(newValue);
  }

  /**
   * This instance is equal to instances of {@code ImmutableFingerPrint} with equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFingerPrint
        && equalTo((ImmutableFingerPrint) another);
  }

  private boolean equalTo(ImmutableFingerPrint another) {
    return properties.equals(another.properties);
  }

  /**
   * Computes hash code from attributes: {@code properties}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + properties.hashCode();
    return h;
  }

  /**
   * Prints immutable value {@code FingerPrint...} with attribute values,
   * excluding any non-generated and auxiliary attributes.
   * @return string representation of value
   */
  @Override
  public String toString() {
    return "FingerPrint{"
        + "properties=" + properties
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
    java.lang.Object properties;
  }


  /**
   * @param json JSON-bindable data structure
   * @return immutable value type
   * @deprecated Do not use this method directly, it exists only for <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator
  static ImmutableFingerPrint fromJson(Json json) {
    ImmutableFingerPrint.Builder builder = ImmutableFingerPrint.builder();
    if (json.properties != null) {
      builder.properties(json.properties);
    }
    return builder.build();
  }

  /**
   * Creates immutable copy of {@link FingerPrint}.
   * Uses accessors to get values to initialize immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance instance to copy
   * @return copied immutable FingerPrint instance
   */
  public static ImmutableFingerPrint copyOf(FingerPrint instance) {
    if (instance instanceof ImmutableFingerPrint) {
      return (ImmutableFingerPrint) instance;
    }
    return ImmutableFingerPrint.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates builder for {@link com.github.lhsm.auth.model.ImmutableFingerPrint ImmutableFingerPrint}.
   * @return new ImmutableFingerPrint builder
   */
  public static ImmutableFingerPrint.Builder builder() {
    return new ImmutableFingerPrint.Builder();
  }

  /**
   * Builds instances of {@link com.github.lhsm.auth.model.ImmutableFingerPrint ImmutableFingerPrint}.
   * Initialize attributes and then invoke {@link #build()} method to create
   * immutable instance.
   * <p><em>{@code Builder} is not thread safe and generally should not be stored in field or collection,
   * but used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_PROPERTIES = 0x1L;
    private long initBits = 0x1;

    private java.lang.Object properties;

    private Builder() {}

    /**
     * Fill builder with attribute values from provided {@link FingerPrint} instance.
     * Regular attribute values will be replaced with ones of an instance.
     * Instance's absent optional values will not replace present values.
     * @param instance instance to copy values from
     * @return {@code this} builder for chained invocation
     */
    public final Builder from(FingerPrint instance) {
      Objects.requireNonNull(instance);
      properties(instance.getProperties());
      return this;
    }

    /**
     * Initializes value for {@link FingerPrint#getProperties() properties}.
     * @param properties value for properties
     * @return {@code this} builder for chained invocation
     */
    public final Builder properties(java.lang.Object properties) {
      this.properties = Objects.requireNonNull(properties);
      initBits &= ~INIT_BIT_PROPERTIES;
      return this;
    }
    /**
     * Builds new {@link com.github.lhsm.auth.model.ImmutableFingerPrint ImmutableFingerPrint}.
     * @return immutable instance of FingerPrint
     * @throws exception {@code java.lang.IllegalStateException} if any required attributes are missing
     */
    public ImmutableFingerPrint build()
        throws IllegalStateException {
      checkRequiredAttributes(); return new ImmutableFingerPrint(properties);
    }

    private boolean propertiesIsSet() {
      return (initBits & INIT_BIT_PROPERTIES) == 0;
    }

    private void checkRequiredAttributes() throws IllegalStateException {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }
    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if (!propertiesIsSet()) attributes.add("properties");
      return "Cannot build FingerPrint, some of required attributes are not set " + attributes;
    }
  }
}
