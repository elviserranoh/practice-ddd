package tv.codely.mooc.courses.application.create;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.domain.CourseMother;
import tv.codely.mooc.courses.infrastructure.persistence.entity.CourseEntity;

final class CourseCreatorShould extends CoursesModuleTestCase {

    private CourseCreator creator;

    @BeforeEach
    void setUp() throws Exception {
        super.setUp();
        creator = new CourseCreator(repository);
    }

    @Test
    void save_a_valid_course() throws Exception {
        CreateCourseRequest request = CreateCourseRequestMother.random();

        CourseEntity course = CourseMother.fromRequest(request);

        creator.create(request);

        shouldHaveSave(course);
    }

}
