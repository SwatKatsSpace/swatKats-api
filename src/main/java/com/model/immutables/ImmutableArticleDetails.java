package com.model.immutables;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

import com.model.ArticleDetails;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ArticleDetails}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableArticleDetails.builder()}.
 */
@Generated(from = "ArticleDetails", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Immutable
@CheckReturnValue
public final class ImmutableArticleDetails implements ArticleDetails {
  private final String[] photo;
  private final String lat;
  private final String lng;
  private final Object address;
  private final Object info;

  private ImmutableArticleDetails(
      String[] photo,
      String lat,
      String lng,
      Object address,
      Object info) {
    this.photo = photo;
    this.lat = lat;
    this.lng = lng;
    this.address = address;
    this.info = info;
  }

  /**
   * @return A cloned {@code photo} array
   */
  @Override
  public String[] photo() {
    return photo.clone();
  }

  /**
   * @return The value of the {@code lat} attribute
   */
  @Override
  public String lat() {
    return lat;
  }

  /**
   * @return The value of the {@code lng} attribute
   */
  @Override
  public String lng() {
    return lng;
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
   * Copy the current immutable object with elements that replace the content of {@link ArticleDetails#photo() photo}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for photo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableArticleDetails withPhoto(String... elements) {
    String[] newValue = elements.clone();
    return new ImmutableArticleDetails(newValue, this.lat, this.lng, this.address, this.info);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleDetails#lat() lat} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lat
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleDetails withLat(String value) {
    String newValue = Objects.requireNonNull(value, "lat");
    if (this.lat.equals(newValue)) return this;
    return new ImmutableArticleDetails(this.photo, newValue, this.lng, this.address, this.info);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleDetails#lng() lng} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lng
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleDetails withLng(String value) {
    String newValue = Objects.requireNonNull(value, "lng");
    if (this.lng.equals(newValue)) return this;
    return new ImmutableArticleDetails(this.photo, this.lat, newValue, this.address, this.info);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleDetails#address() address} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for address
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleDetails withAddress(Object value) {
    if (this.address == value) return this;
    Object newValue = Objects.requireNonNull(value, "address");
    return new ImmutableArticleDetails(this.photo, this.lat, this.lng, newValue, this.info);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleDetails#info() info} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for info
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleDetails withInfo(Object value) {
    if (this.info == value) return this;
    Object newValue = Objects.requireNonNull(value, "info");
    return new ImmutableArticleDetails(this.photo, this.lat, this.lng, this.address, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableArticleDetails} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableArticleDetails
        && equalTo((ImmutableArticleDetails) another);
  }

  private boolean equalTo(ImmutableArticleDetails another) {
    return Arrays.equals(photo, another.photo)
        && lat.equals(another.lat)
        && lng.equals(another.lng)
        && address.equals(another.address)
        && info.equals(another.info);
  }

  /**
   * Computes a hash code from attributes: {@code photo}, {@code lat}, {@code lng}, {@code address}, {@code info}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Arrays.hashCode(photo);
    h += (h << 5) + lat.hashCode();
    h += (h << 5) + lng.hashCode();
    h += (h << 5) + address.hashCode();
    h += (h << 5) + info.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ArticleDetails} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ArticleDetails")
        .omitNullValues()
        .add("photo", Arrays.toString(photo))
        .add("lat", lat)
        .add("lng", lng)
        .add("address", address)
        .add("info", info)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link ArticleDetails} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ArticleDetails instance
   */
  public static ImmutableArticleDetails copyOf(ArticleDetails instance) {
    if (instance instanceof ImmutableArticleDetails) {
      return (ImmutableArticleDetails) instance;
    }
    return ImmutableArticleDetails.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableArticleDetails ImmutableArticleDetails}.
   * @return A new ImmutableArticleDetails builder
   */
  public static ImmutableArticleDetails.Builder builder() {
    return new ImmutableArticleDetails.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableArticleDetails ImmutableArticleDetails}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ArticleDetails", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PHOTO = 0x1L;
    private static final long INIT_BIT_LAT = 0x2L;
    private static final long INIT_BIT_LNG = 0x4L;
    private static final long INIT_BIT_ADDRESS = 0x8L;
    private static final long INIT_BIT_INFO = 0x10L;
    private long initBits = 0x1fL;

    private @Nullable String[] photo;
    private @Nullable String lat;
    private @Nullable String lng;
    private @Nullable Object address;
    private @Nullable Object info;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ArticleDetails} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(ArticleDetails instance) {
      Objects.requireNonNull(instance, "instance");
      photo(instance.photo());
      lat(instance.lat());
      lng(instance.lng());
      address(instance.address());
      info(instance.info());
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleDetails#photo() photo} attribute.
     * @param photo The elements for photo
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder photo(String... photo) {
      this.photo = photo.clone();
      initBits &= ~INIT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleDetails#lat() lat} attribute.
     * @param lat The value for lat 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder lat(String lat) {
      this.lat = Objects.requireNonNull(lat, "lat");
      initBits &= ~INIT_BIT_LAT;
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleDetails#lng() lng} attribute.
     * @param lng The value for lng 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder lng(String lng) {
      this.lng = Objects.requireNonNull(lng, "lng");
      initBits &= ~INIT_BIT_LNG;
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleDetails#address() address} attribute.
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
     * Initializes the value for the {@link ArticleDetails#info() info} attribute.
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
     * Builds a new {@link ImmutableArticleDetails ImmutableArticleDetails}.
     * @return An immutable instance of ArticleDetails
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableArticleDetails build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableArticleDetails(photo, lat, lng, address, info);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_PHOTO) != 0) attributes.add("photo");
      if ((initBits & INIT_BIT_LAT) != 0) attributes.add("lat");
      if ((initBits & INIT_BIT_LNG) != 0) attributes.add("lng");
      if ((initBits & INIT_BIT_ADDRESS) != 0) attributes.add("address");
      if ((initBits & INIT_BIT_INFO) != 0) attributes.add("info");
      return "Cannot build ArticleDetails, some of required attributes are not set " + attributes;
    }
  }
}
