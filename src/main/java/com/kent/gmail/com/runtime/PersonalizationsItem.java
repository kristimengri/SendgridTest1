package com.kent.gmail.com.runtime;

import java.util.List;

public class PersonalizationsItem {

  private String subject;

  private List<ToItem> to;

  public PersonalizationsItem() {}

  /**
   * @return subject
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * @param subject to set
   * @return PersonalizationsItem
   */
  public <T extends PersonalizationsItem> T setSubject(String subject) {
    this.subject = subject;
    return (T) this;
  }

  /**
   * @return to
   */
  public List<ToItem> getTo() {
    return this.to;
  }

  /**
   * @param to to set
   * @return PersonalizationsItem
   */
  public <T extends PersonalizationsItem> T setTo(List<ToItem> to) {
    this.to = to;
    return (T) this;
  }
}
