package com.model.immutables;

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

import com.model.Article;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Article}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableArticle.builder()}.
 */
@Generated(from = "Article", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Immutable
@CheckReturnValue
public final class ImmutableArticle implements Article {
  private final String name;
  private final String email;
  private final @Nullable String phone;
  private final String aadharId;
  private final String panId;

  private ImmutableArticle(
      String name,
      String email,
      @Nullable String phone,
      String aadharId,
      String panId) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.aadharId = aadharId;
    this.panId = panId;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code email} attribute
   */
  @Override
  public String email() {
    return email;
  }

  /**
   * @return The value of the {@code phone} attribute
   */
  @Override
  public Optional<String> phone() {
    return Optional.ofNullable(phone);
  }

  /**
   * @return The value of the {@code aadharId} attribute
   */
  @Override
  public String aadharId() {
    return aadharId;
  }

  /**
   * @return The value of the {@code panId} attribute
   */
  @Override
  public String panId() {
    return panId;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Article#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticle withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableArticle(newValue, this.email, this.phone, this.aadharId, this.panId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Article#email() email} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for email
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticle withEmail(String value) {
    String newValue = Objects.requireNonNull(value, "email");
    if (this.email.equals(newValue)) return this;
    return new ImmutableArticle(this.name, newValue, this.phone, this.aadharId, this.panId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Article#phone() phone} attribute.
   * @param value The value for phone
   * @return A modified copy of {@code this} object
   */
  public final ImmutableArticle withPhone(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "phone");
    if (Objects.equals(this.phone, newValue)) return this;
    return new ImmutableArticle(this.name, this.email, newValue, this.aadharId, this.panId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Article#phone() phone} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for phone
   * @return A modified copy of {@code this} object
   */
  public final ImmutableArticle withPhone(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.phone, value)) return this;
    return new ImmutableArticle(this.name, this.email, value, this.aadharId, this.panId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Article#aadharId() aadharId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for aadharId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticle withAadharId(String value) {
    String newValue = Objects.requireNonNull(value, "aadharId");
    if (this.aadharId.equals(newValue)) return this;
    return new ImmutableArticle(this.name, this.email, this.phone, newValue, this.panId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Article#panId() panId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for panId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticle withPanId(String value) {
    String newValue = Objects.requireNonNull(value, "panId");
    if (this.panId.equals(newValue)) return this;
    return new ImmutableArticle(this.name, this.email, this.phone, this.aadharId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableArticle} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableArticle
        && equalTo((ImmutableArticle) another);
  }

  private boolean equalTo(ImmutableArticle another) {
    return name.equals(another.name)
        && email.equals(another.email)
        && Objects.equals(phone, another.phone)
        && aadharId.equals(another.aadharId)
        && panId.equals(another.panId);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code email}, {@code phone}, {@code aadharId}, {@code panId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + email.hashCode();
    h += (h << 5) + Objects.hashCode(phone);
    h += (h << 5) + aadharId.hashCode();
    h += (h << 5) + panId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Article} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Article")
        .omitNullValues()
        .add("name", name)
        .add("email", email)
        .add("phone", phone)
        .add("aadharId", aadharId)
        .add("panId", panId)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Article} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Article instance
   */
  public static ImmutableArticle copyOf(Article instance) {
    if (instance instanceof ImmutableArticle) {
      return (ImmutableArticle) instance;
    }
    return ImmutableArticle.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableArticle ImmutableArticle}.
   * @return A new ImmutableArticle builder
   */
  public static ImmutableArticle.Builder builder() {
    return new ImmutableArticle.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableArticle ImmutableArticle}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Article", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_EMAIL = 0x2L;
    private static final long INIT_BIT_AADHAR_ID = 0x4L;
    private static final long INIT_BIT_PAN_ID = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String name;
    private @Nullable String email;
    private @Nullable String phone;
    private @Nullable String aadharId;
    private @Nullable String panId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Article} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Article instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      email(instance.email());
      Optional<String> phoneOptional = instance.phone();
      if (phoneOptional.isPresent()) {
        phone(phoneOptional);
      }
      aadharId(instance.aadharId());
      panId(instance.panId());
      return this;
    }

    /**
     * Initializes the value for the {@link Article#name() name} attribute.
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
     * Initializes the value for the {@link Article#email() email} attribute.
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
     * Initializes the optional value {@link Article#phone() phone} to phone.
     * @param phone The value for phone
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder phone(String phone) {
      this.phone = Objects.requireNonNull(phone, "phone");
      return this;
    }

    /**
     * Initializes the optional value {@link Article#phone() phone} to phone.
     * @param phone The value for phone
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder phone(Optional<String> phone) {
      this.phone = phone.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Article#aadharId() aadharId} attribute.
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
     * Initializes the value for the {@link Article#panId() panId} attribute.
     * @param panId The value for panId 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder panId(String panId) {
      this.panId = Objects.requireNonNull(panId, "panId");
      initBits &= ~INIT_BIT_PAN_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutableArticle ImmutableArticle}.
     * @return An immutable instance of Article
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableArticle build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableArticle(name, email, phone, aadharId, panId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_EMAIL) != 0) attributes.add("email");
      if ((initBits & INIT_BIT_AADHAR_ID) != 0) attributes.add("aadharId");
      if ((initBits & INIT_BIT_PAN_ID) != 0) attributes.add("panId");
      return "Cannot build Article, some of required attributes are not set " + attributes;
    }
  }
}
