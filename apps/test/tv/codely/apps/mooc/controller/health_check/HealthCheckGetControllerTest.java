package tv.codely.apps.mooc.controller.health_check;

import org.junit.jupiter.api.Test;

final class HealthCheckGetControllerTest extends RequestTestCase {

    @Test
    void check_health_check_is_working() throws Exception {
        this.assertResponse("/health-check", 200, "{\"status\":\"OK\"}");
    }
}
