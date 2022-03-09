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
 * ElementOnForm
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-07T20:46:55.234864500+03:00[Europe/Moscow]")
public class ElementOnForm   {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("elementDefinitionId")
  private Long elementDefinitionId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("formId")
  private Long formId;

  @JsonProperty("attributes")
  @Valid
  private List<Attribute> attributes = null;

  public ElementOnForm id(Long id) {
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

  public ElementOnForm elementDefinitionId(Long elementDefinitionId) {
    this.elementDefinitionId = elementDefinitionId;
    return this;
  }

  /**
   * Get elementDefinitionId
   * @return elementDefinitionId
  */
  
  @Schema(name = "elementDefinitionId", example = "1", required = false)
  public Long getElementDefinitionId() {
    return elementDefinitionId;
  }

  public void setElementDefinitionId(Long elementDefinitionId) {
    this.elementDefinitionId = elementDefinitionId;
  }

  public ElementOnForm name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Size(min = 1, max = 60) 
  @Schema(name = "name", example = "task", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ElementOnForm formId(Long formId) {
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

  public ElementOnForm attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ElementOnForm addAttributesItem(Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @Valid 
  @Schema(name = "attributes", required = false)
  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementOnForm elementOnForm = (ElementOnForm) o;
    return Objects.equals(this.id, elementOnForm.id) &&
        Objects.equals(this.elementDefinitionId, elementOnForm.elementDefinitionId) &&
        Objects.equals(this.name, elementOnForm.name) &&
        Objects.equals(this.formId, elementOnForm.formId) &&
        Objects.equals(this.attributes, elementOnForm.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, elementDefinitionId, name, formId, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementOnForm {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    elementDefinitionId: ").append(toIndentedString(elementDefinitionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

