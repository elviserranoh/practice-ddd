package tv.codely.apps.mooc.controller.courses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tv.codely.mooc.courses.application.create.CourseCreator;
import tv.codely.mooc.courses.application.create.CreateCourseRequest;

@RestController
public final class CoursesPutController {

    private final CourseCreator creator;

    public CoursesPutController(CourseCreator creator) {
        this.creator = creator;
    }

    @PutMapping("courses/{id}")
    public ResponseEntity<?> create(@PathVariable final String id, @RequestBody Request request) {
        this.creator.create(new CreateCourseRequest(id, request.getName(), request.getDuration()));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}


