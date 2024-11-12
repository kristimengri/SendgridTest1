package com.kent.gmail.com.runtime.sendgrid.v3.response;

public class POSTMailSend500Response {

  private String errors;

  public POSTMailSend500Response() {}

  /**
   * @return errors
   */
  public String getErrors() {
    return this.errors;
  }

  /**
   * @param errors to set
   * @return POSTMailSend500Response
   */
  public <T extends POSTMailSend500Response> T setErrors(String errors) {
    this.errors = errors;
    return (T) this;
  }
}
