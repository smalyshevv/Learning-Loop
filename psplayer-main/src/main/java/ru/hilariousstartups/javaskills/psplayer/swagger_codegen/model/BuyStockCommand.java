/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ru.hilariousstartups.javaskills.psplayer.swagger_codegen.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Команда на закупку товара у поставщика на склад.
 */
@Schema(description = "Команда на закупку товара у поставщика на склад.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-29T20:10:20.018547+03:00[Europe/Moscow]")
public class BuyStockCommand {
  @SerializedName("productId")
  private Integer productId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  public BuyStockCommand productId(Integer productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Id товара
   * @return productId
  **/
  @Schema(required = true, description = "Id товара")
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public BuyStockCommand quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Количество товара
   * @return quantity
  **/
  @Schema(required = true, description = "Количество товара")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyStockCommand buyStockCommand = (BuyStockCommand) o;
    return Objects.equals(this.productId, buyStockCommand.productId) &&
        Objects.equals(this.quantity, buyStockCommand.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyStockCommand {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}