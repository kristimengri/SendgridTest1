package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class POSTMailSendRequestBodyMailSettingsBypassUnsubscribeManagement {

  private String enable;

  public POSTMailSendRequestBodyMailSettingsBypassUnsubscribeManagement() {}

  /**
   * @return enable
   */
  public String getEnable() {
    return this.enable;
  }

  /**
   * @param enable to set
   * @return POSTMailSendRequestBodyMailSettingsBypassUnsubscribeManagement
   */
  public <T extends POSTMailSendRequestBodyMailSettingsBypassUnsubscribeManagement> T setEnable(
      String enable) {
    this.enable = enable;
    return (T) this;
  }
}
