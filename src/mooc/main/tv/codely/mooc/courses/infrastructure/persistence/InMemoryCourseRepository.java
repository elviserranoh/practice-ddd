package tv.codely.mooc.courses.infrastructure.persistence;

import tv.codely.mooc.courses.domain.CourseRepository;
import tv.codely.mooc.courses.infrastructure.persistence.entity.CourseEntity;

import java.util.HashMap;
import java.util.Optional;

public final class InMemoryCourseRepository implements CourseRepository {

    private HashMap<String, CourseEntity> courses;

    public InMemoryCourseRepository() {
        this.courses = new HashMap<>();
    }

    @Override
    public void save(CourseEntity course) {
        this.courses.put(course.getId(), course);
    }

    @Override
    public Optional<CourseEntity> search(String id) {
        return Optional.ofNullable(courses.get(id));
    }
}
