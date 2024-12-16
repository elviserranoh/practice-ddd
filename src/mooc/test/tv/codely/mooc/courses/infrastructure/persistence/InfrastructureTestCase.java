package tv.codely.mooc.courses.infrastructure.persistence;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import tv.codely.apps.mooc.MoocBackendApplication;

@ContextConfiguration(classes = MoocBackendApplication.class)
@SpringBootTest
public abstract class InfrastructureTestCase {
}
