package com.github.lhsm.auth.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Authentication}.
 * <p>
 * Use builder to create immutable instances:
 * {@code ImmutableAuthentication.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "Authentication"})
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableAuthentication implements Authentication {
  private final Principal principal;
  private final List<String> roles;
  private final String remoteAddress;
  private final FingerPrint fingerPrint;
  private final String sign;
  private final String aclData;

  private ImmutableAuthentication(
      Principal principal,
      List<String> roles,
      String remoteAddress,
      FingerPrint fingerPrint,
      String sign,
      String aclData) {
    this.principal = principal;
    this.roles = roles;
    this.remoteAddress = remoteAddress;
    this.fingerPrint = fingerPrint;
    this.sign = sign;
    this.aclData = aclData;
  }

  /**
   * @return value of {@code principal} attribute
   */
  @JsonProperty
  @Override
  public Principal getPrincipal() {
    return principal;
  }

  /**
   * @return value of {@code roles} attribute
   */
  @JsonProperty
  @Override
  public List<String> roles() {
    return roles;
  }

  /**
   * @return value of {@code remoteAddress} attribute
   */
  @JsonProperty
  @Override
  public String getRemoteAddress() {
    return remoteAddress;
  }

  /**
   * @return value of {@code fingerPrint} attribute
   */
  @JsonProperty
  @Override
  public FingerPrint getFingerPrint() {
    return fingerPrint;
  }

  /**
   * @return value of {@code sign} attribute
   */
  @JsonProperty
  @Override
  public String getSign() {
    return sign;
  }

  /**
   * @return value of {@code aclData} attribute
   */
  @JsonProperty
  @Override
  public String getAclData() {
    return aclData;
  }

  /**
   * Copy current immutable object by setting value for {@link Authentication#getPrincipal() principal}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for principal
   * @return modified copy of the {@code this} object
   */
  public final ImmutableAuthentication withPrincipal(Principal value) {
    if (this.principal == value) return this;
    Principal newValue = Objects.requireNonNull(value);
    return new ImmutableAuthentication(newValue, this.roles, this.remoteAddress, this.fingerPrint, this.sign, this.aclData);
  }

  /**
   * Copy current immutable object with elements that replace content of {@link Authentication#roles() roles}.
   * @param elements elements to set
   * @return modified copy of {@code this} object
   */
  public final ImmutableAuthentication withRoles(String... elements) {
    List<String> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements)));
    return new ImmutableAuthentication(this.principal, newValue, this.remoteAddress, this.fingerPrint, this.sign, this.aclData);
  }

  /**
   * Copy current immutable object with elements that replace content of {@link Authentication#roles() roles}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements iterable of roles elements to set
   * @return modified copy of {@code this} object
   */
  public final ImmutableAuthentication withRoles(Iterable<String> elements) {
    if (this.roles == elements) return this;
    List<String> newValue = createUnmodifiableList(false, createSafeList(elements));
    return new ImmutableAuthentication(this.principal, newValue, this.remoteAddress, this.fingerPrint, this.sign, this.aclData);
  }

  /**
   * Copy current immutable object by setting value for {@link Authentication#getRemoteAddress() remoteAddress}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for remoteAddress
   * @return modified copy of the {@code this} object
   */
  public final ImmutableAuthentication withRemoteAddress(String value) {
    if (this.remoteAddress == value) return this;
    String newValue = Objects.requireNonNull(value);
    return new ImmutableAuthentication(this.principal, this.roles, newValue, this.fingerPrint, this.sign, this.aclData);
  }

  /**
   * Copy current immutable object by setting value for {@link Authentication#getFingerPrint() fingerPrint}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for fingerPrint
   * @return modified copy of the {@code this} object
   */
  public final ImmutableAuthentication withFingerPrint(FingerPrint value) {
    if (this.fingerPrint == value) return this;
    FingerPrint newValue = Objects.requireNonNull(value);
    return new ImmutableAuthentication(this.principal, this.roles, this.remoteAddress, newValue, this.sign, this.aclData);
  }

  /**
   * Copy current immutable object by setting value for {@link Authentication#getSign() sign}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for sign
   * @return modified copy of the {@code this} object
   */
  public final ImmutableAuthentication withSign(String value) {
    if (this.sign == value) return this;
    String newValue = Objects.requireNonNull(value);
    return new ImmutableAuthentication(this.principal, this.roles, this.remoteAddress, this.fingerPrint, newValue, this.aclData);
  }

  /**
   * Copy current immutable object by setting value for {@link Authentication#getAclData() aclData}.
   * Shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value new value for aclData
   * @return modified copy of the {@code this} object
   */
  public final ImmutableAuthentication withAclData(String value) {
    if (this.aclData == value) return this;
    String newValue = Objects.requireNonNull(value);
    return new ImmutableAuthentication(this.principal, this.roles, this.remoteAddress, this.fingerPrint, this.sign, newValue);
  }

  /**
   * This instance is equal to instances of {@code ImmutableAuthentication} with equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuthentication
        && equalTo((ImmutableAuthentication) another);
  }

  private boolean equalTo(ImmutableAuthentication another) {
    return principal.equals(another.principal)
        && roles.equals(another.roles)
        && remoteAddress.equals(another.remoteAddress)
        && fingerPrint.equals(another.fingerPrint)
        && sign.equals(another.sign)
        && aclData.equals(another.aclData);
  }

  /**
   * Computes hash code from attributes: {@code principal}, {@code roles}, {@code remoteAddress}, {@code fingerPrint}, {@code sign}, {@code aclData}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + principal.hashCode();
    h = h * 17 + roles.hashCode();
    h = h * 17 + remoteAddress.hashCode();
    h = h * 17 + fingerPrint.hashCode();
    h = h * 17 + sign.hashCode();
    h = h * 17 + aclData.hashCode();
    return h;
  }

  /**
   * Prints immutable value {@code Authentication...} with attribute values,
   * excluding any non-generated and auxiliary attributes.
   * @return string representation of value
   */
  @Override
  public String toString() {
    return "Authentication{"
        + "principal=" + principal
        + ", roles=" + roles
        + ", remoteAddress=" + remoteAddress
        + ", fingerPrint=" + fingerPrint
        + ", sign=" + sign
        + ", aclData=" + aclData
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
    Principal principal;
    @JsonProperty
    List<String> roles;
    @JsonProperty
    String remoteAddress;
    @JsonProperty
    FingerPrint fingerPrint;
    @JsonProperty
    String sign;
    @JsonProperty
    String aclData;
  }


  /**
   * @param json JSON-bindable data structure
   * @return immutable value type
   * @deprecated Do not use this method directly, it exists only for <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator
  static ImmutableAuthentication fromJson(Json json) {
    ImmutableAuthentication.Builder builder = ImmutableAuthentication.builder();
    if (json.principal != null) {
      builder.principal(json.principal);
    }
    if (json.roles != null) {
      builder.addAllRoles(json.roles);
    }
    if (json.remoteAddress != null) {
      builder.remoteAddress(json.remoteAddress);
    }
    if (json.fingerPrint != null) {
      builder.fingerPrint(json.fingerPrint);
    }
    if (json.sign != null) {
      builder.sign(json.sign);
    }
    if (json.aclData != null) {
      builder.aclData(json.aclData);
    }
    return builder.build();
  }

  /**
   * Creates immutable copy of {@link Authentication}.
   * Uses accessors to get values to initialize immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance instance to copy
   * @return copied immutable Authentication instance
   */
  public static ImmutableAuthentication copyOf(Authentication instance) {
    if (instance instanceof ImmutableAuthentication) {
      return (ImmutableAuthentication) instance;
    }
    return ImmutableAuthentication.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates builder for {@link com.github.lhsm.auth.model.ImmutableAuthentication ImmutableAuthentication}.
   * @return new ImmutableAuthentication builder
   */
  public static ImmutableAuthentication.Builder builder() {
    return new ImmutableAuthentication.Builder();
  }

  /**
   * Builds instances of {@link com.github.lhsm.auth.model.ImmutableAuthentication ImmutableAuthentication}.
   * Initialize attributes and then invoke {@link #build()} method to create
   * immutable instance.
   * <p><em>{@code Builder} is not thread safe and generally should not be stored in field or collection,
   * but used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_PRINCIPAL = 0x1L;
    private static final long INIT_BIT_REMOTE_ADDRESS = 0x2L;
    private static final long INIT_BIT_FINGER_PRINT = 0x4L;
    private static final long INIT_BIT_SIGN = 0x8L;
    private static final long INIT_BIT_ACL_DATA = 0x10L;
    private long initBits = 0x1f;

    private Principal principal;
    private ArrayList<String> rolesBuilder = new ArrayList<String>();
    private String remoteAddress;
    private FingerPrint fingerPrint;
    private String sign;
    private String aclData;

    private Builder() {}

    /**
     * Fill builder with attribute values from provided {@link Authentication} instance.
     * Regular attribute values will be replaced with ones of an instance.
     * Instance's absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance instance to copy values from
     * @return {@code this} builder for chained invocation
     */
    public final Builder from(Authentication instance) {
      Objects.requireNonNull(instance);
      principal(instance.getPrincipal());
      addAllRoles(instance.roles());
      remoteAddress(instance.getRemoteAddress());
      fingerPrint(instance.getFingerPrint());
      sign(instance.getSign());
      aclData(instance.getAclData());
      return this;
    }

    /**
     * Initializes value for {@link Authentication#getPrincipal() principal}.
     * @param principal value for principal
     * @return {@code this} builder for chained invocation
     */
    public final Builder principal(Principal principal) {
      this.principal = Objects.requireNonNull(principal);
      initBits &= ~INIT_BIT_PRINCIPAL;
      return this;
    }

    /**
     * Adds one element to {@link Authentication#roles() roles} list.
     * @param element roles element
     * @return {@code this} builder for chained invocation
     */
    public final Builder addRoles(String element) {
      rolesBuilder.add(Objects.requireNonNull(element));
      return this;
    }

    /**
     * Adds elements to {@link Authentication#roles() roles} list.
     * @param elements array of roles elements
     * @return {@code this} builder for chained invocation
     */
    public final Builder addRoles(String... elements) {
      for (String element : elements) {
        rolesBuilder.add(Objects.requireNonNull(element));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Authentication#roles() roles} list.
     * @param elements iterable of roles elements
     * @return {@code this} builder for chained invocation
     */
    public final Builder roles(Iterable<String> elements) {
      rolesBuilder.clear();
      return addAllRoles(elements);
    }

    /**
     * Adds elements to {@link Authentication#roles() roles} list.
     * @param elements iterable of roles elements
     * @return {@code this} builder for chained invocation
     */
    public final Builder addAllRoles(Iterable<String> elements) {
      for (String element : elements) {
        rolesBuilder.add(Objects.requireNonNull(element));
      }
      return this;
    }

    /**
     * Initializes value for {@link Authentication#getRemoteAddress() remoteAddress}.
     * @param remoteAddress value for remoteAddress
     * @return {@code this} builder for chained invocation
     */
    public final Builder remoteAddress(String remoteAddress) {
      this.remoteAddress = Objects.requireNonNull(remoteAddress);
      initBits &= ~INIT_BIT_REMOTE_ADDRESS;
      return this;
    }

    /**
     * Initializes value for {@link Authentication#getFingerPrint() fingerPrint}.
     * @param fingerPrint value for fingerPrint
     * @return {@code this} builder for chained invocation
     */
    public final Builder fingerPrint(FingerPrint fingerPrint) {
      this.fingerPrint = Objects.requireNonNull(fingerPrint);
      initBits &= ~INIT_BIT_FINGER_PRINT;
      return this;
    }

    /**
     * Initializes value for {@link Authentication#getSign() sign}.
     * @param sign value for sign
     * @return {@code this} builder for chained invocation
     */
    public final Builder sign(String sign) {
      this.sign = Objects.requireNonNull(sign);
      initBits &= ~INIT_BIT_SIGN;
      return this;
    }

    /**
     * Initializes value for {@link Authentication#getAclData() aclData}.
     * @param aclData value for aclData
     * @return {@code this} builder for chained invocation
     */
    public final Builder aclData(String aclData) {
      this.aclData = Objects.requireNonNull(aclData);
      initBits &= ~INIT_BIT_ACL_DATA;
      return this;
    }
    /**
     * Builds new {@link com.github.lhsm.auth.model.ImmutableAuthentication ImmutableAuthentication}.
     * @return immutable instance of Authentication
     * @throws exception {@code java.lang.IllegalStateException} if any required attributes are missing
     */
    public ImmutableAuthentication build()
        throws IllegalStateException {
      checkRequiredAttributes();
      return new ImmutableAuthentication(
          principal,
          createUnmodifiableList(true, rolesBuilder),
          remoteAddress,
          fingerPrint,
          sign,
          aclData);
    }

    private boolean principalIsSet() {
      return (initBits & INIT_BIT_PRINCIPAL) == 0;
    }

    private boolean remoteAddressIsSet() {
      return (initBits & INIT_BIT_REMOTE_ADDRESS) == 0;
    }

    private boolean fingerPrintIsSet() {
      return (initBits & INIT_BIT_FINGER_PRINT) == 0;
    }

    private boolean signIsSet() {
      return (initBits & INIT_BIT_SIGN) == 0;
    }

    private boolean aclDataIsSet() {
      return (initBits & INIT_BIT_ACL_DATA) == 0;
    }

    private void checkRequiredAttributes() throws IllegalStateException {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }
    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if (!principalIsSet()) attributes.add("principal");
      if (!remoteAddressIsSet()) attributes.add("remoteAddress");
      if (!fingerPrintIsSet()) attributes.add("fingerPrint");
      if (!signIsSet()) attributes.add("sign");
      if (!aclDataIsSet()) attributes.add("aclData");
      return "Cannot build Authentication, some of required attributes are not set " + attributes;
    }
  }

  private static <T> ArrayList<T> createSafeList(Iterable<? extends T> iterable) {
    ArrayList<T> list = iterable instanceof Collection<?>
        ? new ArrayList<T>(((Collection<?>) iterable).size())
        : new ArrayList<T>();

    for (T element : iterable) {
      list.add(Objects.requireNonNull(element, "Null in collection attribute is not allowed"));
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<T>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
