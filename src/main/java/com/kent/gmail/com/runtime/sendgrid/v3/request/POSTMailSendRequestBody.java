package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class POSTMailSendRequestBody {

  private String personalizations;

  private FromEmailObject from;

  private ReplyToEmailObject reply_to;

  private String reply_to_list;

  private String subject;

  private String content;

  private String attachments;

  private String template_id;

  private String headers;

  private String categories;

  private String custom_args;

  private String send_at;

  private String batch_id;

  private POSTMailSendRequestBodyAsm asm;

  private String ip_pool_name;

  private POSTMailSendRequestBodyMailSettings mail_settings;

  private POSTMailSendRequestBodyTrackingSettings tracking_settings;

  public POSTMailSendRequestBody() {}

  /**
   * @return personalizations
   */
  public String getPersonalizations() {
    return this.personalizations;
  }

  /**
   * @param personalizations to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setPersonalizations(String personalizations) {
    this.personalizations = personalizations;
    return (T) this;
  }

  /**
   * @return from
   */
  public FromEmailObject getFrom() {
    return this.from;
  }

  /**
   * @param from to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setFrom(FromEmailObject from) {
    this.from = from;
    return (T) this;
  }

  /**
   * @return reply_to
   */
  public ReplyToEmailObject getReply_to() {
    return this.reply_to;
  }

  /**
   * @param reply_to to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setReply_to(ReplyToEmailObject reply_to) {
    this.reply_to = reply_to;
    return (T) this;
  }

  /**
   * @return reply_to_list
   */
  public String getReply_to_list() {
    return this.reply_to_list;
  }

  /**
   * @param reply_to_list to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setReply_to_list(String reply_to_list) {
    this.reply_to_list = reply_to_list;
    return (T) this;
  }

  /**
   * @return subject
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * @param subject to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setSubject(String subject) {
    this.subject = subject;
    return (T) this;
  }

  /**
   * @return content
   */
  public String getContent() {
    return this.content;
  }

  /**
   * @param content to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setContent(String content) {
    this.content = content;
    return (T) this;
  }

  /**
   * @return attachments
   */
  public String getAttachments() {
    return this.attachments;
  }

  /**
   * @param attachments to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setAttachments(String attachments) {
    this.attachments = attachments;
    return (T) this;
  }

  /**
   * @return template_id
   */
  public String getTemplate_id() {
    return this.template_id;
  }

  /**
   * @param template_id to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setTemplate_id(String template_id) {
    this.template_id = template_id;
    return (T) this;
  }

  /**
   * @return headers
   */
  public String getHeaders() {
    return this.headers;
  }

  /**
   * @param headers to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setHeaders(String headers) {
    this.headers = headers;
    return (T) this;
  }

  /**
   * @return categories
   */
  public String getCategories() {
    return this.categories;
  }

  /**
   * @param categories to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setCategories(String categories) {
    this.categories = categories;
    return (T) this;
  }

  /**
   * @return custom_args
   */
  public String getCustom_args() {
    return this.custom_args;
  }

  /**
   * @param custom_args to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setCustom_args(String custom_args) {
    this.custom_args = custom_args;
    return (T) this;
  }

  /**
   * @return send_at
   */
  public String getSend_at() {
    return this.send_at;
  }

  /**
   * @param send_at to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setSend_at(String send_at) {
    this.send_at = send_at;
    return (T) this;
  }

  /**
   * @return batch_id
   */
  public String getBatch_id() {
    return this.batch_id;
  }

  /**
   * @param batch_id to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setBatch_id(String batch_id) {
    this.batch_id = batch_id;
    return (T) this;
  }

  /**
   * @return asm
   */
  public POSTMailSendRequestBodyAsm getAsm() {
    return this.asm;
  }

  /**
   * @param asm to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setAsm(POSTMailSendRequestBodyAsm asm) {
    this.asm = asm;
    return (T) this;
  }

  /**
   * @return ip_pool_name
   */
  public String getIp_pool_name() {
    return this.ip_pool_name;
  }

  /**
   * @param ip_pool_name to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setIp_pool_name(String ip_pool_name) {
    this.ip_pool_name = ip_pool_name;
    return (T) this;
  }

  /**
   * @return mail_settings
   */
  public POSTMailSendRequestBodyMailSettings getMail_settings() {
    return this.mail_settings;
  }

  /**
   * @param mail_settings to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setMail_settings(
      POSTMailSendRequestBodyMailSettings mail_settings) {
    this.mail_settings = mail_settings;
    return (T) this;
  }

  /**
   * @return tracking_settings
   */
  public POSTMailSendRequestBodyTrackingSettings getTracking_settings() {
    return this.tracking_settings;
  }

  /**
   * @param tracking_settings to set
   * @return POSTMailSendRequestBody
   */
  public <T extends POSTMailSendRequestBody> T setTracking_settings(
      POSTMailSendRequestBodyTrackingSettings tracking_settings) {
    this.tracking_settings = tracking_settings;
    return (T) this;
  }
}
