package com.ivanxc.coursework.dashboard.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * Form
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-07T20:46:55.234864500+03:00[Europe/Moscow]")
public class Form   {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("type")
  private String type;

  @JsonProperty("title")
  private String title;

  @JsonProperty("created")
  private String created;

  @JsonProperty("updated")
  private String updated;

  @JsonProperty("users")
  @Valid
  private List<Long> users = null;

  @JsonProperty("elements")
  @Valid
  private List<Long> elements = null;

  public Form id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "1", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Form type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", example = "canban", required = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Form title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @Size(min = 1, max = 60) 
  @Schema(name = "title", example = "My canban", required = false)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Form created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  */
  
  @Schema(name = "created", example = "2022-01-01 16:00:00", required = false)
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Form updated(String updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
  */
  
  @Schema(name = "updated", example = "2022-02-02 16:00:00", required = false)
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public Form users(List<Long> users) {
    this.users = users;
    return this;
  }

  public Form addUsersItem(Long usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
  */
  
  @Schema(name = "users", example = "[1,2,3]", required = false)
  public List<Long> getUsers() {
    return users;
  }

  public void setUsers(List<Long> users) {
    this.users = users;
  }

  public Form elements(List<Long> elements) {
    this.elements = elements;
    return this;
  }

  public Form addElementsItem(Long elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * Get elements
   * @return elements
  */
  
  @Schema(name = "elements", required = false)
  public List<Long> getElements() {
    return elements;
  }

  public void setElements(List<Long> elements) {
    this.elements = elements;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form form = (Form) o;
    return Objects.equals(this.id, form.id) &&
        Objects.equals(this.type, form.type) &&
        Objects.equals(this.title, form.title) &&
        Objects.equals(this.created, form.created) &&
        Objects.equals(this.updated, form.updated) &&
        Objects.equals(this.users, form.users) &&
        Objects.equals(this.elements, form.elements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, title, created, updated, users, elements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
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

