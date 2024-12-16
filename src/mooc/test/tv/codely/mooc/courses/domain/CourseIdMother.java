package tv.codely.mooc.courses.domain;

import tv.codely.shared.domain.UuidMother;

public final class CourseIdMother {

    public static CourseId create(String id) {
        return new CourseId(id);
    }

    public static CourseId random() {
        return create(UuidMother.random());
    }


}
