package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class POSTMailSendRequestBodyMailSettings {

  private POSTMailSendRequestBodyMailSettingsBypassListManagement bypass_list_management;

  private POSTMailSendRequestBodyMailSettingsBypassSpamManagement bypass_spam_management;

  private POSTMailSendRequestBodyMailSettingsBypassBounceManagement bypass_bounce_management;

  private POSTMailSendRequestBodyMailSettingsBypassUnsubscribeManagement
      bypass_unsubscribe_management;

  private POSTMailSendRequestBodyMailSettingsFooter footer;

  private POSTMailSendRequestBodyMailSettingsSandboxMode sandbox_mode;

  public POSTMailSendRequestBodyMailSettings() {}

  /**
   * @return bypass_list_management
   */
  public POSTMailSendRequestBodyMailSettingsBypassListManagement getBypass_list_management() {
    return this.bypass_list_management;
  }

  /**
   * @param bypass_list_management to set
   * @return POSTMailSendRequestBodyMailSettings
   */
  public <T extends POSTMailSendRequestBodyMailSettings> T setBypass_list_management(
      POSTMailSendRequestBodyMailSettingsBypassListManagement bypass_list_management) {
    this.bypass_list_management = bypass_list_management;
    return (T) this;
  }

  /**
   * @return bypass_spam_management
   */
  public POSTMailSendRequestBodyMailSettingsBypassSpamManagement getBypass_spam_management() {
    return this.bypass_spam_management;
  }

  /**
   * @param bypass_spam_management to set
   * @return POSTMailSendRequestBodyMailSettings
   */
  public <T extends POSTMailSendRequestBodyMailSettings> T setBypass_spam_management(
      POSTMailSendRequestBodyMailSettingsBypassSpamManagement bypass_spam_management) {
    this.bypass_spam_management = bypass_spam_management;
    return (T) this;
  }

  /**
   * @return bypass_bounce_management
   */
  public POSTMailSendRequestBodyMailSettingsBypassBounceManagement getBypass_bounce_management() {
    return this.bypass_bounce_management;
  }

  /**
   * @param bypass_bounce_management to set
   * @return POSTMailSendRequestBodyMailSettings
   */
  public <T extends POSTMailSendRequestBodyMailSettings> T setBypass_bounce_management(
      POSTMailSendRequestBodyMailSettingsBypassBounceManagement bypass_bounce_management) {
    this.bypass_bounce_management = bypass_bounce_management;
    return (T) this;
  }

  /**
   * @return bypass_unsubscribe_management
   */
  public POSTMailSendRequestBodyMailSettingsBypassUnsubscribeManagement
      getBypass_unsubscribe_management() {
    return this.bypass_unsubscribe_management;
  }

  /**
   * @param bypass_unsubscribe_management to set
   * @return POSTMailSendRequestBodyMailSettings
   */
  public <T extends POSTMailSendRequestBodyMailSettings> T setBypass_unsubscribe_management(
      POSTMailSendRequestBodyMailSettingsBypassUnsubscribeManagement
          bypass_unsubscribe_management) {
    this.bypass_unsubscribe_management = bypass_unsubscribe_management;
    return (T) this;
  }

  /**
   * @return footer
   */
  public POSTMailSendRequestBodyMailSettingsFooter getFooter() {
    return this.footer;
  }

  /**
   * @param footer to set
   * @return POSTMailSendRequestBodyMailSettings
   */
  public <T extends POSTMailSendRequestBodyMailSettings> T setFooter(
      POSTMailSendRequestBodyMailSettingsFooter footer) {
    this.footer = footer;
    return (T) this;
  }

  /**
   * @return sandbox_mode
   */
  public POSTMailSendRequestBodyMailSettingsSandboxMode getSandbox_mode() {
    return this.sandbox_mode;
  }

  /**
   * @param sandbox_mode to set
   * @return POSTMailSendRequestBodyMailSettings
   */
  public <T extends POSTMailSendRequestBodyMailSettings> T setSandbox_mode(
      POSTMailSendRequestBodyMailSettingsSandboxMode sandbox_mode) {
    this.sandbox_mode = sandbox_mode;
    return (T) this;
  }
}
