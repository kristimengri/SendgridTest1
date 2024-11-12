package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class POSTMailSendRequestBodyMailSettingsBypassSpamManagement {

  private String enable;

  public POSTMailSendRequestBodyMailSettingsBypassSpamManagement() {}

  /**
   * @return enable
   */
  public String getEnable() {
    return this.enable;
  }

  /**
   * @param enable to set
   * @return POSTMailSendRequestBodyMailSettingsBypassSpamManagement
   */
  public <T extends POSTMailSendRequestBodyMailSettingsBypassSpamManagement> T setEnable(
      String enable) {
    this.enable = enable;
    return (T) this;
  }
}
