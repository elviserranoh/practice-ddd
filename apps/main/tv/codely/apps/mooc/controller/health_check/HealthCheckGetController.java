package tv.codely.apps.mooc.controller.health_check;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public final class HealthCheckGetController {

    @GetMapping("/health-check")
    public ResponseEntity<HashMap<String, String>> handle() {
        HashMap<String, String> status = new HashMap<>();
        status.put("status", "OK");
        return ResponseEntity.ok(status);
    }
}
