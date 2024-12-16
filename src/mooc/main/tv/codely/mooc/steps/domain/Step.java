package tv.codely.mooc.steps.domain;

import java.util.Objects;

public abstract class Step {

    private final StepId id;
    private final StepTitle title;

    public Step(StepId id, StepTitle title) {
        this.id = id;
        this.title = title;
    }

    public StepId id() {
        return id;
    }


    public StepTitle title() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Step step = (Step) o;
        return Objects.equals(id, step.id) && Objects.equals(title, step.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }
}
