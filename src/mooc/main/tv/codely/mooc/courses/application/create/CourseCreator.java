package tv.codely.mooc.courses.application.create;

import tv.codely.mooc.courses.domain.*;
import tv.codely.mooc.courses.infrastructure.persistence.entity.CourseEntity;
import tv.codely.shared.domain.Service;

@Service
public final class CourseCreator {

    private final CourseRepository repository;

    public CourseCreator(CourseRepository repository) {
        this.repository = repository;
    }

    public void create(CreateCourseRequest request) {
        CourseEntity course = new CourseEntity(request.id(),request.name(), request.duration());
        repository.save(course);
    }

}
