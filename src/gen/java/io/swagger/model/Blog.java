package io.swagger.model;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Category;
import io.swagger.model.Tag;
import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T11:12:38.238Z")
public class Blog   {
  
  private Category category = null;
  private String content = null;
  private Integer id = null;
  private Integer oid = null;
  private String name = null;
  private List<String> photoUrls = new ArrayList<String>();
  private String status = null;
  private Date postdate = null;
  private List<Tag> tags = new ArrayList<Tag>();


  /**
   **/
  public Blog category(Category category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("category")
  public Category getCategory() {
    return category;
  }
  public void setCategory(Category category) {
    this.category = category;
  }

  
  /**
   **/
  public Blog content(String content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  
  /**
   * unique identifier for the blog
   **/
  public Blog id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "unique identifier for the blog")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * unique identifier for the blog's owner
   **/
  public Blog oid(Integer oid) {
    this.id = oid;
    return this;
  }


  @ApiModelProperty(required = true, value = "unique identifier for the blog's owner")
  @JsonProperty("oid")
  public Integer getOid() {
    return oid;
  }
  public void setOid(Integer oid) {
    this.oid = oid;
  }


  /**
   **/
  public Blog name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public Blog photoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("photoUrls")
  public List<String> getPhotoUrls() {
    return photoUrls;
  }
  public void setPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
  }

  
  /**
   * blog status in the store
   **/
  public Blog status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "blog status in the store")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * blog postdate in the store
   **/
  public Blog postdate(Date postdate) {
    this.postdate = postdate;
    return this;
  }

  
  @ApiModelProperty(value = "blog postdate in the store")
  @JsonProperty("postdate")
  public Date getPostdate() {
    return postdate;
  }
  public void setPostdate(Date postdate) {
    this.postdate = postdate;
  }
  
  /**
   **/
  public Blog tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tags")
  public List<Tag> getTags() {
    return tags;
  }
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Blog blog = (Blog) o;
    return Objects.equals(category, blog.category) &&
        Objects.equals(content, blog.content) &&
        Objects.equals(id, blog.id) &&
        Objects.equals(name, blog.name) &&
        Objects.equals(photoUrls, blog.photoUrls) &&
        Objects.equals(status, blog.status) &&
        Objects.equals(tags, blog.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, content, id, name, photoUrls, status, tags);
  }
//
//  @Override
//  public String toString() {
//    StringBuilder sb = new StringBuilder();
//    sb.append("class Blog {\n");
//
//    sb.append("category: ").append(toIndentedString(category)).append("\n");
//    sb.append("content: ").append(toIndentedString(content)).append("\n");
//    sb.append("id: ").append(toIndentedString(id)).append("\n");
//    sb.append("oid: ").append(toIndentedString(id)).append("\n");
//    sb.append("name: ").append(toIndentedString(name)).append("\n");
//    sb.append("photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
//    sb.append("status: ").append(toIndentedString(status)).append("\n");
//    sb.append("tags: ").append(toIndentedString(tags)).append("\n");
//    sb.append("}");
//    return sb.toString();
//  }

//  @Override
//  public String toString() {
//    StringBuilder sb = new StringBuilder();
//    sb.append("{");
//
//    sb.append("\"category\": \"").append(toIndentedString(category)).append("\"\n");
//    sb.append("\"content\": \"").append(toIndentedString(content)).append("\"\n");
//    sb.append("\"id\": \"").append(toIndentedString(id)).append("\"\n");
//    sb.append("\"oid\": \"").append(toIndentedString(oid)).append("\"\n");
//    sb.append("\"name\": \"").append(toIndentedString(name)).append("\"\n");
//    sb.append("\"photoUrls\": \"").append(toIndentedString(photoUrls)).append("\"\n");
//    sb.append("\"status\": \"").append(toIndentedString(status)).append("\"\n");
//    sb.append("\"tags\": \"").append(toIndentedString(tags)).append("\"\n");
//    sb.append("}");
//    return sb.toString();
//  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");

    sb.append("category: ").append(toIndentedString(category)).append(",");
    sb.append("content: ").append(toIndentedString(content)).append(",");
    sb.append("id: ").append(toIndentedString(id)).append(",");
    sb.append("oid: ").append(toIndentedString(oid)).append(",");
    sb.append("name: ").append(toIndentedString(name)).append(",");
    sb.append("photoUrls: ").append(toIndentedString(photoUrls)).append(",");
    sb.append("status: ").append(toIndentedString(status)).append(",");
    sb.append("tags: ").append(toIndentedString(tags)).append(",");
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

