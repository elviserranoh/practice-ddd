package tv.codely.mooc.courses.domain;

import tv.codely.shared.domain.WordMother;

public class CourseNameMother {

    public static CourseName create(String name) {
        return new CourseName(name);
    }

    public static CourseName random() {
        return create(
            WordMother.random()
        );
    }
}
