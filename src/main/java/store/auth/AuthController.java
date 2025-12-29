package store.auth;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "auth", url = "http://auth:8080")
public interface AuthController {
    
    @PostMapping("/auth/register")
    public ResponseEntity<Void> register(
        @RequestBody RegisterIn in,
        @RequestHeader("Origin") String origin
    );

    @PostMapping("/auth/login")
    public ResponseEntity<Void> login(
        @RequestBody LoginIn in,
        @RequestHeader("Origin") String origin
    );

    @PostMapping("/auth/logout")
    public ResponseEntity<Void> logout(
        @RequestHeader("Origin") String origin
    );

    @PostMapping("/auth/solve")
    public ResponseEntity<Map<String, String>> solve(
        @RequestBody TokenOut in
    );

}
