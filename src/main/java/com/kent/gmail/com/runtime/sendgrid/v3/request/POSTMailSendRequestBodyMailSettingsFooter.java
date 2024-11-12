package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class POSTMailSendRequestBodyMailSettingsFooter {

  private String enable;

  private String text;

  private String html;

  public POSTMailSendRequestBodyMailSettingsFooter() {}

  /**
   * @return enable
   */
  public String getEnable() {
    return this.enable;
  }

  /**
   * @param enable to set
   * @return POSTMailSendRequestBodyMailSettingsFooter
   */
  public <T extends POSTMailSendRequestBodyMailSettingsFooter> T setEnable(String enable) {
    this.enable = enable;
    return (T) this;
  }

  /**
   * @return text
   */
  public String getText() {
    return this.text;
  }

  /**
   * @param text to set
   * @return POSTMailSendRequestBodyMailSettingsFooter
   */
  public <T extends POSTMailSendRequestBodyMailSettingsFooter> T setText(String text) {
    this.text = text;
    return (T) this;
  }

  /**
   * @return html
   */
  public String getHtml() {
    return this.html;
  }

  /**
   * @param html to set
   * @return POSTMailSendRequestBodyMailSettingsFooter
   */
  public <T extends POSTMailSendRequestBodyMailSettingsFooter> T setHtml(String html) {
    this.html = html;
    return (T) this;
  }
}
