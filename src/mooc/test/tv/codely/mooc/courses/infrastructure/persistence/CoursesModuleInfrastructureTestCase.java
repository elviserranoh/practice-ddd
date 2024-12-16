package tv.codely.mooc.courses.infrastructure.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import tv.codely.mooc.courses.domain.CourseRepository;

public abstract class CoursesModuleInfrastructureTestCase extends InfrastructureTestCase {
    protected InMemoryCourseRepository inMemoryCourseRepository = new InMemoryCourseRepository();

    @Autowired
    protected CourseRepository postgresRepository;
}
