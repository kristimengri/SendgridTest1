package com.kent.gmail.com.runtime;

/** */
public class Response {

  private String status;

  public Response() {}

  /**
   * @return status
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * @param status to set
   * @return Response
   */
  public <T extends Response> T setStatus(String status) {
    this.status = status;
    return (T) this;
  }
}
