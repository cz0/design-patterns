package cz.steman.structural.bridge;

public class Article {

    private String uuid;
    private String title;
    private String kicker;

    public Article(String uuid, String title, String kicker) {
        this.uuid = uuid;
        this.title = title;
        this.kicker = kicker;
    }

    public String getUuid() {
        return uuid;
    }

    public String getTitle() {
        return title;
    }

    public String getKicker() {
        return kicker;
    }
}
