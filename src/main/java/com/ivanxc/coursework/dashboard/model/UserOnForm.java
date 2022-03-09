package com.ivanxc.coursework.dashboard.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * UserOnForm
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-07T20:46:55.234864500+03:00[Europe/Moscow]")
public class UserOnForm   {

  @JsonProperty("userId")
  private Long userId;

  @JsonProperty("formId")
  private Long formId;

  @JsonProperty("role")
  private String role;

  public UserOnForm userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", example = "1", required = false)
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public UserOnForm formId(Long formId) {
    this.formId = formId;
    return this;
  }

  /**
   * Get formId
   * @return formId
  */
  
  @Schema(name = "formId", example = "1", required = false)
  public Long getFormId() {
    return formId;
  }

  public void setFormId(Long formId) {
    this.formId = formId;
  }

  public UserOnForm role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  
  @Schema(name = "role", example = "Editor", required = false)
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOnForm userOnForm = (UserOnForm) o;
    return Objects.equals(this.userId, userOnForm.userId) &&
        Objects.equals(this.formId, userOnForm.formId) &&
        Objects.equals(this.role, userOnForm.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, formId, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOnForm {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

