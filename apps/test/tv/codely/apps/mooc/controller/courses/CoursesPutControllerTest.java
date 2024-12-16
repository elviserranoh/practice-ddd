package tv.codely.apps.mooc.controller.courses;

import org.junit.jupiter.api.Test;
import tv.codely.apps.mooc.controller.health_check.RequestTestCase;

import java.util.UUID;

public final class CoursesPutControllerTest extends RequestTestCase {

    @Test
    void create_a_new_course() throws Exception {
        assertRequestWithBody("PUT",
            "/courses/" + UUID.randomUUID(),
            "{\"name\": \"The best course\", \"duration\": \"5 hours\"}",
            201);
    }

}
