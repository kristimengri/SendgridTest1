package com.kent.gmail.com.runtime.sendgrid.v3.request;

public class POSTMailSendRequestBodyAsm {

  private String group_id;

  private String groups_to_display;

  public POSTMailSendRequestBodyAsm() {}

  /**
   * @return group_id
   */
  public String getGroup_id() {
    return this.group_id;
  }

  /**
   * @param group_id to set
   * @return POSTMailSendRequestBodyAsm
   */
  public <T extends POSTMailSendRequestBodyAsm> T setGroup_id(String group_id) {
    this.group_id = group_id;
    return (T) this;
  }

  /**
   * @return groups_to_display
   */
  public String getGroups_to_display() {
    return this.groups_to_display;
  }

  /**
   * @param groups_to_display to set
   * @return POSTMailSendRequestBodyAsm
   */
  public <T extends POSTMailSendRequestBodyAsm> T setGroups_to_display(String groups_to_display) {
    this.groups_to_display = groups_to_display;
    return (T) this;
  }
}
