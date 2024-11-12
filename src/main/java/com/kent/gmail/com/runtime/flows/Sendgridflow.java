package com.kent.gmail.com.runtime.flows;

import com.kent.gmail.com.runtime.security.UserSecurityContext;
import com.kent.gmail.com.runtime.sendgrid.v3.SendGridAPI;
import com.kent.gmail.com.runtime.sendgrid.v3.request.POSTMailSendRequestBody;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Sendgridflow {
  @Scheduled(fixedDelay = 15000)
  public void runSchedule() {
    run(null);
  }

  public String run(UserSecurityContext securityContext) {

    SendGridAPI sendgridapi =
        new SendGridAPI()
            .setToken("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")
            .setBasePath("https://api.sendgrid.com/v3");

    sendgridapi.pOST_mailsend(
        new POSTMailSendRequestBody()
            .setContent("HI")
            .setSubject("HI")
            .setPersonalizations("dejolo9154@operades.com"));

    return "String";
  }
}
