package tv.codely.mooc.courses.application.create;

import org.junit.jupiter.api.BeforeEach;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseRepository;
import tv.codely.mooc.courses.infrastructure.persistence.entity.CourseEntity;

import static org.mockito.Mockito.*;

public abstract class CoursesModuleTestCase extends UnitTestCase {

    protected CourseRepository repository;

    @BeforeEach
    void setUp() throws Exception {
        repository = mock(CourseRepository.class);
    }

    protected void shouldHaveSave(CourseEntity course) {
        verify(repository, atLeastOnce()).save(course);
    }
}
