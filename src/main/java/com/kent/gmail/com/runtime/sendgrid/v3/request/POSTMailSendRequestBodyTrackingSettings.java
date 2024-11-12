package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class POSTMailSendRequestBodyTrackingSettings {

  private POSTMailSendRequestBodyTrackingSettingsClickTracking click_tracking;

  private POSTMailSendRequestBodyTrackingSettingsOpenTracking open_tracking;

  private POSTMailSendRequestBodyTrackingSettingsSubscriptionTracking subscription_tracking;

  private POSTMailSendRequestBodyTrackingSettingsGanalytics ganalytics;

  public POSTMailSendRequestBodyTrackingSettings() {}

  /**
   * @return click_tracking
   */
  public POSTMailSendRequestBodyTrackingSettingsClickTracking getClick_tracking() {
    return this.click_tracking;
  }

  /**
   * @param click_tracking to set
   * @return POSTMailSendRequestBodyTrackingSettings
   */
  public <T extends POSTMailSendRequestBodyTrackingSettings> T setClick_tracking(
      POSTMailSendRequestBodyTrackingSettingsClickTracking click_tracking) {
    this.click_tracking = click_tracking;
    return (T) this;
  }

  /**
   * @return open_tracking
   */
  public POSTMailSendRequestBodyTrackingSettingsOpenTracking getOpen_tracking() {
    return this.open_tracking;
  }

  /**
   * @param open_tracking to set
   * @return POSTMailSendRequestBodyTrackingSettings
   */
  public <T extends POSTMailSendRequestBodyTrackingSettings> T setOpen_tracking(
      POSTMailSendRequestBodyTrackingSettingsOpenTracking open_tracking) {
    this.open_tracking = open_tracking;
    return (T) this;
  }

  /**
   * @return subscription_tracking
   */
  public POSTMailSendRequestBodyTrackingSettingsSubscriptionTracking getSubscription_tracking() {
    return this.subscription_tracking;
  }

  /**
   * @param subscription_tracking to set
   * @return POSTMailSendRequestBodyTrackingSettings
   */
  public <T extends POSTMailSendRequestBodyTrackingSettings> T setSubscription_tracking(
      POSTMailSendRequestBodyTrackingSettingsSubscriptionTracking subscription_tracking) {
    this.subscription_tracking = subscription_tracking;
    return (T) this;
  }

  /**
   * @return ganalytics
   */
  public POSTMailSendRequestBodyTrackingSettingsGanalytics getGanalytics() {
    return this.ganalytics;
  }

  /**
   * @param ganalytics to set
   * @return POSTMailSendRequestBodyTrackingSettings
   */
  public <T extends POSTMailSendRequestBodyTrackingSettings> T setGanalytics(
      POSTMailSendRequestBodyTrackingSettingsGanalytics ganalytics) {
    this.ganalytics = ganalytics;
    return (T) this;
  }
}
