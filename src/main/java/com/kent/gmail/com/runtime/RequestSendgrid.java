package com.kent.gmail.com.runtime;

import java.util.List;

/** */
public class RequestSendgrid {

  private String content;

  private String from;

  private String send_at;

  private String subject;

  private List<String> to;

  public RequestSendgrid() {}

  /**
   * @return content
   */
  public String getContent() {
    return this.content;
  }

  /**
   * @param content to set
   * @return RequestSendgrid
   */
  public <T extends RequestSendgrid> T setContent(String content) {
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
   * @return RequestSendgrid
   */
  public <T extends RequestSendgrid> T setFrom(String from) {
    this.from = from;
    return (T) this;
  }

  /**
   * @return send_at
   */
  public String getSend_at() {
    return this.send_at;
  }

  /**
   * @param send_at to set
   * @return RequestSendgrid
   */
  public <T extends RequestSendgrid> T setSend_at(String send_at) {
    this.send_at = send_at;
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
   * @return RequestSendgrid
   */
  public <T extends RequestSendgrid> T setSubject(String subject) {
    this.subject = subject;
    return (T) this;
  }

  /**
   * @return to
   */
  public List<String> getTo() {
    return this.to;
  }

  /**
   * @param to to set
   * @return RequestSendgrid
   */
  public <T extends RequestSendgrid> T setTo(List<String> to) {
    this.to = to;
    return (T) this;
  }
}
