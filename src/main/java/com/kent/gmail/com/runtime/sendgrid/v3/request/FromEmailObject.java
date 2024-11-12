package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class FromEmailObject {

  private String email;

  private String name;

  public FromEmailObject() {}

  /**
   * @return email
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @param email to set
   * @return FromEmailObject
   */
  public <T extends FromEmailObject> T setEmail(String email) {
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
   * @return FromEmailObject
   */
  public <T extends FromEmailObject> T setName(String name) {
    this.name = name;
    return (T) this;
  }
}
