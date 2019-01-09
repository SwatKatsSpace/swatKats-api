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
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableArticle implements Article {
  private final String uuid;
  private final String firstName;
  private final String lastName;
  private final String email;
  private final @Nullable String phone;
  private final String aadharId;
  private final String panId;
  private final String image;
  private final String relation;
  private final String description;
  private final String likes;

  private ImmutableArticle(
      String uuid,
      String firstName,
      String lastName,
      String email,
      @Nullable String phone,
      String aadharId,
      String panId,
      String image,
      String relation,
      String description,
      String likes) {
    this.uuid = uuid;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
    this.aadharId = aadharId;
    this.panId = panId;
    this.image = image;
    this.relation = relation;
    this.description = description;
    this.likes = likes;
  }

  /**
   * @return The value of the {@code uuid} attribute
   */
  @JsonProperty
  @Override
  public String uuid() {
    return uuid;
  }

  /**
   * @return The value of the {@code firstName} attribute
   */
  @JsonProperty
  @Override
  public String firstName() {
    return firstName;
  }

  /**
   * @return The value of the {@code lastName} attribute
   */
  @JsonProperty
  @Override
  public String lastName() {
    return lastName;
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
   * @return The value of the {@code panId} attribute
   */
  @JsonProperty
  @Override
  public String panId() {
    return panId;
  }

  /**
   * @return The value of the {@code image} attribute
   */
  @JsonProperty
  @Override
  public String image() {
    return image;
  }

  /**
   * @return The value of the {@code relation} attribute
   */
  @JsonProperty
  @Override
  public String relation() {
    return relation;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty
  @Override
  public String description() {
    return description;
  }

  /**
   * @return The value of the {@code likes} attribute
   */
  @JsonProperty
  @Override
  public String likes() {
    return likes;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Article#uuid() uuid} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for uuid
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticle withUuid(String value) {
    String newValue = Objects.requireNonNull(value, "uuid");
    if (this.uuid.equals(newValue)) return this;
    return new ImmutableArticle(
        newValue,
        this.firstName,
        this.lastName,
        this.email,
        this.phone,
        this.aadharId,
        this.panId,
        this.image,
        this.relation,
        this.description,
        this.likes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Article#firstName() firstName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for firstName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticle withFirstName(String value) {
    String newValue = Objects.requireNonNull(value, "firstName");
    if (this.firstName.equals(newValue)) return this;
    return new ImmutableArticle(
        this.uuid,
        newValue,
        this.lastName,
        this.email,
        this.phone,
        this.aadharId,
        this.panId,
        this.image,
        this.relation,
        this.description,
        this.likes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Article#lastName() lastName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticle withLastName(String value) {
    String newValue = Objects.requireNonNull(value, "lastName");
    if (this.lastName.equals(newValue)) return this;
    return new ImmutableArticle(
        this.uuid,
        this.firstName,
        newValue,
        this.email,
        this.phone,
        this.aadharId,
        this.panId,
        this.image,
        this.relation,
        this.description,
        this.likes);
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
    return new ImmutableArticle(
        this.uuid,
        this.firstName,
        this.lastName,
        newValue,
        this.phone,
        this.aadharId,
        this.panId,
        this.image,
        this.relation,
        this.description,
        this.likes);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Article#phone() phone} attribute.
   * @param value The value for phone
   * @return A modified copy of {@code this} object
   */
  public final ImmutableArticle withPhone(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "phone");
    if (Objects.equals(this.phone, newValue)) return this;
    return new ImmutableArticle(
        this.uuid,
        this.firstName,
        this.lastName,
        this.email,
        newValue,
        this.aadharId,
        this.panId,
        this.image,
        this.relation,
        this.description,
        this.likes);
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
    return new ImmutableArticle(
        this.uuid,
        this.firstName,
        this.lastName,
        this.email,
        value,
        this.aadharId,
        this.panId,
        this.image,
        this.relation,
        this.description,
        this.likes);
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
    return new ImmutableArticle(
        this.uuid,
        this.firstName,
        this.lastName,
        this.email,
        this.phone,
        newValue,
        this.panId,
        this.image,
        this.relation,
        this.description,
        this.likes);
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
    return new ImmutableArticle(
        this.uuid,
        this.firstName,
        this.lastName,
        this.email,
        this.phone,
        this.aadharId,
        newValue,
        this.image,
        this.relation,
        this.description,
        this.likes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Article#image() image} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for image
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticle withImage(String value) {
    String newValue = Objects.requireNonNull(value, "image");
    if (this.image.equals(newValue)) return this;
    return new ImmutableArticle(
        this.uuid,
        this.firstName,
        this.lastName,
        this.email,
        this.phone,
        this.aadharId,
        this.panId,
        newValue,
        this.relation,
        this.description,
        this.likes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Article#relation() relation} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for relation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticle withRelation(String value) {
    String newValue = Objects.requireNonNull(value, "relation");
    if (this.relation.equals(newValue)) return this;
    return new ImmutableArticle(
        this.uuid,
        this.firstName,
        this.lastName,
        this.email,
        this.phone,
        this.aadharId,
        this.panId,
        this.image,
        newValue,
        this.description,
        this.likes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Article#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticle withDescription(String value) {
    String newValue = Objects.requireNonNull(value, "description");
    if (this.description.equals(newValue)) return this;
    return new ImmutableArticle(
        this.uuid,
        this.firstName,
        this.lastName,
        this.email,
        this.phone,
        this.aadharId,
        this.panId,
        this.image,
        this.relation,
        newValue,
        this.likes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Article#likes() likes} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for likes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticle withLikes(String value) {
    String newValue = Objects.requireNonNull(value, "likes");
    if (this.likes.equals(newValue)) return this;
    return new ImmutableArticle(
        this.uuid,
        this.firstName,
        this.lastName,
        this.email,
        this.phone,
        this.aadharId,
        this.panId,
        this.image,
        this.relation,
        this.description,
        newValue);
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
    return uuid.equals(another.uuid)
        && firstName.equals(another.firstName)
        && lastName.equals(another.lastName)
        && email.equals(another.email)
        && Objects.equals(phone, another.phone)
        && aadharId.equals(another.aadharId)
        && panId.equals(another.panId)
        && image.equals(another.image)
        && relation.equals(another.relation)
        && description.equals(another.description)
        && likes.equals(another.likes);
  }

  /**
   * Computes a hash code from attributes: {@code uuid}, {@code firstName}, {@code lastName}, {@code email}, {@code phone}, {@code aadharId}, {@code panId}, {@code image}, {@code relation}, {@code description}, {@code likes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + uuid.hashCode();
    h += (h << 5) + firstName.hashCode();
    h += (h << 5) + lastName.hashCode();
    h += (h << 5) + email.hashCode();
    h += (h << 5) + Objects.hashCode(phone);
    h += (h << 5) + aadharId.hashCode();
    h += (h << 5) + panId.hashCode();
    h += (h << 5) + image.hashCode();
    h += (h << 5) + relation.hashCode();
    h += (h << 5) + description.hashCode();
    h += (h << 5) + likes.hashCode();
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
        .add("uuid", uuid)
        .add("firstName", firstName)
        .add("lastName", lastName)
        .add("email", email)
        .add("phone", phone)
        .add("aadharId", aadharId)
        .add("panId", panId)
        .add("image", image)
        .add("relation", relation)
        .add("description", description)
        .add("likes", likes)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Article", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Article {
    @Nullable String uuid;
    @Nullable String firstName;
    @Nullable String lastName;
    @Nullable String email;
    @Nullable Optional<String> phone = Optional.empty();
    @Nullable String aadharId;
    @Nullable String panId;
    @Nullable String image;
    @Nullable String relation;
    @Nullable String description;
    @Nullable String likes;
    @JsonProperty
    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    @JsonProperty
    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }
    @JsonProperty
    public void setLastName(String lastName) {
      this.lastName = lastName;
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
    @JsonProperty
    public void setPanId(String panId) {
      this.panId = panId;
    }
    @JsonProperty
    public void setImage(String image) {
      this.image = image;
    }
    @JsonProperty
    public void setRelation(String relation) {
      this.relation = relation;
    }
    @JsonProperty
    public void setDescription(String description) {
      this.description = description;
    }
    @JsonProperty
    public void setLikes(String likes) {
      this.likes = likes;
    }
    @Override
    public String uuid() { throw new UnsupportedOperationException(); }
    @Override
    public String firstName() { throw new UnsupportedOperationException(); }
    @Override
    public String lastName() { throw new UnsupportedOperationException(); }
    @Override
    public String email() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> phone() { throw new UnsupportedOperationException(); }
    @Override
    public String aadharId() { throw new UnsupportedOperationException(); }
    @Override
    public String panId() { throw new UnsupportedOperationException(); }
    @Override
    public String image() { throw new UnsupportedOperationException(); }
    @Override
    public String relation() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
    @Override
    public String likes() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableArticle fromJson(Json json) {
    Builder builder = ImmutableArticle.builder();
    if (json.uuid != null) {
      builder.uuid(json.uuid);
    }
    if (json.firstName != null) {
      builder.firstName(json.firstName);
    }
    if (json.lastName != null) {
      builder.lastName(json.lastName);
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
    if (json.panId != null) {
      builder.panId(json.panId);
    }
    if (json.image != null) {
      builder.image(json.image);
    }
    if (json.relation != null) {
      builder.relation(json.relation);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.likes != null) {
      builder.likes(json.likes);
    }
    return builder.build();
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
  public static Builder builder() {
    return new Builder();
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
    private static final long INIT_BIT_UUID = 0x1L;
    private static final long INIT_BIT_FIRST_NAME = 0x2L;
    private static final long INIT_BIT_LAST_NAME = 0x4L;
    private static final long INIT_BIT_EMAIL = 0x8L;
    private static final long INIT_BIT_AADHAR_ID = 0x10L;
    private static final long INIT_BIT_PAN_ID = 0x20L;
    private static final long INIT_BIT_IMAGE = 0x40L;
    private static final long INIT_BIT_RELATION = 0x80L;
    private static final long INIT_BIT_DESCRIPTION = 0x100L;
    private static final long INIT_BIT_LIKES = 0x200L;
    private long initBits = 0x3ffL;

    private @Nullable String uuid;
    private @Nullable String firstName;
    private @Nullable String lastName;
    private @Nullable String email;
    private @Nullable String phone;
    private @Nullable String aadharId;
    private @Nullable String panId;
    private @Nullable String image;
    private @Nullable String relation;
    private @Nullable String description;
    private @Nullable String likes;

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
      uuid(instance.uuid());
      firstName(instance.firstName());
      lastName(instance.lastName());
      email(instance.email());
      Optional<String> phoneOptional = instance.phone();
      if (phoneOptional.isPresent()) {
        phone(phoneOptional);
      }
      aadharId(instance.aadharId());
      panId(instance.panId());
      image(instance.image());
      relation(instance.relation());
      description(instance.description());
      likes(instance.likes());
      return this;
    }

    /**
     * Initializes the value for the {@link Article#uuid() uuid} attribute.
     * @param uuid The value for uuid 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder uuid(String uuid) {
      this.uuid = Objects.requireNonNull(uuid, "uuid");
      initBits &= ~INIT_BIT_UUID;
      return this;
    }

    /**
     * Initializes the value for the {@link Article#firstName() firstName} attribute.
     * @param firstName The value for firstName 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder firstName(String firstName) {
      this.firstName = Objects.requireNonNull(firstName, "firstName");
      initBits &= ~INIT_BIT_FIRST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Article#lastName() lastName} attribute.
     * @param lastName The value for lastName 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder lastName(String lastName) {
      this.lastName = Objects.requireNonNull(lastName, "lastName");
      initBits &= ~INIT_BIT_LAST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Article#email() email} attribute.
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
    @JsonProperty
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
    @JsonProperty
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
    @JsonProperty
    public final Builder panId(String panId) {
      this.panId = Objects.requireNonNull(panId, "panId");
      initBits &= ~INIT_BIT_PAN_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Article#image() image} attribute.
     * @param image The value for image 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder image(String image) {
      this.image = Objects.requireNonNull(image, "image");
      initBits &= ~INIT_BIT_IMAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link Article#relation() relation} attribute.
     * @param relation The value for relation 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder relation(String relation) {
      this.relation = Objects.requireNonNull(relation, "relation");
      initBits &= ~INIT_BIT_RELATION;
      return this;
    }

    /**
     * Initializes the value for the {@link Article#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder description(String description) {
      this.description = Objects.requireNonNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link Article#likes() likes} attribute.
     * @param likes The value for likes 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder likes(String likes) {
      this.likes = Objects.requireNonNull(likes, "likes");
      initBits &= ~INIT_BIT_LIKES;
      return this;
    }

    /**
     * Builds a new {@link ImmutableArticle ImmutableArticle}.
     * @return An immutable instance of Article
     * @throws IllegalStateException if any required attributes are missing
     */
    public ImmutableArticle build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableArticle(uuid, firstName, lastName, email, phone, aadharId, panId, image, relation, description, likes);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_UUID) != 0) attributes.add("uuid");
      if ((initBits & INIT_BIT_FIRST_NAME) != 0) attributes.add("firstName");
      if ((initBits & INIT_BIT_LAST_NAME) != 0) attributes.add("lastName");
      if ((initBits & INIT_BIT_EMAIL) != 0) attributes.add("email");
      if ((initBits & INIT_BIT_AADHAR_ID) != 0) attributes.add("aadharId");
      if ((initBits & INIT_BIT_PAN_ID) != 0) attributes.add("panId");
      if ((initBits & INIT_BIT_IMAGE) != 0) attributes.add("image");
      if ((initBits & INIT_BIT_RELATION) != 0) attributes.add("relation");
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      if ((initBits & INIT_BIT_LIKES) != 0) attributes.add("likes");
      return "Cannot build Article, some of required attributes are not set " + attributes;
    }
  }
}
