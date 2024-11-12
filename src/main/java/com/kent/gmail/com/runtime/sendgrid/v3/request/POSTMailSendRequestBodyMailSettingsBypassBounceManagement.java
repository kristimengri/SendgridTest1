package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class POSTMailSendRequestBodyMailSettingsBypassBounceManagement {

  private String enable;

  public POSTMailSendRequestBodyMailSettingsBypassBounceManagement() {}

  /**
   * @return enable
   */
  public String getEnable() {
    return this.enable;
  }

  /**
   * @param enable to set
   * @return POSTMailSendRequestBodyMailSettingsBypassBounceManagement
   */
  public <T extends POSTMailSendRequestBodyMailSettingsBypassBounceManagement> T setEnable(
      String enable) {
    this.enable = enable;
    return (T) this;
  }
}
