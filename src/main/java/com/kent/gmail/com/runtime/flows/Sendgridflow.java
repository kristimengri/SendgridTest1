package com.kent.gmail.com.runtime.flows;

import com.kent.gmail.com.runtime.model.SendgridResult;
import com.kent.gmail.com.runtime.request.EmailReques;
import com.kent.gmail.com.runtime.response.SendGridAPIResponse;
import com.kent.gmail.com.runtime.security.UserSecurityContext;
import com.kent.gmail.com.runtime.sendgrid.v3.SendGridAPI;
import com.kent.gmail.com.runtime.sendgrid.v3.request.POSTMailSendRequestBody;
import org.springframework.stereotype.Component;

@Component
public class Sendgridflow {

  public SendGridAPIResponse run(EmailReques body, UserSecurityContext securityContext) {

    SendGridAPI sendgridapi =
        new SendGridAPI()
            .setToken("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")
            .setBasePath("https://api.sendgrid.com/v3");

    sendgridapi.pOST_mailsend(
        new POSTMailSendRequestBody()
            .setContent("HI")
            .setSubject("HI")
            .setPersonalizations("cecag48998@operades.com"));

    return new SendGridAPIResponse()
        .setResult(SendgridResult.success)
        .setMessage("this is a message");
  }
}
