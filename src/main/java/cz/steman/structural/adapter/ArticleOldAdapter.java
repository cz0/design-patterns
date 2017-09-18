package cz.steman.structural.adapter;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class ArticleOldAdapter implements Article {

    ArticleOld instance;

    public ArticleOldAdapter(ArticleOld instance) {
        this.instance = instance;
    }

    @Override
    public String getUuid() {
        return String.valueOf(instance.getId());
    }

    @Override
    public LocalDateTime getDisplayDate() {
        return instance.getPublishDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    @Override
    public String toString() {
        return "ArticleAdapter{" +
                "uuid='" + getUuid() + '\'' +
                ", displayDate=" + getDisplayDate() +
                '}';
    }

}
