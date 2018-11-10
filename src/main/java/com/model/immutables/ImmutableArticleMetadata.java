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

import com.model.ArticleMetadata;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ArticleMetadata}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableArticleMetadata.builder()}.
 */
@Generated(from = "ArticleMetadata", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableArticleMetadata implements ArticleMetadata {
  private final String description;
  private final String category;
  private final String[] tags;

  private ImmutableArticleMetadata(String description, String category, String[] tags) {
    this.description = description;
    this.category = category;
    this.tags = tags;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @Override
  public String description() {
    return description;
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @Override
  public String category() {
    return category;
  }

  /**
   * @return A cloned {@code tags} array
   */
  @Override
  public String[] tags() {
    return tags.clone();
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleMetadata#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleMetadata withDescription(String value) {
    String newValue = Objects.requireNonNull(value, "description");
    if (this.description.equals(newValue)) return this;
    return new ImmutableArticleMetadata(newValue, this.category, this.tags);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleMetadata#category() category} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for category
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleMetadata withCategory(String value) {
    String newValue = Objects.requireNonNull(value, "category");
    if (this.category.equals(newValue)) return this;
    return new ImmutableArticleMetadata(this.description, newValue, this.tags);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ArticleMetadata#tags() tags}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for tags
   * @return A modified copy of {@code this} object
   */
  public final ImmutableArticleMetadata withTags(String... elements) {
    String[] newValue = elements.clone();
    return new ImmutableArticleMetadata(this.description, this.category, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableArticleMetadata} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableArticleMetadata
        && equalTo((ImmutableArticleMetadata) another);
  }

  private boolean equalTo(ImmutableArticleMetadata another) {
    return description.equals(another.description)
        && category.equals(another.category)
        && Arrays.equals(tags, another.tags);
  }

  /**
   * Computes a hash code from attributes: {@code description}, {@code category}, {@code tags}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + description.hashCode();
    h += (h << 5) + category.hashCode();
    h += (h << 5) + Arrays.hashCode(tags);
    return h;
  }

  /**
   * Prints the immutable value {@code ArticleMetadata} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ArticleMetadata")
        .omitNullValues()
        .add("description", description)
        .add("category", category)
        .add("tags", Arrays.toString(tags))
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link ArticleMetadata} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ArticleMetadata instance
   */
  public static ImmutableArticleMetadata copyOf(ArticleMetadata instance) {
    if (instance instanceof ImmutableArticleMetadata) {
      return (ImmutableArticleMetadata) instance;
    }
    return ImmutableArticleMetadata.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableArticleMetadata ImmutableArticleMetadata}.
   * @return A new ImmutableArticleMetadata builder
   */
  public static ImmutableArticleMetadata.Builder builder() {
    return new ImmutableArticleMetadata.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableArticleMetadata ImmutableArticleMetadata}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ArticleMetadata", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_DESCRIPTION = 0x1L;
    private static final long INIT_BIT_CATEGORY = 0x2L;
    private static final long INIT_BIT_TAGS = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String description;
    private @Nullable String category;
    private @Nullable String[] tags;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ArticleMetadata} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(ArticleMetadata instance) {
      Objects.requireNonNull(instance, "instance");
      description(instance.description());
      category(instance.category());
      tags(instance.tags());
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleMetadata#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder description(String description) {
      this.description = Objects.requireNonNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleMetadata#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder category(String category) {
      this.category = Objects.requireNonNull(category, "category");
      initBits &= ~INIT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleMetadata#tags() tags} attribute.
     * @param tags The elements for tags
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder tags(String... tags) {
      this.tags = tags.clone();
      initBits &= ~INIT_BIT_TAGS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableArticleMetadata ImmutableArticleMetadata}.
     * @return An immutable instance of ArticleMetadata
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableArticleMetadata build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableArticleMetadata(description, category, tags);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      if ((initBits & INIT_BIT_CATEGORY) != 0) attributes.add("category");
      if ((initBits & INIT_BIT_TAGS) != 0) attributes.add("tags");
      return "Cannot build ArticleMetadata, some of required attributes are not set " + attributes;
    }
  }
}
