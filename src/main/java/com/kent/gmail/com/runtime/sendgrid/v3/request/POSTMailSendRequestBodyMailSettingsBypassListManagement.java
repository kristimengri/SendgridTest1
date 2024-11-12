package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class POSTMailSendRequestBodyMailSettingsBypassListManagement {

  private String enable;

  public POSTMailSendRequestBodyMailSettingsBypassListManagement() {}

  /**
   * @return enable
   */
  public String getEnable() {
    return this.enable;
  }

  /**
   * @param enable to set
   * @return POSTMailSendRequestBodyMailSettingsBypassListManagement
   */
  public <T extends POSTMailSendRequestBodyMailSettingsBypassListManagement> T setEnable(
      String enable) {
    this.enable = enable;
    return (T) this;
  }
}
