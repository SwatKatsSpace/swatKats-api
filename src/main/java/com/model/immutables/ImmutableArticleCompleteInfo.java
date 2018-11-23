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
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ArticleCompleteInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableArticleCompleteInfo.builder()}.
 */
@Generated(from = "ArticleCompleteInfo", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableArticleCompleteInfo implements ArticleCompleteInfo {
  private final Article article;
  private final ArticleDetails articleDetails;
  private final ArticleFinanceDetails articleFinanceDetails;
  private final ArticleMetadata articleMetadata;

  private ImmutableArticleCompleteInfo(
      Article article,
      ArticleDetails articleDetails,
      ArticleFinanceDetails articleFinanceDetails,
      ArticleMetadata articleMetadata) {
    this.article = article;
    this.articleDetails = articleDetails;
    this.articleFinanceDetails = articleFinanceDetails;
    this.articleMetadata = articleMetadata;
  }

  /**
   * @return The value of the {@code article} attribute
   */
  @Override
  public Article article() {
    return article;
  }

  /**
   * @return The value of the {@code articleDetails} attribute
   */
  @Override
  public ArticleDetails articleDetails() {
    return articleDetails;
  }

  /**
   * @return The value of the {@code articleFinanceDetails} attribute
   */
  @Override
  public ArticleFinanceDetails articleFinanceDetails() {
    return articleFinanceDetails;
  }

  /**
   * @return The value of the {@code articleMetadata} attribute
   */
  @Override
  public ArticleMetadata articleMetadata() {
    return articleMetadata;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleCompleteInfo#article() article} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for article
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleCompleteInfo withArticle(Article value) {
    if (this.article == value) return this;
    Article newValue = Objects.requireNonNull(value, "article");
    return new ImmutableArticleCompleteInfo(newValue, this.articleDetails, this.articleFinanceDetails, this.articleMetadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleCompleteInfo#articleDetails() articleDetails} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for articleDetails
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleCompleteInfo withArticleDetails(ArticleDetails value) {
    if (this.articleDetails == value) return this;
    ArticleDetails newValue = Objects.requireNonNull(value, "articleDetails");
    return new ImmutableArticleCompleteInfo(this.article, newValue, this.articleFinanceDetails, this.articleMetadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleCompleteInfo#articleFinanceDetails() articleFinanceDetails} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for articleFinanceDetails
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleCompleteInfo withArticleFinanceDetails(ArticleFinanceDetails value) {
    if (this.articleFinanceDetails == value) return this;
    ArticleFinanceDetails newValue = Objects.requireNonNull(value, "articleFinanceDetails");
    return new ImmutableArticleCompleteInfo(this.article, this.articleDetails, newValue, this.articleMetadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleCompleteInfo#articleMetadata() articleMetadata} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for articleMetadata
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleCompleteInfo withArticleMetadata(ArticleMetadata value) {
    if (this.articleMetadata == value) return this;
    ArticleMetadata newValue = Objects.requireNonNull(value, "articleMetadata");
    return new ImmutableArticleCompleteInfo(this.article, this.articleDetails, this.articleFinanceDetails, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableArticleCompleteInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableArticleCompleteInfo
        && equalTo((ImmutableArticleCompleteInfo) another);
  }

  private boolean equalTo(ImmutableArticleCompleteInfo another) {
    return article.equals(another.article)
        && articleDetails.equals(another.articleDetails)
        && articleFinanceDetails.equals(another.articleFinanceDetails)
        && articleMetadata.equals(another.articleMetadata);
  }

  /**
   * Computes a hash code from attributes: {@code article}, {@code articleDetails}, {@code articleFinanceDetails}, {@code articleMetadata}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + article.hashCode();
    h += (h << 5) + articleDetails.hashCode();
    h += (h << 5) + articleFinanceDetails.hashCode();
    h += (h << 5) + articleMetadata.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ArticleCompleteInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ArticleCompleteInfo")
        .omitNullValues()
        .add("article", article)
        .add("articleDetails", articleDetails)
        .add("articleFinanceDetails", articleFinanceDetails)
        .add("articleMetadata", articleMetadata)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link ArticleCompleteInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ArticleCompleteInfo instance
   */
  public static ImmutableArticleCompleteInfo copyOf(ArticleCompleteInfo instance) {
    if (instance instanceof ImmutableArticleCompleteInfo) {
      return (ImmutableArticleCompleteInfo) instance;
    }
    return ImmutableArticleCompleteInfo.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableArticleCompleteInfo ImmutableArticleCompleteInfo}.
   * @return A new ImmutableArticleCompleteInfo builder
   */
  public static ImmutableArticleCompleteInfo.Builder builder() {
    return new ImmutableArticleCompleteInfo.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableArticleCompleteInfo ImmutableArticleCompleteInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ArticleCompleteInfo", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ARTICLE = 0x1L;
    private static final long INIT_BIT_ARTICLE_DETAILS = 0x2L;
    private static final long INIT_BIT_ARTICLE_FINANCE_DETAILS = 0x4L;
    private static final long INIT_BIT_ARTICLE_METADATA = 0x8L;
    private long initBits = 0xfL;

    private @Nullable Article article;
    private @Nullable ArticleDetails articleDetails;
    private @Nullable ArticleFinanceDetails articleFinanceDetails;
    private @Nullable ArticleMetadata articleMetadata;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ArticleCompleteInfo} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(ArticleCompleteInfo instance) {
      Objects.requireNonNull(instance, "instance");
      article(instance.article());
      articleDetails(instance.articleDetails());
      articleFinanceDetails(instance.articleFinanceDetails());
      articleMetadata(instance.articleMetadata());
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleCompleteInfo#article() article} attribute.
     * @param article The value for article 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder article(Article article) {
      this.article = Objects.requireNonNull(article, "article");
      initBits &= ~INIT_BIT_ARTICLE;
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleCompleteInfo#articleDetails() articleDetails} attribute.
     * @param articleDetails The value for articleDetails 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder articleDetails(ArticleDetails articleDetails) {
      this.articleDetails = Objects.requireNonNull(articleDetails, "articleDetails");
      initBits &= ~INIT_BIT_ARTICLE_DETAILS;
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleCompleteInfo#articleFinanceDetails() articleFinanceDetails} attribute.
     * @param articleFinanceDetails The value for articleFinanceDetails 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder articleFinanceDetails(ArticleFinanceDetails articleFinanceDetails) {
      this.articleFinanceDetails = Objects.requireNonNull(articleFinanceDetails, "articleFinanceDetails");
      initBits &= ~INIT_BIT_ARTICLE_FINANCE_DETAILS;
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleCompleteInfo#articleMetadata() articleMetadata} attribute.
     * @param articleMetadata The value for articleMetadata 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder articleMetadata(ArticleMetadata articleMetadata) {
      this.articleMetadata = Objects.requireNonNull(articleMetadata, "articleMetadata");
      initBits &= ~INIT_BIT_ARTICLE_METADATA;
      return this;
    }

    /**
     * Builds a new {@link ImmutableArticleCompleteInfo ImmutableArticleCompleteInfo}.
     * @return An immutable instance of ArticleCompleteInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableArticleCompleteInfo build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableArticleCompleteInfo(article, articleDetails, articleFinanceDetails, articleMetadata);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ARTICLE) != 0) attributes.add("article");
      if ((initBits & INIT_BIT_ARTICLE_DETAILS) != 0) attributes.add("articleDetails");
      if ((initBits & INIT_BIT_ARTICLE_FINANCE_DETAILS) != 0) attributes.add("articleFinanceDetails");
      if ((initBits & INIT_BIT_ARTICLE_METADATA) != 0) attributes.add("articleMetadata");
      return "Cannot build ArticleCompleteInfo, some of required attributes are not set " + attributes;
    }
  }
}
