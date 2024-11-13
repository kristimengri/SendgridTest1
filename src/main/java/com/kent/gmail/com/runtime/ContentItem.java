package com.kent.gmail.com.runtime;

public class ContentItem {

  private String type;

  private String value;

  public ContentItem() {}

  /**
   * @return type
   */
  public String getType() {
    return this.type;
  }

  /**
   * @param type to set
   * @return ContentItem
   */
  public <T extends ContentItem> T setType(String type) {
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
   * @return ContentItem
   */
  public <T extends ContentItem> T setValue(String value) {
    this.value = value;
    return (T) this;
  }
}
