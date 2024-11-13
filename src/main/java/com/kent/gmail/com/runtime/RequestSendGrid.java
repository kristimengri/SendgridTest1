package com.kent.gmail.com.runtime;

import java.util.List;

/** */
public class RequestSendGrid {

  private List<ContentItem> content;

  private From from;

  private List<PersonalizationsItem> personalizations;

  public RequestSendGrid() {}

  /**
   * @return content
   */
  public List<ContentItem> getContent() {
    return this.content;
  }

  /**
   * @param content to set
   * @return RequestSendGrid
   */
  public <T extends RequestSendGrid> T setContent(List<ContentItem> content) {
    this.content = content;
    return (T) this;
  }

  /**
   * @return from
   */
  public From getFrom() {
    return this.from;
  }

  /**
   * @param from to set
   * @return RequestSendGrid
   */
  public <T extends RequestSendGrid> T setFrom(From from) {
    this.from = from;
    return (T) this;
  }

  /**
   * @return personalizations
   */
  public List<PersonalizationsItem> getPersonalizations() {
    return this.personalizations;
  }

  /**
   * @param personalizations to set
   * @return RequestSendGrid
   */
  public <T extends RequestSendGrid> T setPersonalizations(
      List<PersonalizationsItem> personalizations) {
    this.personalizations = personalizations;
    return (T) this;
  }
}
