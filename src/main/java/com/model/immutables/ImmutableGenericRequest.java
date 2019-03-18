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
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link GenericRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGenericRequest.builder()}.
 */
@Generated(from = "GenericRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableGenericRequest implements GenericRequest {
  private final Object body;
  private final String token;

  private ImmutableGenericRequest(Object body, String token) {
    this.body = body;
    this.token = token;
  }

  /**
   * @return The value of the {@code body} attribute
   */
  @JsonProperty("body")
  @Override
  public Object body() {
    return body;
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
   * Copy the current immutable object by setting a value for the {@link GenericRequest#body() body} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for body
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGenericRequest withBody(Object value) {
    if (this.body == value) return this;
    Object newValue = Objects.requireNonNull(value, "body");
    return new ImmutableGenericRequest(newValue, this.token);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GenericRequest#token() token} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for token
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGenericRequest withToken(String value) {
    String newValue = Objects.requireNonNull(value, "token");
    if (this.token.equals(newValue)) return this;
    return new ImmutableGenericRequest(this.body, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGenericRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGenericRequest
        && equalTo((ImmutableGenericRequest) another);
  }

  private boolean equalTo(ImmutableGenericRequest another) {
    return body.equals(another.body)
        && token.equals(another.token);
  }

  /**
   * Computes a hash code from attributes: {@code body}, {@code token}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + body.hashCode();
    h += (h << 5) + token.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code GenericRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("GenericRequest")
        .omitNullValues()
        .add("body", body)
        .add("token", token)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "GenericRequest", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements GenericRequest {
    @Nullable Object body;
    @Nullable String token;
    @JsonProperty("body")
    public void setBody(Object body) {
      this.body = body;
    }
    @JsonProperty("token")
    public void setToken(String token) {
      this.token = token;
    }
    @Override
    public Object body() { throw new UnsupportedOperationException(); }
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
  static ImmutableGenericRequest fromJson(Json json) {
    ImmutableGenericRequest.Builder builder = ImmutableGenericRequest.builder();
    if (json.body != null) {
      builder.body(json.body);
    }
    if (json.token != null) {
      builder.token(json.token);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GenericRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GenericRequest instance
   */
  public static ImmutableGenericRequest copyOf(GenericRequest instance) {
    if (instance instanceof ImmutableGenericRequest) {
      return (ImmutableGenericRequest) instance;
    }
    return ImmutableGenericRequest.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableGenericRequest ImmutableGenericRequest}.
   * @return A new ImmutableGenericRequest builder
   */
  public static ImmutableGenericRequest.Builder builder() {
    return new ImmutableGenericRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableGenericRequest ImmutableGenericRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "GenericRequest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_BODY = 0x1L;
    private static final long INIT_BIT_TOKEN = 0x2L;
    private long initBits = 0x3L;

    private @Nullable Object body;
    private @Nullable String token;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code GenericRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(GenericRequest instance) {
      Objects.requireNonNull(instance, "instance");
      body(instance.body());
      token(instance.token());
      return this;
    }

    /**
     * Initializes the value for the {@link GenericRequest#body() body} attribute.
     * @param body The value for body 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("body")
    public final Builder body(Object body) {
      this.body = Objects.requireNonNull(body, "body");
      initBits &= ~INIT_BIT_BODY;
      return this;
    }

    /**
     * Initializes the value for the {@link GenericRequest#token() token} attribute.
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
     * Builds a new {@link ImmutableGenericRequest ImmutableGenericRequest}.
     * @return An immutable instance of GenericRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableGenericRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableGenericRequest(body, token);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_BODY) != 0) attributes.add("body");
      if ((initBits & INIT_BIT_TOKEN) != 0) attributes.add("token");
      return "Cannot build GenericRequest, some of required attributes are not set " + attributes;
    }
  }
}
