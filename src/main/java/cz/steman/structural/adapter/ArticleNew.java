package cz.steman.structural.adapter;

import java.time.LocalDateTime;

public class ArticleNew implements Article {

    private String uuid;
    private LocalDateTime displayDate;

    public ArticleNew(String uuid, LocalDateTime displayDate) {
        this.uuid = uuid;
        this.displayDate = displayDate;
    }

    @Override
    public String getUuid() {
        return uuid;
    }

    @Override
    public LocalDateTime getDisplayDate() {
        return displayDate;
    }

    @Override
    public String toString() {
        return "ArticleNew{" +
                "uuid='" + uuid + '\'' +
                ", displayDate=" + displayDate +
                '}';
    }

}
