package tv.codely.mooc.steps.domain;

import tv.codely.mooc.courses.infrastructure.persistence.entity.CourseEntity;

import java.util.Optional;

public interface StepRepository {
    void save(CourseEntity course);

    Optional<CourseEntity> search(String id);
}
