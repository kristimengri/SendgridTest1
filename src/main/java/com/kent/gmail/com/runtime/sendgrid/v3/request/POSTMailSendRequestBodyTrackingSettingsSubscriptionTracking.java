package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class POSTMailSendRequestBodyTrackingSettingsSubscriptionTracking {

  private String enable;

  private String text;

  private String html;

  private String substitution_tag;

  public POSTMailSendRequestBodyTrackingSettingsSubscriptionTracking() {}

  /**
   * @return enable
   */
  public String getEnable() {
    return this.enable;
  }

  /**
   * @param enable to set
   * @return POSTMailSendRequestBodyTrackingSettingsSubscriptionTracking
   */
  public <T extends POSTMailSendRequestBodyTrackingSettingsSubscriptionTracking> T setEnable(
      String enable) {
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
   * @return POSTMailSendRequestBodyTrackingSettingsSubscriptionTracking
   */
  public <T extends POSTMailSendRequestBodyTrackingSettingsSubscriptionTracking> T setText(
      String text) {
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
   * @return POSTMailSendRequestBodyTrackingSettingsSubscriptionTracking
   */
  public <T extends POSTMailSendRequestBodyTrackingSettingsSubscriptionTracking> T setHtml(
      String html) {
    this.html = html;
    return (T) this;
  }

  /**
   * @return substitution_tag
   */
  public String getSubstitution_tag() {
    return this.substitution_tag;
  }

  /**
   * @param substitution_tag to set
   * @return POSTMailSendRequestBodyTrackingSettingsSubscriptionTracking
   */
  public <T extends POSTMailSendRequestBodyTrackingSettingsSubscriptionTracking>
      T setSubstitution_tag(String substitution_tag) {
    this.substitution_tag = substitution_tag;
    return (T) this;
  }
}
