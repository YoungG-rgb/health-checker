package kg.tech.dockerlesson1.controllers;

import jakarta.servlet.http.HttpServletRequest;
import kg.tech.dockerlesson1.models.HealthResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public ResponseEntity<HealthResponse> checkHealth(HttpServletRequest request){
        log.info("request from: " + request.getRemoteAddr());
        return ResponseEntity.ok(new HealthResponse("OK"));
    }
}
