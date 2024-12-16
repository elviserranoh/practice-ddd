package tv.codely.mooc.steps.infrastructure.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "steps_challenges")
public class StepChallengeEntity extends StepEntity {

    @Column(name = "statement", columnDefinition = "TEXT", nullable = false)
    private String statement;

    public StepChallengeEntity() {
    }

    public StepChallengeEntity(String statement) {
        this.statement = statement;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        StepChallengeEntity that = (StepChallengeEntity) o;
        return Objects.equals(statement, that.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(statement);
    }
}
