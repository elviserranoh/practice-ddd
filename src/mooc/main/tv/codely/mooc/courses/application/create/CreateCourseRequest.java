package tv.codely.mooc.courses.application.create;

import java.util.Objects;

public class CreateCourseRequest {

    private String id;
    private String name;
    private String duration;

    public CreateCourseRequest() {
    }

    public CreateCourseRequest(String id, String name, String duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String duration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CreateCourseRequest course = (CreateCourseRequest) o;
        return Objects.equals(id, course.id) && Objects.equals(name, course.name) && Objects.equals(duration, course.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, duration);
    }

}
