package com.kent.gmail.com.runtime.sendgrid.v3.response;

public class GlobalErrorResponseSchema {

  private String errors;

  private String id;

  public GlobalErrorResponseSchema() {}

  /**
   * @return errors
   */
  public String getErrors() {
    return this.errors;
  }

  /**
   * @param errors to set
   * @return GlobalErrorResponseSchema
   */
  public <T extends GlobalErrorResponseSchema> T setErrors(String errors) {
    this.errors = errors;
    return (T) this;
  }

  /**
   * @return id
   */
  public String getId() {
    return this.id;
  }

  /**
   * @param id to set
   * @return GlobalErrorResponseSchema
   */
  public <T extends GlobalErrorResponseSchema> T setId(String id) {
    this.id = id;
    return (T) this;
  }
}
