package com.kent.gmail.com.runtime.response;

import com.kent.gmail.com.runtime.model.SendgridResult;

/** The response for send grid request */
public class SendGridAPIResponse {

  private String message;

  private SendgridResult result;

  public SendGridAPIResponse() {}

  /**
   * response message
   *
   * @return message
   */
  public String getMessage() {
    return this.message;
  }

  /**
   * response message
   *
   * @param message to set
   * @return SendGridAPIResponse
   */
  public <T extends SendGridAPIResponse> T setMessage(String message) {
    this.message = message;
    return (T) this;
  }

  /**
   * result enum
   *
   * @return result
   */
  public SendgridResult getResult() {
    return this.result;
  }

  /**
   * result enum
   *
   * @param result to set
   * @return SendGridAPIResponse
   */
  public <T extends SendGridAPIResponse> T setResult(SendgridResult result) {
    this.result = result;
    return (T) this;
  }
}
