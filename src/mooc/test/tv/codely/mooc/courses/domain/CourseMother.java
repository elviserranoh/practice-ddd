package tv.codely.mooc.courses.domain;

import tv.codely.mooc.courses.application.create.CreateCourseRequest;
import tv.codely.mooc.courses.infrastructure.persistence.entity.CourseEntity;

public final class CourseMother {
    public static CourseEntity create(String id, String name, String duration) {
        return new CourseEntity(id, name, duration);
    }

    public static CourseEntity fromRequest(CreateCourseRequest request) {
        return create(
            request.id(),
            request.name(),
            request.duration()
        );
    }

    public static CourseEntity random() {
        return create(CourseIdMother.random().value(), CourseNameMother.random().value(), CourseDurationMother.random().value());
    }
}
