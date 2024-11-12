package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class POSTMailSendRequestBodyMailSettingsSandboxMode {

  private String enable;

  public POSTMailSendRequestBodyMailSettingsSandboxMode() {}

  /**
   * @return enable
   */
  public String getEnable() {
    return this.enable;
  }

  /**
   * @param enable to set
   * @return POSTMailSendRequestBodyMailSettingsSandboxMode
   */
  public <T extends POSTMailSendRequestBodyMailSettingsSandboxMode> T setEnable(String enable) {
    this.enable = enable;
    return (T) this;
  }
}
