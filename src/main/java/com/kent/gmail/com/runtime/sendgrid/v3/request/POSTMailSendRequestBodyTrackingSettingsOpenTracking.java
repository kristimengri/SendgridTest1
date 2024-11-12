package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class POSTMailSendRequestBodyTrackingSettingsOpenTracking {

  private String enable;

  private String substitution_tag;

  public POSTMailSendRequestBodyTrackingSettingsOpenTracking() {}

  /**
   * @return enable
   */
  public String getEnable() {
    return this.enable;
  }

  /**
   * @param enable to set
   * @return POSTMailSendRequestBodyTrackingSettingsOpenTracking
   */
  public <T extends POSTMailSendRequestBodyTrackingSettingsOpenTracking> T setEnable(
      String enable) {
    this.enable = enable;
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
   * @return POSTMailSendRequestBodyTrackingSettingsOpenTracking
   */
  public <T extends POSTMailSendRequestBodyTrackingSettingsOpenTracking> T setSubstitution_tag(
      String substitution_tag) {
    this.substitution_tag = substitution_tag;
    return (T) this;
  }
}
