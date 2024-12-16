package tv.codely.shared.domain;

import net.datafaker.Faker;

public final class WordMother {
    public static String random() {
        return new Faker().name().fullName();
    }
}
