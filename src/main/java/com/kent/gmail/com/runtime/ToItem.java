package com.kent.gmail.com.runtime;

public class ToItem {

  private String email;

  public ToItem() {}

  /**
   * @return email
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @param email to set
   * @return ToItem
   */
  public <T extends ToItem> T setEmail(String email) {
    this.email = email;
    return (T) this;
  }
}
