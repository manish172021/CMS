package com.cmr.GatewayService.service;

import com.cmr.GatewayService.model.User;

public interface AuthenticationService {

    User signInAndReturnJWT(User signInRequest);

}
