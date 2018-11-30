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

import com.model.User;
import com.model.UserCompleInfo;
import com.model.UserDetails;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link UserCompleInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserCompleInfo.builder()}.
 */
@Generated(from = "UserCompleInfo", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableUserCompleInfo implements UserCompleInfo {
  private final User user;
  private final UserDetails userDetails;

  private ImmutableUserCompleInfo(User user, UserDetails userDetails) {
    this.user = user;
    this.userDetails = userDetails;
  }

  /**
   * @return The value of the {@code user} attribute
   */
  @JsonProperty
  @Override
  public User user() {
    return user;
  }

  /**
   * @return The value of the {@code userDetails} attribute
   */
  @JsonProperty
  @Override
  public UserDetails userDetails() {
    return userDetails;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserCompleInfo#user() user} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for user
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserCompleInfo withUser(User value) {
    if (this.user == value) return this;
    User newValue = Objects.requireNonNull(value, "user");
    return new ImmutableUserCompleInfo(newValue, this.userDetails);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserCompleInfo#userDetails() userDetails} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userDetails
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserCompleInfo withUserDetails(UserDetails value) {
    if (this.userDetails == value) return this;
    UserDetails newValue = Objects.requireNonNull(value, "userDetails");
    return new ImmutableUserCompleInfo(this.user, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserCompleInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserCompleInfo
        && equalTo((ImmutableUserCompleInfo) another);
  }

  private boolean equalTo(ImmutableUserCompleInfo another) {
    return user.equals(another.user)
        && userDetails.equals(another.userDetails);
  }

  /**
   * Computes a hash code from attributes: {@code user}, {@code userDetails}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + user.hashCode();
    h += (h << 5) + userDetails.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UserCompleInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("UserCompleInfo")
        .omitNullValues()
        .add("user", user)
        .add("userDetails", userDetails)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "UserCompleInfo", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements UserCompleInfo {
    @Nullable User user;
    @Nullable UserDetails userDetails;
    @JsonProperty
    public void setUser(User user) {
      this.user = user;
    }
    @JsonProperty
    public void setUserDetails(UserDetails userDetails) {
      this.userDetails = userDetails;
    }
    @Override
    public User user() { throw new UnsupportedOperationException(); }
    @Override
    public UserDetails userDetails() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUserCompleInfo fromJson(Json json) {
    ImmutableUserCompleInfo.Builder builder = ImmutableUserCompleInfo.builder();
    if (json.user != null) {
      builder.user(json.user);
    }
    if (json.userDetails != null) {
      builder.userDetails(json.userDetails);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UserCompleInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserCompleInfo instance
   */
  public static ImmutableUserCompleInfo copyOf(UserCompleInfo instance) {
    if (instance instanceof ImmutableUserCompleInfo) {
      return (ImmutableUserCompleInfo) instance;
    }
    return ImmutableUserCompleInfo.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUserCompleInfo ImmutableUserCompleInfo}.
   * @return A new ImmutableUserCompleInfo builder
   */
  public static ImmutableUserCompleInfo.Builder builder() {
    return new ImmutableUserCompleInfo.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUserCompleInfo ImmutableUserCompleInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "UserCompleInfo", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_USER = 0x1L;
    private static final long INIT_BIT_USER_DETAILS = 0x2L;
    private long initBits = 0x3L;

    private @Nullable User user;
    private @Nullable UserDetails userDetails;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UserCompleInfo} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(UserCompleInfo instance) {
      Objects.requireNonNull(instance, "instance");
      user(instance.user());
      userDetails(instance.userDetails());
      return this;
    }

    /**
     * Initializes the value for the {@link UserCompleInfo#user() user} attribute.
     * @param user The value for user 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder user(User user) {
      this.user = Objects.requireNonNull(user, "user");
      initBits &= ~INIT_BIT_USER;
      return this;
    }

    /**
     * Initializes the value for the {@link UserCompleInfo#userDetails() userDetails} attribute.
     * @param userDetails The value for userDetails 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder userDetails(UserDetails userDetails) {
      this.userDetails = Objects.requireNonNull(userDetails, "userDetails");
      initBits &= ~INIT_BIT_USER_DETAILS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUserCompleInfo ImmutableUserCompleInfo}.
     * @return An immutable instance of UserCompleInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUserCompleInfo build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUserCompleInfo(user, userDetails);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_USER) != 0) attributes.add("user");
      if ((initBits & INIT_BIT_USER_DETAILS) != 0) attributes.add("userDetails");
      return "Cannot build UserCompleInfo, some of required attributes are not set " + attributes;
    }
  }
}
