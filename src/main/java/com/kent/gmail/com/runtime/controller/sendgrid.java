package com.kent.gmail.com.runtime.controller;

import com.kent.gmail.com.runtime.flows.Sendgridflow;
import com.kent.gmail.com.runtime.request.EmailReques;
import com.kent.gmail.com.runtime.response.SendGridAPIResponse;
import com.kent.gmail.com.runtime.security.UserSecurityContext;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("sendgrid")
@Tag(name = "sendgrid")
public class sendgrid {

  @Autowired private Sendgridflow sendgridflow;

  @PostMapping("sendgrid")
  @Operation(summary = "sendgrid", description = "sendgrid")
  public SendGridAPIResponse sendgrid(
      @RequestBody EmailReques emailReques, Authentication authentication) {

    UserSecurityContext securityContext = (UserSecurityContext) authentication.getPrincipal();

    return sendgridflow.run(emailReques, securityContext);
  }
}
