package com.askar.videolibrary.dto.user;

import com.askar.videolibrary.entity.enums.Role;
import lombok.Value;

@Value
public class UserReadDto {

    Long id;
    String username;
    String password;
    String email;
    Role role;

}
