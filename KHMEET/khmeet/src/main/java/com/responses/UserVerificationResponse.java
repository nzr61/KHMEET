package com.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserVerificationResponse {
    private int status;
    private String message;
    private String email;
    private Long user_id;
}
