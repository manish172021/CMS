package com.cmr.GatewayService.service;

import com.cmr.GatewayService.model.Role;
import com.cmr.GatewayService.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
