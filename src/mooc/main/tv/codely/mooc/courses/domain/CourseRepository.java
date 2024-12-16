package tv.codely.mooc.courses.domain;

import tv.codely.mooc.courses.infrastructure.persistence.entity.CourseEntity;

import java.util.Optional;

public interface CourseRepository {
    void save(CourseEntity course);

    Optional<CourseEntity> search(String id);
}
