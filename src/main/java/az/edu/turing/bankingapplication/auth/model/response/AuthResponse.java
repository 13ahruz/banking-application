package az.edu.turing.bankingapplication.auth.model.response;

import az.edu.turing.bankingapplication.auth.model.enums.Role;
import az.edu.turing.bankingapplication.model.dto.response.RegisterResponse;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor

public class AuthResponse {

    private String message;
    private String token;
    private String refreshToken;
    private Set<Role> roles;



    public AuthResponse(String message) {
        this.message = message;
    }

    public AuthResponse(String message, String newToken) {
        this.message = message;
        this.token = newToken;
    }

    public AuthResponse(String userRegisteredSuccessfully, String token, String refreshToken, Set<Role> roles, RegisterResponse registerResponse) {
        this.message = userRegisteredSuccessfully;
        this.token = token;
        this.refreshToken = refreshToken;
        this.roles = roles;

    }
}
