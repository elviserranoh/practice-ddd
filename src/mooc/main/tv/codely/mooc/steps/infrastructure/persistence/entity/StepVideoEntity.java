package tv.codely.mooc.steps.infrastructure.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "steps_videos")
public class StepVideoEntity extends StepEntity {

    @Column(name = "url", length = 255, nullable = false)
    private String url;

    @Column(name = "text", columnDefinition = "TEXT", nullable = false)
    private String text;

    public StepVideoEntity() {
    }

    public StepVideoEntity(String url, String text) {
        this.url = url;
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StepVideoEntity that = (StepVideoEntity) o;
        return Objects.equals(url, that.url) && Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, text);
    }
}
