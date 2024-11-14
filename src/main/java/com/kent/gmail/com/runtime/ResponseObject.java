package com.kent.gmail.com.runtime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseObject {
  @JsonProperty("status ")
  private String status;

  public ResponseObject() {}

  /**
   * @return status
   */
  @JsonProperty("status ")
  public String getStatus() {
    return this.status;
  }

  /**
   * @param status to set
   * @return ResponseObject
   */
  public <T extends ResponseObject> T setStatus(String status) {
    this.status = status;
    return (T) this;
  }
}
