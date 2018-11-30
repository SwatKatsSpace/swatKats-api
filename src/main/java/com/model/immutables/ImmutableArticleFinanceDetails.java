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

import com.model.ArticleFinanceDetails;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ArticleFinanceDetails}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableArticleFinanceDetails.builder()}.
 */
@Generated(from = "ArticleFinanceDetails", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableArticleFinanceDetails implements ArticleFinanceDetails {
  private final String uuid;
  private final String bankAccountNumber;
  private final String ifscCode;
  private final String bankName;
  private final String nameOnAccount;

  private ImmutableArticleFinanceDetails(
      String uuid,
      String bankAccountNumber,
      String ifscCode,
      String bankName,
      String nameOnAccount) {
    this.uuid = uuid;
    this.bankAccountNumber = bankAccountNumber;
    this.ifscCode = ifscCode;
    this.bankName = bankName;
    this.nameOnAccount = nameOnAccount;
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
   * @return The value of the {@code bankAccountNumber} attribute
   */
  @JsonProperty
  @Override
  public String bankAccountNumber() {
    return bankAccountNumber;
  }

  /**
   * @return The value of the {@code ifscCode} attribute
   */
  @JsonProperty
  @Override
  public String ifscCode() {
    return ifscCode;
  }

  /**
   * @return The value of the {@code bankName} attribute
   */
  @JsonProperty
  @Override
  public String bankName() {
    return bankName;
  }

  /**
   * @return The value of the {@code nameOnAccount} attribute
   */
  @JsonProperty
  @Override
  public String nameOnAccount() {
    return nameOnAccount;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleFinanceDetails#uuid() uuid} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for uuid
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleFinanceDetails withUuid(String value) {
    String newValue = Objects.requireNonNull(value, "uuid");
    if (this.uuid.equals(newValue)) return this;
    return new ImmutableArticleFinanceDetails(newValue, this.bankAccountNumber, this.ifscCode, this.bankName, this.nameOnAccount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleFinanceDetails#bankAccountNumber() bankAccountNumber} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bankAccountNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleFinanceDetails withBankAccountNumber(String value) {
    String newValue = Objects.requireNonNull(value, "bankAccountNumber");
    if (this.bankAccountNumber.equals(newValue)) return this;
    return new ImmutableArticleFinanceDetails(this.uuid, newValue, this.ifscCode, this.bankName, this.nameOnAccount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleFinanceDetails#ifscCode() ifscCode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ifscCode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleFinanceDetails withIfscCode(String value) {
    String newValue = Objects.requireNonNull(value, "ifscCode");
    if (this.ifscCode.equals(newValue)) return this;
    return new ImmutableArticleFinanceDetails(this.uuid, this.bankAccountNumber, newValue, this.bankName, this.nameOnAccount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleFinanceDetails#bankName() bankName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bankName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleFinanceDetails withBankName(String value) {
    String newValue = Objects.requireNonNull(value, "bankName");
    if (this.bankName.equals(newValue)) return this;
    return new ImmutableArticleFinanceDetails(this.uuid, this.bankAccountNumber, this.ifscCode, newValue, this.nameOnAccount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ArticleFinanceDetails#nameOnAccount() nameOnAccount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nameOnAccount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableArticleFinanceDetails withNameOnAccount(String value) {
    String newValue = Objects.requireNonNull(value, "nameOnAccount");
    if (this.nameOnAccount.equals(newValue)) return this;
    return new ImmutableArticleFinanceDetails(this.uuid, this.bankAccountNumber, this.ifscCode, this.bankName, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableArticleFinanceDetails} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableArticleFinanceDetails
        && equalTo((ImmutableArticleFinanceDetails) another);
  }

  private boolean equalTo(ImmutableArticleFinanceDetails another) {
    return uuid.equals(another.uuid)
        && bankAccountNumber.equals(another.bankAccountNumber)
        && ifscCode.equals(another.ifscCode)
        && bankName.equals(another.bankName)
        && nameOnAccount.equals(another.nameOnAccount);
  }

  /**
   * Computes a hash code from attributes: {@code uuid}, {@code bankAccountNumber}, {@code ifscCode}, {@code bankName}, {@code nameOnAccount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + uuid.hashCode();
    h += (h << 5) + bankAccountNumber.hashCode();
    h += (h << 5) + ifscCode.hashCode();
    h += (h << 5) + bankName.hashCode();
    h += (h << 5) + nameOnAccount.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ArticleFinanceDetails} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ArticleFinanceDetails")
        .omitNullValues()
        .add("uuid", uuid)
        .add("bankAccountNumber", bankAccountNumber)
        .add("ifscCode", ifscCode)
        .add("bankName", bankName)
        .add("nameOnAccount", nameOnAccount)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ArticleFinanceDetails", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ArticleFinanceDetails {
    @Nullable String uuid;
    @Nullable String bankAccountNumber;
    @Nullable String ifscCode;
    @Nullable String bankName;
    @Nullable String nameOnAccount;
    @JsonProperty
    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    @JsonProperty
    public void setBankAccountNumber(String bankAccountNumber) {
      this.bankAccountNumber = bankAccountNumber;
    }
    @JsonProperty
    public void setIfscCode(String ifscCode) {
      this.ifscCode = ifscCode;
    }
    @JsonProperty
    public void setBankName(String bankName) {
      this.bankName = bankName;
    }
    @JsonProperty
    public void setNameOnAccount(String nameOnAccount) {
      this.nameOnAccount = nameOnAccount;
    }
    @Override
    public String uuid() { throw new UnsupportedOperationException(); }
    @Override
    public String bankAccountNumber() { throw new UnsupportedOperationException(); }
    @Override
    public String ifscCode() { throw new UnsupportedOperationException(); }
    @Override
    public String bankName() { throw new UnsupportedOperationException(); }
    @Override
    public String nameOnAccount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableArticleFinanceDetails fromJson(Json json) {
    ImmutableArticleFinanceDetails.Builder builder = ImmutableArticleFinanceDetails.builder();
    if (json.uuid != null) {
      builder.uuid(json.uuid);
    }
    if (json.bankAccountNumber != null) {
      builder.bankAccountNumber(json.bankAccountNumber);
    }
    if (json.ifscCode != null) {
      builder.ifscCode(json.ifscCode);
    }
    if (json.bankName != null) {
      builder.bankName(json.bankName);
    }
    if (json.nameOnAccount != null) {
      builder.nameOnAccount(json.nameOnAccount);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ArticleFinanceDetails} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ArticleFinanceDetails instance
   */
  public static ImmutableArticleFinanceDetails copyOf(ArticleFinanceDetails instance) {
    if (instance instanceof ImmutableArticleFinanceDetails) {
      return (ImmutableArticleFinanceDetails) instance;
    }
    return ImmutableArticleFinanceDetails.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableArticleFinanceDetails ImmutableArticleFinanceDetails}.
   * @return A new ImmutableArticleFinanceDetails builder
   */
  public static ImmutableArticleFinanceDetails.Builder builder() {
    return new ImmutableArticleFinanceDetails.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableArticleFinanceDetails ImmutableArticleFinanceDetails}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ArticleFinanceDetails", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_UUID = 0x1L;
    private static final long INIT_BIT_BANK_ACCOUNT_NUMBER = 0x2L;
    private static final long INIT_BIT_IFSC_CODE = 0x4L;
    private static final long INIT_BIT_BANK_NAME = 0x8L;
    private static final long INIT_BIT_NAME_ON_ACCOUNT = 0x10L;
    private long initBits = 0x1fL;

    private @Nullable String uuid;
    private @Nullable String bankAccountNumber;
    private @Nullable String ifscCode;
    private @Nullable String bankName;
    private @Nullable String nameOnAccount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ArticleFinanceDetails} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(ArticleFinanceDetails instance) {
      Objects.requireNonNull(instance, "instance");
      uuid(instance.uuid());
      bankAccountNumber(instance.bankAccountNumber());
      ifscCode(instance.ifscCode());
      bankName(instance.bankName());
      nameOnAccount(instance.nameOnAccount());
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleFinanceDetails#uuid() uuid} attribute.
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
     * Initializes the value for the {@link ArticleFinanceDetails#bankAccountNumber() bankAccountNumber} attribute.
     * @param bankAccountNumber The value for bankAccountNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder bankAccountNumber(String bankAccountNumber) {
      this.bankAccountNumber = Objects.requireNonNull(bankAccountNumber, "bankAccountNumber");
      initBits &= ~INIT_BIT_BANK_ACCOUNT_NUMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleFinanceDetails#ifscCode() ifscCode} attribute.
     * @param ifscCode The value for ifscCode 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder ifscCode(String ifscCode) {
      this.ifscCode = Objects.requireNonNull(ifscCode, "ifscCode");
      initBits &= ~INIT_BIT_IFSC_CODE;
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleFinanceDetails#bankName() bankName} attribute.
     * @param bankName The value for bankName 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder bankName(String bankName) {
      this.bankName = Objects.requireNonNull(bankName, "bankName");
      initBits &= ~INIT_BIT_BANK_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link ArticleFinanceDetails#nameOnAccount() nameOnAccount} attribute.
     * @param nameOnAccount The value for nameOnAccount 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Builder nameOnAccount(String nameOnAccount) {
      this.nameOnAccount = Objects.requireNonNull(nameOnAccount, "nameOnAccount");
      initBits &= ~INIT_BIT_NAME_ON_ACCOUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableArticleFinanceDetails ImmutableArticleFinanceDetails}.
     * @return An immutable instance of ArticleFinanceDetails
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableArticleFinanceDetails build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableArticleFinanceDetails(uuid, bankAccountNumber, ifscCode, bankName, nameOnAccount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_UUID) != 0) attributes.add("uuid");
      if ((initBits & INIT_BIT_BANK_ACCOUNT_NUMBER) != 0) attributes.add("bankAccountNumber");
      if ((initBits & INIT_BIT_IFSC_CODE) != 0) attributes.add("ifscCode");
      if ((initBits & INIT_BIT_BANK_NAME) != 0) attributes.add("bankName");
      if ((initBits & INIT_BIT_NAME_ON_ACCOUNT) != 0) attributes.add("nameOnAccount");
      return "Cannot build ArticleFinanceDetails, some of required attributes are not set " + attributes;
    }
  }
}
