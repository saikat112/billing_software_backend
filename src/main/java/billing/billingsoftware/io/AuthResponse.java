package billing.billingsoftware.io;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AuthResponse {
    private String email;
    private String role;
    private String token;

}
