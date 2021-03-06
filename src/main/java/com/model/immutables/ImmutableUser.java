package com.model.immutables;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.model.User;

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
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link User}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUser.builder()}.
 */
@Generated(from = "User", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableUser implements User {
  private final @Nullable String uuid;
  private final String name;
  private final String email;
  private final @Nullable String phone;
  private final String password;
  private final String aadharId;
  private final String panId;

  private ImmutableUser(
      @Nullable String uuid,
      String name,
      String email,
      @Nullable String phone,
      String password,
      String aadharId,
      String panId) {
    this.uuid = uuid;
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.password = password;
    this.aadharId = aadharId;
    this.panId = panId;
  }

  /**
   * @return The value of the {@code uuid} attribute
   */
  @JsonProperty
  @Override
  public Optional<String> uuid() {
    return Optional.ofNullable(uuid);
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
   * @return The value of the {@code password} attribute
   */
  @JsonProperty
  @Override
  public String password() {
    return password;
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
   * @return The value of the {@code panId} attribute
   */
  @JsonProperty
  @Override
  public String panId() {
    return panId;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#uuid() uuid} attribute.
   * @param value The value for uuid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withUuid(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "uuid");
    if (Objects.equals(this.uuid, newValue)) return this;
    return new ImmutableUser(newValue, this.name, this.email, this.phone, this.password, this.aadharId, this.panId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link User#uuid() uuid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for uuid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withUuid(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.uuid, value)) return this;
    return new ImmutableUser(value, this.name, this.email, this.phone, this.password, this.aadharId, this.panId);
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
    return new ImmutableUser(this.uuid, newValue, this.email, this.phone, this.password, this.aadharId, this.panId);
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
    return new ImmutableUser(this.uuid, this.name, newValue, this.phone, this.password, this.aadharId, this.panId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link User#phone() phone} attribute.
   * @param value The value for phone
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUser withPhone(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "phone");
    if (Objects.equals(this.phone, newValue)) return this;
    return new ImmutableUser(this.uuid, this.name, this.email, newValue, this.password, this.aadharId, this.panId);
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
    return new ImmutableUser(this.uuid, this.name, this.email, value, this.password, this.aadharId, this.panId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link User#password() password} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for password
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUser withPassword(String value) {
    String newValue = Objects.requireNonNull(value, "password");
    if (this.password.equals(newValue)) return this;
    return new ImmutableUser(this.uuid, this.name, this.email, this.phone, newValue, this.aadharId, this.panId);
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
    return new ImmutableUser(this.uuid, this.name, this.email, this.phone, this.password, newValue, this.panId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link User#panId() panId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for panId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUser withPanId(String value) {
    String newValue = Objects.requireNonNull(value, "panId");
    if (this.panId.equals(newValue)) return this;
    return new ImmutableUser(this.uuid, this.name, this.email, this.phone, this.password, this.aadharId, newValue);
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
    return Objects.equals(uuid, another.uuid)
        && name.equals(another.name)
        && email.equals(another.email)
        && Objects.equals(phone, another.phone)
        && password.equals(another.password)
        && aadharId.equals(another.aadharId)
        && panId.equals(another.panId);
  }

  /**
   * Computes a hash code from attributes: {@code uuid}, {@code name}, {@code email}, {@code phone}, {@code password}, {@code aadharId}, {@code panId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Objects.hashCode(uuid);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + email.hashCode();
    h += (h << 5) + Objects.hashCode(phone);
    h += (h << 5) + password.hashCode();
    h += (h << 5) + aadharId.hashCode();
    h += (h << 5) + panId.hashCode();
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
        .add("uuid", uuid)
        .add("name", name)
        .add("email", email)
        .add("phone", phone)
        .add("password", password)
        .add("aadharId", aadharId)
        .add("panId", panId)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "User", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements User {
    @Nullable Optional<String> uuid = Optional.empty();
    @Nullable String name;
    @Nullable String email;
    @Nullable Optional<String> phone = Optional.empty();
    @Nullable String password;
    @Nullable String aadharId;
    @Nullable String panId;
    @JsonProperty
    public void setUuid(Optional<String> uuid) {
      this.uuid = uuid;
    }
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
    public void setPassword(String password) {
      this.password = password;
    }
    @JsonProperty
    public void setAadharId(String aadharId) {
      this.aadharId = aadharId;
    }
    @JsonProperty
    public void setPanId(String panId) {
      this.panId = panId;
    }
    @Override
    public Optional<String> uuid() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String email() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> phone() { throw new UnsupportedOperationException(); }
    @Override
    public String password() { throw new UnsupportedOperationException(); }
    @Override
    public String aadharId() { throw new UnsupportedOperationException(); }
    @Override
    public String panId() { throw new UnsupportedOperationException(); }
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
    if (json.uuid != null) {
      builder.uuid(json.uuid);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.email != null) {
      builder.email(json.email);
    }
    if (json.phone != null) {
      builder.phone(json.phone);
    }
    if (json.password != null) {
      builder.password(json.password);
    }
    if (json.aadharId != null) {
      builder.aadharId(json.aadharId);
    }
    if (json.panId != null) {
      builder.panId(json.panId);
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
    private static final long INIT_BIT_PASSWORD = 0x4L;
    private static final long INIT_BIT_AADHAR_ID = 0x8L;
    private static final long INIT_BIT_PAN_ID = 0x10L;
    private long initBits = 0x1fL;

    private @Nullable String uuid;
    private @Nullable String name;
    private @Nullable String email;
    private @Nullable String phone;
    private @Nullable String password;
    private @Nullable String aadharId;
    private @Nullable String panId;

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
      Optional<String> uuidOptional = instance.uuid();
      if (uuidOptional.isPresent()) {
        uuid(uuidOptional);
      }
      name(instance.name());
      email(instance.email());
      Optional<String> phoneOptional = instance.phone();
      if (phoneOptional.isPresent()) {
        phone(phoneOptional);
      }
      password(instance.password());
      aadharId(instance.aadharId());
      panId(instance.panId());
      return this;
    }

    /**
     * Initializes the optional value {@link User#uuid() uuid} to uuid.
     * @param uuid The value for uuid
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder uuid(String uuid) {
      this.uuid = Objects.requireNonNull(uuid, "uuid");
      return this;
    }

    /**
     * Initializes the optional value {@link User#uuid() uuid} to uuid.
     * @param uuid The value for uuid
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder uuid(Optional<String> uuid) {
      this.uuid = uuid.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link User#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
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
    @JsonProperty
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
    @JsonProperty
    public final Builder phone(Optional<String> phone) {
      this.phone = phone.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link User#password() password} attribute.
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
     * Initializes the value for the {@link User#aadharId() aadharId} attribute.
     * @param aadharId The value for aadharId 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder aadharId(String aadharId) {
      this.aadharId = Objects.requireNonNull(aadharId, "aadharId");
      initBits &= ~INIT_BIT_AADHAR_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link User#panId() panId} attribute.
     * @param panId The value for panId 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder panId(String panId) {
      this.panId = Objects.requireNonNull(panId, "panId");
      initBits &= ~INIT_BIT_PAN_ID;
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
      return new ImmutableUser(uuid, name, email, phone, password, aadharId, panId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_EMAIL) != 0) attributes.add("email");
      if ((initBits & INIT_BIT_PASSWORD) != 0) attributes.add("password");
      if ((initBits & INIT_BIT_AADHAR_ID) != 0) attributes.add("aadharId");
      if ((initBits & INIT_BIT_PAN_ID) != 0) attributes.add("panId");
      return "Cannot build User, some of required attributes are not set " + attributes;
    }
  }
}
