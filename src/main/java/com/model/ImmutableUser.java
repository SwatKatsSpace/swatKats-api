package com.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import org.immutables.value.Generated;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Immutable implementation of {@link User}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUser.builder()}.
 */
@Generated(from = "User", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
//@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableUser implements User {
  private final String name;
  private final String email;
  private final @Nullable String phone;
  private final String aadharId;

  private ImmutableUser(
      String name,
      String email,
      @Nullable String phone,
      String aadharId) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.aadharId = aadharId;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code email} attribute
   */
  @JsonProperty
  @Override
  public String email() {
    return email;
  }

  /**
   * @return The value of the {@code phone} attribute
   */
  @JsonProperty
  @Override
  public Optional<String> phone() {
    return Optional.ofNullable(phone);
  }

  /**
   * @return The value of the {@code aadharId} attribute
   */
  @JsonProperty
  @Override
  public String aadharId() {
    return aadharId;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link User#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUser withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableUser(newValue, this.email, this.phone, this.aadharId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link User#email() email} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for email
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUser withEmail(String value) {
    String newValue = Objects.requireNonNull(value, "email");
    if (this.email.equals(newValue)) return this;
    return new ImmutableUser(this.name, newValue, this.phone, this.aadharId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#phone() phone} attribute.
   * @param value The value for phone
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withPhone(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "phone");
    if (Objects.equals(this.phone, newValue)) return this;
    return new ImmutableUser(this.name, this.email, newValue, this.aadharId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link User#phone() phone} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for phone
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withPhone(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.phone, value)) return this;
    return new ImmutableUser(this.name, this.email, value, this.aadharId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link User#aadharId() aadharId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for aadharId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUser withAadharId(String value) {
    String newValue = Objects.requireNonNull(value, "aadharId");
    if (this.aadharId.equals(newValue)) return this;
    return new ImmutableUser(this.name, this.email, this.phone, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUser} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUser
        && equalTo((ImmutableUser) another);
  }

  private boolean equalTo(ImmutableUser another) {
    return name.equals(another.name)
        && email.equals(another.email)
        && Objects.equals(phone, another.phone)
        && aadharId.equals(another.aadharId);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code email}, {@code phone}, {@code aadharId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + email.hashCode();
    h += (h << 5) + Objects.hashCode(phone);
    h += (h << 5) + aadharId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code User} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("User")
        .omitNullValues()
        .add("name", name)
        .add("email", email)
        .add("phone", phone)
        .add("aadharId", aadharId)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "User", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements User {
    @Nullable String name;
    @Nullable String email;
    @Nullable Optional<String> phone = Optional.empty();
    @Nullable String aadharId;
    @JsonProperty
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty
    public void setEmail(String email) {
      this.email = email;
    }
    @JsonProperty
    public void setPhone(Optional<String> phone) {
      this.phone = phone;
    }
    @JsonProperty
    public void setAadharId(String aadharId) {
      this.aadharId = aadharId;
    }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String email() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> phone() { throw new UnsupportedOperationException(); }
    @Override
    public String aadharId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUser fromJson(Json json) {
    Builder builder = ImmutableUser.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.email != null) {
      builder.email(json.email);
    }
    if (json.phone != null) {
      builder.phone(json.phone);
    }
    if (json.aadharId != null) {
      builder.aadharId(json.aadharId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link User} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable User instance
   */
  public static ImmutableUser copyOf(User instance) {
    if (instance instanceof ImmutableUser) {
      return (ImmutableUser) instance;
    }
    return ImmutableUser.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUser ImmutableUser}.
   * @return A new ImmutableUser builder
   */
  public static Builder builder() {
    return new Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUser ImmutableUser}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "User", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_EMAIL = 0x2L;
    private static final long INIT_BIT_AADHAR_ID = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String name;
    private @Nullable String email;
    private @Nullable String phone;
    private @Nullable String aadharId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code User} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder from(User instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      email(instance.email());
      Optional<String> phoneOptional = instance.phone();
      if (phoneOptional.isPresent()) {
        phone(phoneOptional);
      }
      aadharId(instance.aadharId());
      return this;
    }

    /**
     * Initializes the value for the {@link User#name() name} attribute.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link User#email() email} attribute.
     * @param email The value for email
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder email(String email) {
      this.email = Objects.requireNonNull(email, "email");
      initBits &= ~INIT_BIT_EMAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link User#phone() phone} to phone.
     * @param phone The value for phone
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder phone(String phone) {
      this.phone = Objects.requireNonNull(phone, "phone");
      return this;
    }

    /**
     * Initializes the optional value {@link User#phone() phone} to phone.
     * @param phone The value for phone
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder phone(Optional<String> phone) {
      this.phone = phone.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link User#aadharId() aadharId} attribute.
     * @param aadharId The value for aadharId
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue
    public final Builder aadharId(String aadharId) {
      this.aadharId = Objects.requireNonNull(aadharId, "aadharId");
      initBits &= ~INIT_BIT_AADHAR_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUser ImmutableUser}.
     * @return An immutable instance of User
     * @throws IllegalStateException if any required attributes are missing
     */
    public ImmutableUser build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUser(name, email, phone, aadharId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_EMAIL) != 0) attributes.add("email");
      if ((initBits & INIT_BIT_AADHAR_ID) != 0) attributes.add("aadharId");
      return "Cannot build User, some of required attributes are not set " + attributes;
    }
  }
}
