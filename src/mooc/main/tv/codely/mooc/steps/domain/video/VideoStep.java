package tv.codely.mooc.steps.domain.video;

import tv.codely.mooc.steps.domain.Step;
import tv.codely.mooc.steps.domain.StepId;
import tv.codely.mooc.steps.domain.StepTitle;

import java.util.Objects;

public class VideoStep extends Step {

    private final VideoUrl videoUrl;
    private final VideoStepText text;

    public VideoStep(StepId id, StepTitle title, VideoUrl videoUrl, VideoStepText text) {
        super(id, title);
        this.videoUrl = videoUrl;
        this.text = text;
    }

    public VideoUrl videoUrl() {
        return videoUrl;
    }

    public VideoStepText text() {
        return text;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VideoStep videoStep = (VideoStep) o;
        return Objects.equals(videoUrl, videoStep.videoUrl) && Objects.equals(text, videoStep.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), videoUrl, text);
    }
}
