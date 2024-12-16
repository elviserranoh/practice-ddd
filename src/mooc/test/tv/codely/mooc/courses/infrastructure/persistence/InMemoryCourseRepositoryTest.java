package tv.codely.mooc.courses.infrastructure.persistence;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.domain.CourseIdMother;
import tv.codely.mooc.courses.domain.CourseMother;
import tv.codely.mooc.courses.infrastructure.persistence.entity.CourseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

final class InMemoryCourseRepositoryTest extends CoursesModuleInfrastructureTestCase {

    @Test
    void save_a_valid_course() {
        CourseEntity course = CourseMother.random();
        inMemoryCourseRepository.save(course);
    }

    @Test
    void search_an_existing_course() {
        CourseEntity course = CourseMother.random();
        inMemoryCourseRepository.save(course);
        assertEquals(Optional.of(course), inMemoryCourseRepository.search(course.getId()));
    }

    @Test
    void not_find_a_non_existing_course() {
        assertFalse(inMemoryCourseRepository.search(CourseIdMother.random().value()).isPresent());
    }

}
