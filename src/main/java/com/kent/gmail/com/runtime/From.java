package com.kent.gmail.com.runtime;

public class From {

  private String email;

  public From() {}

  /**
   * @return email
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @param email to set
   * @return From
   */
  public <T extends From> T setEmail(String email) {
    this.email = email;
    return (T) this;
  }
}
