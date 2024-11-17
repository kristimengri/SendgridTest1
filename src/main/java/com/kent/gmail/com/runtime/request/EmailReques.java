package com.kent.gmail.com.runtime.request;

/** This is my email request */
public class EmailReques {

  private String email;

  private String message;

  private String subject;

  public EmailReques() {}

  /**
   * the email to send
   *
   * @return email
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * the email to send
   *
   * @param email to set
   * @return EmailReques
   */
  public <T extends EmailReques> T setEmail(String email) {
    this.email = email;
    return (T) this;
  }

  /**
   * message
   *
   * @return message
   */
  public String getMessage() {
    return this.message;
  }

  /**
   * message
   *
   * @param message to set
   * @return EmailReques
   */
  public <T extends EmailReques> T setMessage(String message) {
    this.message = message;
    return (T) this;
  }

  /**
   * describes the subject
   *
   * @return subject
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * describes the subject
   *
   * @param subject to set
   * @return EmailReques
   */
  public <T extends EmailReques> T setSubject(String subject) {
    this.subject = subject;
    return (T) this;
  }
}
