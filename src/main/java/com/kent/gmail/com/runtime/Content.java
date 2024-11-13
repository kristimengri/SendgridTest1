package com.kent.gmail.com.runtime;

public class Content {

  private String type;

  private String value;

  public Content() {}

  /**
   * @return type
   */
  public String getType() {
    return this.type;
  }

  /**
   * @param type to set
   * @return Content
   */
  public <T extends Content> T setType(String type) {
    this.type = type;
    return (T) this;
  }

  /**
   * @return value
   */
  public String getValue() {
    return this.value;
  }

  /**
   * @param value to set
   * @return Content
   */
  public <T extends Content> T setValue(String value) {
    this.value = value;
    return (T) this;
  }
}
