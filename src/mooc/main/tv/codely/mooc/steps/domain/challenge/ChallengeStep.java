package tv.codely.mooc.steps.domain.challenge;

import tv.codely.mooc.steps.domain.Step;
import tv.codely.mooc.steps.domain.StepId;
import tv.codely.mooc.steps.domain.StepTitle;

import java.util.Objects;

public class ChallengeStep extends Step {

    private final ChallengeStepStatement statement;

    public ChallengeStep(StepId id, StepTitle title, ChallengeStepStatement statement) {
        super(id, title);
        this.statement = statement;
    }

    public ChallengeStepStatement statement() {
        return statement;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ChallengeStep that = (ChallengeStep) o;
        return Objects.equals(statement, that.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), statement);
    }
}
