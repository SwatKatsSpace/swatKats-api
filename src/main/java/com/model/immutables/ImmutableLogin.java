package com.model.immutables;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

import com.model.Login;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Login}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLogin.builder()}.
 */
@Generated(from = "Login", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableLogin implements Login {
  private final @Nullable String phone;
  private final @Nullable String email;
  private final String password;

  private ImmutableLogin(
      @Nullable String phone,
      @Nullable String email,
      String password) {
    this.phone = phone;
    this.email = email;
    this.password = password;
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
   * @return The value of the {@code email} attribute
   */
  @JsonProperty
  @Override
  public Optional<String> email() {
    return Optional.ofNullable(email);
  }

  /**
   * @return The value of the {@code password} attribute
   */
  @JsonProperty
  @Override
  public String password() {
    return password;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#phone() phone} attribute.
   * @param value The value for phone
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withPhone(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "phone");
    if (Objects.equals(this.phone, newValue)) return this;
    return new ImmutableLogin(newValue, this.email, this.password);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#phone() phone} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for phone
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withPhone(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.phone, value)) return this;
    return new ImmutableLogin(value, this.email, this.password);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Login#email() email} attribute.
   * @param value The value for email
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withEmail(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "email");
    if (Objects.equals(this.email, newValue)) return this;
    return new ImmutableLogin(this.phone, newValue, this.password);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Login#email() email} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for email
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLogin withEmail(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.email, value)) return this;
    return new ImmutableLogin(this.phone, value, this.password);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Login#password() password} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for password
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLogin withPassword(String value) {
    String newValue = Objects.requireNonNull(value, "password");
    if (this.password.equals(newValue)) return this;
    return new ImmutableLogin(this.phone, this.email, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLogin} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLogin
        && equalTo((ImmutableLogin) another);
  }

  private boolean equalTo(ImmutableLogin another) {
    return Objects.equals(phone, another.phone)
        && Objects.equals(email, another.email)
        && password.equals(another.password);
  }

  /**
   * Computes a hash code from attributes: {@code phone}, {@code email}, {@code password}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Objects.hashCode(phone);
    h += (h << 5) + Objects.hashCode(email);
    h += (h << 5) + password.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Login} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Login")
        .omitNullValues()
        .add("phone", phone)
        .add("email", email)
        .add("password", password)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Login", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Login {
    @Nullable Optional<String> phone = Optional.empty();
    @Nullable Optional<String> email = Optional.empty();
    @Nullable String password;
    @JsonProperty
    public void setPhone(Optional<String> phone) {
      this.phone = phone;
    }
    @JsonProperty
    public void setEmail(Optional<String> email) {
      this.email = email;
    }
    @JsonProperty
    public void setPassword(String password) {
      this.password = password;
    }
    @Override
    public Optional<String> phone() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> email() { throw new UnsupportedOperationException(); }
    @Override
    public String password() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLogin fromJson(Json json) {
    Builder builder = ImmutableLogin.builder();
    if (json.phone != null) {
      builder.phone(json.phone);
    }
    if (json.email != null) {
      builder.email(json.email);
    }
    if (json.password != null) {
      builder.password(json.password);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Login} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Login instance
   */
  public static ImmutableLogin copyOf(Login instance) {
    if (instance instanceof ImmutableLogin) {
      return (ImmutableLogin) instance;
    }
    return ImmutableLogin.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLogin ImmutableLogin}.
   * @return A new ImmutableLogin builder
   */
  public static Builder builder() {
    return new Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLogin ImmutableLogin}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Login", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PASSWORD = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String phone;
    private @Nullable String email;
    private @Nullable String password;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Login} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Login instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<String> phoneOptional = instance.phone();
      if (phoneOptional.isPresent()) {
        phone(phoneOptional);
      }
      Optional<String> emailOptional = instance.email();
      if (emailOptional.isPresent()) {
        email(emailOptional);
      }
      password(instance.password());
      return this;
    }

    /**
     * Initializes the optional value {@link Login#phone() phone} to phone.
     * @param phone The value for phone
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder phone(String phone) {
      this.phone = Objects.requireNonNull(phone, "phone");
      return this;
    }

    /**
     * Initializes the optional value {@link Login#phone() phone} to phone.
     * @param phone The value for phone
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder phone(Optional<String> phone) {
      this.phone = phone.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link Login#email() email} to email.
     * @param email The value for email
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder email(String email) {
      this.email = Objects.requireNonNull(email, "email");
      return this;
    }

    /**
     * Initializes the optional value {@link Login#email() email} to email.
     * @param email The value for email
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder email(Optional<String> email) {
      this.email = email.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Login#password() password} attribute.
     * @param password The value for password 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder password(String password) {
      this.password = Objects.requireNonNull(password, "password");
      initBits &= ~INIT_BIT_PASSWORD;
      return this;
    }

    /**
     * Builds a new {@link ImmutableLogin ImmutableLogin}.
     * @return An immutable instance of Login
     * @throws IllegalStateException if any required attributes are missing
     */
    public ImmutableLogin build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLogin(phone, email, password);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_PASSWORD) != 0) attributes.add("password");
      return "Cannot build Login, some of required attributes are not set " + attributes;
    }
  }
}
