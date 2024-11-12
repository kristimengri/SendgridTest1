package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class ReplyToEmailObject {

  private String email;

  private String name;

  public ReplyToEmailObject() {}

  /**
   * @return email
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @param email to set
   * @return ReplyToEmailObject
   */
  public <T extends ReplyToEmailObject> T setEmail(String email) {
    this.email = email;
    return (T) this;
  }

  /**
   * @return name
   */
  public String getName() {
    return this.name;
  }

  /**
   * @param name to set
   * @return ReplyToEmailObject
   */
  public <T extends ReplyToEmailObject> T setName(String name) {
    this.name = name;
    return (T) this;
  }
}
