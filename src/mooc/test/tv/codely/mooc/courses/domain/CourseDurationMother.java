package tv.codely.mooc.courses.domain;


import tv.codely.shared.domain.IntegerMother;

public class CourseDurationMother {

    public static CourseDuration create(String name) {
        return new CourseDuration(name);
    }

    public static CourseDuration random() {
        return create(
                String.format("%s minutes",
                        IntegerMother.random())
        );
    }
}
