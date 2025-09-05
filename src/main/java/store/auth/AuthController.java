package store.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AuthController {
    
    @PostMapping("/auth/register")
    public ResponseEntity<TokenOut> register(
        @RequestBody RegisterIn in
    );

    @PostMapping("/auth/login")
    public ResponseEntity<TokenOut> login(
        @RequestBody LoginIn in
    );

}
