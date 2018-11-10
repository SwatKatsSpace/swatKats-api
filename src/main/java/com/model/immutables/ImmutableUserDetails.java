package com.model.immutables;

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

import com.model.UserDetails;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link UserDetails}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserDetails.builder()}.
 */
@Generated(from = "UserDetails", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableUserDetails implements UserDetails {
  private final Object address;
  private final Object info;

  private ImmutableUserDetails(Object address, Object info) {
    this.address = address;
    this.info = info;
  }

  /**
   * @return The value of the {@code address} attribute
   */
  @Override
  public Object address() {
    return address;
  }

  /**
   * @return The value of the {@code info} attribute
   */
  @Override
  public Object info() {
    return info;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserDetails#address() address} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for address
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserDetails withAddress(Object value) {
    if (this.address == value) return this;
    Object newValue = Objects.requireNonNull(value, "address");
    return new ImmutableUserDetails(newValue, this.info);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserDetails#info() info} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for info
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserDetails withInfo(Object value) {
    if (this.info == value) return this;
    Object newValue = Objects.requireNonNull(value, "info");
    return new ImmutableUserDetails(this.address, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserDetails} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserDetails
        && equalTo((ImmutableUserDetails) another);
  }

  private boolean equalTo(ImmutableUserDetails another) {
    return address.equals(another.address)
        && info.equals(another.info);
  }

  /**
   * Computes a hash code from attributes: {@code address}, {@code info}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + address.hashCode();
    h += (h << 5) + info.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UserDetails} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("UserDetails")
        .omitNullValues()
        .add("address", address)
        .add("info", info)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link UserDetails} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserDetails instance
   */
  public static ImmutableUserDetails copyOf(UserDetails instance) {
    if (instance instanceof ImmutableUserDetails) {
      return (ImmutableUserDetails) instance;
    }
    return ImmutableUserDetails.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUserDetails ImmutableUserDetails}.
   * @return A new ImmutableUserDetails builder
   */
  public static Builder builder() {
    return new Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUserDetails ImmutableUserDetails}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "UserDetails", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ADDRESS = 0x1L;
    private static final long INIT_BIT_INFO = 0x2L;
    private long initBits = 0x3L;

    private @Nullable Object address;
    private @Nullable Object info;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UserDetails} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(UserDetails instance) {
      Objects.requireNonNull(instance, "instance");
      address(instance.address());
      info(instance.info());
      return this;
    }

    /**
     * Initializes the value for the {@link UserDetails#address() address} attribute.
     * @param address The value for address 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder address(Object address) {
      this.address = Objects.requireNonNull(address, "address");
      initBits &= ~INIT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the value for the {@link UserDetails#info() info} attribute.
     * @param info The value for info 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder info(Object info) {
      this.info = Objects.requireNonNull(info, "info");
      initBits &= ~INIT_BIT_INFO;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUserDetails ImmutableUserDetails}.
     * @return An immutable instance of UserDetails
     * @throws IllegalStateException if any required attributes are missing
     */
    public ImmutableUserDetails build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUserDetails(address, info);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ADDRESS) != 0) attributes.add("address");
      if ((initBits & INIT_BIT_INFO) != 0) attributes.add("info");
      return "Cannot build UserDetails, some of required attributes are not set " + attributes;
    }
  }
}
