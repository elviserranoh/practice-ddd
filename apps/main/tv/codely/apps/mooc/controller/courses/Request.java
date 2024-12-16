package tv.codely.apps.mooc.controller.courses;

public final class Request {

    private String name;
    private String duration;

    public Request() {
    }

    public Request(String name, String duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

}
