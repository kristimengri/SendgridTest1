package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class POSTMailSendRequestBodyTrackingSettingsGanalytics {

  private String enable;

  private String utm_source;

  private String utm_medium;

  private String utm_term;

  private String utm_content;

  private String utm_campaign;

  public POSTMailSendRequestBodyTrackingSettingsGanalytics() {}

  /**
   * @return enable
   */
  public String getEnable() {
    return this.enable;
  }

  /**
   * @param enable to set
   * @return POSTMailSendRequestBodyTrackingSettingsGanalytics
   */
  public <T extends POSTMailSendRequestBodyTrackingSettingsGanalytics> T setEnable(String enable) {
    this.enable = enable;
    return (T) this;
  }

  /**
   * @return utm_source
   */
  public String getUtm_source() {
    return this.utm_source;
  }

  /**
   * @param utm_source to set
   * @return POSTMailSendRequestBodyTrackingSettingsGanalytics
   */
  public <T extends POSTMailSendRequestBodyTrackingSettingsGanalytics> T setUtm_source(
      String utm_source) {
    this.utm_source = utm_source;
    return (T) this;
  }

  /**
   * @return utm_medium
   */
  public String getUtm_medium() {
    return this.utm_medium;
  }

  /**
   * @param utm_medium to set
   * @return POSTMailSendRequestBodyTrackingSettingsGanalytics
   */
  public <T extends POSTMailSendRequestBodyTrackingSettingsGanalytics> T setUtm_medium(
      String utm_medium) {
    this.utm_medium = utm_medium;
    return (T) this;
  }

  /**
   * @return utm_term
   */
  public String getUtm_term() {
    return this.utm_term;
  }

  /**
   * @param utm_term to set
   * @return POSTMailSendRequestBodyTrackingSettingsGanalytics
   */
  public <T extends POSTMailSendRequestBodyTrackingSettingsGanalytics> T setUtm_term(
      String utm_term) {
    this.utm_term = utm_term;
    return (T) this;
  }

  /**
   * @return utm_content
   */
  public String getUtm_content() {
    return this.utm_content;
  }

  /**
   * @param utm_content to set
   * @return POSTMailSendRequestBodyTrackingSettingsGanalytics
   */
  public <T extends POSTMailSendRequestBodyTrackingSettingsGanalytics> T setUtm_content(
      String utm_content) {
    this.utm_content = utm_content;
    return (T) this;
  }

  /**
   * @return utm_campaign
   */
  public String getUtm_campaign() {
    return this.utm_campaign;
  }

  /**
   * @param utm_campaign to set
   * @return POSTMailSendRequestBodyTrackingSettingsGanalytics
   */
  public <T extends POSTMailSendRequestBodyTrackingSettingsGanalytics> T setUtm_campaign(
      String utm_campaign) {
    this.utm_campaign = utm_campaign;
    return (T) this;
  }
}
