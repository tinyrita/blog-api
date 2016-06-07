package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T11:12:38.238Z")
public class Order   {
  
  private Integer blogid = null;
  private Integer id = null;
  private Integer quantity = null;
  private String shipDate = null;
  private String status = null;

  
  /**
   **/
  public Order blogid(Integer blogid) {
    this.blogid = blogid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("blogid")
  public Integer getBlogid() {
    return blogid;
  }
  public void setBlogid(Integer blogid) {
    this.blogid = blogid;
  }

  
  /**
   **/
  public Order id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   **/
  public Order quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   **/
  public Order shipDate(String shipDate) {
    this.shipDate = shipDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("shipDate")
  public String getShipDate() {
    return shipDate;
  }
  public void setShipDate(String shipDate) {
    this.shipDate = shipDate;
  }

  
  /**
   * Order Status
   **/
  public Order status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Order Status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(blogid, order.blogid) &&
        Objects.equals(id, order.id) &&
        Objects.equals(quantity, order.quantity) &&
        Objects.equals(shipDate, order.shipDate) &&
        Objects.equals(status, order.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blogid, id, quantity, shipDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    blogid: ").append(toIndentedString(blogid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

