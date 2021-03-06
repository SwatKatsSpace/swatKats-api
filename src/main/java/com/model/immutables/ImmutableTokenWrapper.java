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
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

import com.model.TokenWrapper;
import com.model.User;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link TokenWrapper}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTokenWrapper.builder()}.
 */
@Generated(from = "TokenWrapper", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableTokenWrapper implements TokenWrapper {
  private final User user;
  private final String token;

  private ImmutableTokenWrapper(User user, String token) {
    this.user = user;
    this.token = token;
  }

  /**
   * @return The value of the {@code user} attribute
   */
  @JsonProperty("user")
  @Override
  public User user() {
    return user;
  }

  /**
   * @return The value of the {@code token} attribute
   */
  @JsonProperty("token")
  @Override
  public String token() {
    return token;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TokenWrapper#user() user} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for user
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTokenWrapper withUser(User value) {
    if (this.user == value) return this;
    User newValue = Objects.requireNonNull(value, "user");
    return new ImmutableTokenWrapper(newValue, this.token);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TokenWrapper#token() token} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for token
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTokenWrapper withToken(String value) {
    String newValue = Objects.requireNonNull(value, "token");
    if (this.token.equals(newValue)) return this;
    return new ImmutableTokenWrapper(this.user, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTokenWrapper} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTokenWrapper
        && equalTo((ImmutableTokenWrapper) another);
  }

  private boolean equalTo(ImmutableTokenWrapper another) {
    return user.equals(another.user)
        && token.equals(another.token);
  }

  /**
   * Computes a hash code from attributes: {@code user}, {@code token}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + user.hashCode();
    h += (h << 5) + token.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TokenWrapper} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TokenWrapper")
        .omitNullValues()
        .add("user", user)
        .add("token", token)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TokenWrapper", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TokenWrapper {
    @Nullable User user;
    @Nullable String token;
    @JsonProperty("user")
    public void setUser(User user) {
      this.user = user;
    }
    @JsonProperty("token")
    public void setToken(String token) {
      this.token = token;
    }
    @Override
    public User user() { throw new UnsupportedOperationException(); }
    @Override
    public String token() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTokenWrapper fromJson(Json json) {
    ImmutableTokenWrapper.Builder builder = ImmutableTokenWrapper.builder();
    if (json.user != null) {
      builder.user(json.user);
    }
    if (json.token != null) {
      builder.token(json.token);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TokenWrapper} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TokenWrapper instance
   */
  public static ImmutableTokenWrapper copyOf(TokenWrapper instance) {
    if (instance instanceof ImmutableTokenWrapper) {
      return (ImmutableTokenWrapper) instance;
    }
    return ImmutableTokenWrapper.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTokenWrapper ImmutableTokenWrapper}.
   * @return A new ImmutableTokenWrapper builder
   */
  public static ImmutableTokenWrapper.Builder builder() {
    return new ImmutableTokenWrapper.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTokenWrapper ImmutableTokenWrapper}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TokenWrapper", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_USER = 0x1L;
    private static final long INIT_BIT_TOKEN = 0x2L;
    private long initBits = 0x3L;

    private @Nullable User user;
    private @Nullable String token;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TokenWrapper} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(TokenWrapper instance) {
      Objects.requireNonNull(instance, "instance");
      user(instance.user());
      token(instance.token());
      return this;
    }

    /**
     * Initializes the value for the {@link TokenWrapper#user() user} attribute.
     * @param user The value for user 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("user")
    public final Builder user(User user) {
      this.user = Objects.requireNonNull(user, "user");
      initBits &= ~INIT_BIT_USER;
      return this;
    }

    /**
     * Initializes the value for the {@link TokenWrapper#token() token} attribute.
     * @param token The value for token 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("token")
    public final Builder token(String token) {
      this.token = Objects.requireNonNull(token, "token");
      initBits &= ~INIT_BIT_TOKEN;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTokenWrapper ImmutableTokenWrapper}.
     * @return An immutable instance of TokenWrapper
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTokenWrapper build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTokenWrapper(user, token);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_USER) != 0) attributes.add("user");
      if ((initBits & INIT_BIT_TOKEN) != 0) attributes.add("token");
      return "Cannot build TokenWrapper, some of required attributes are not set " + attributes;
    }
  }
}
