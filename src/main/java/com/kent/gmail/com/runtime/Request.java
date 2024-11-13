package com.kent.gmail.com.runtime;

/** */
public class Request {

  private Content content;

  private String from;

  private String subject;

  private String to;

  public Request() {}

  /**
   * @return content
   */
  public Content getContent() {
    return this.content;
  }

  /**
   * @param content to set
   * @return Request
   */
  public <T extends Request> T setContent(Content content) {
    this.content = content;
    return (T) this;
  }

  /**
   * @return from
   */
  public String getFrom() {
    return this.from;
  }

  /**
   * @param from to set
   * @return Request
   */
  public <T extends Request> T setFrom(String from) {
    this.from = from;
    return (T) this;
  }

  /**
   * @return subject
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * @param subject to set
   * @return Request
   */
  public <T extends Request> T setSubject(String subject) {
    this.subject = subject;
    return (T) this;
  }

  /**
   * @return to
   */
  public String getTo() {
    return this.to;
  }

  /**
   * @param to to set
   * @return Request
   */
  public <T extends Request> T setTo(String to) {
    this.to = to;
    return (T) this;
  }
}
