package az.edu.turing.bankingapplication.auth.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record LoginRequest(
        @NotBlank
        String username,

        @NotBlank
        String password,

        @NotBlank @Email
        String email
){
}
