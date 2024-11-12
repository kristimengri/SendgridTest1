package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class POSTMailSendRequestBodyTrackingSettingsClickTracking {

  private String enable;

  private String enable_text;

  public POSTMailSendRequestBodyTrackingSettingsClickTracking() {}

  /**
   * @return enable
   */
  public String getEnable() {
    return this.enable;
  }

  /**
   * @param enable to set
   * @return POSTMailSendRequestBodyTrackingSettingsClickTracking
   */
  public <T extends POSTMailSendRequestBodyTrackingSettingsClickTracking> T setEnable(
      String enable) {
    this.enable = enable;
    return (T) this;
  }

  /**
   * @return enable_text
   */
  public String getEnable_text() {
    return this.enable_text;
  }

  /**
   * @param enable_text to set
   * @return POSTMailSendRequestBodyTrackingSettingsClickTracking
   */
  public <T extends POSTMailSendRequestBodyTrackingSettingsClickTracking> T setEnable_text(
      String enable_text) {
    this.enable_text = enable_text;
    return (T) this;
  }
}
