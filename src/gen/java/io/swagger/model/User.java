package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T11:12:38.238Z")
public class User   {
  
  private String email = null;
  private String firstName = null;
  private Integer id = null;
  private String lastName = null;
  private String password = null;
  private String phone = null;
  private Integer userStatus = null;
  private String userlogin = null;

  
  /**
   **/
  public User email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   **/
  public User id(Integer id) {
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
  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   **/
  public User password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   **/
  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * User Status
   **/
  public User userStatus(Integer userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  
  @ApiModelProperty(value = "User Status")
  @JsonProperty("userStatus")
  public Integer getUserStatus() {
    return userStatus;
  }
  public void setUserStatus(Integer userStatus) {
    this.userStatus = userStatus;
  }

  
  /**
   **/
  public User userlogin(String userlogin) {
    this.userlogin = userlogin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("userlogin")
  public String getUserlogin() {
    return userlogin;
  }
  public void setUserlogin(String userlogin) {
    this.userlogin = userlogin;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(email, user.email) &&
        Objects.equals(firstName, user.firstName) &&
        Objects.equals(id, user.id) &&
        Objects.equals(lastName, user.lastName) &&
        Objects.equals(password, user.password) &&
        Objects.equals(phone, user.phone) &&
        Objects.equals(userStatus, user.userStatus) &&
        Objects.equals(userlogin, user.userlogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, id, lastName, password, phone, userStatus, userlogin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append(",");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append(",");
    sb.append("    id: ").append(toIndentedString(id)).append(",");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append(",");
    sb.append("    password: ").append(toIndentedString(password)).append(",");
    sb.append("    phone: ").append(toIndentedString(phone)).append(",");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append(",");
    sb.append("    userlogin: ").append(toIndentedString(userlogin)).append(",");
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

