package cz.steman.structural.adapter;

import java.util.Date;

public class ArticleOld {

    private int id;
    private Date publishDate;

    public ArticleOld(int id, Date publishDate) {
        this.id = id;
        this.publishDate = publishDate;
    }

    public int getId() {
        return id;
    }

    public Date getPublishDate() {
        return publishDate;
    }

}
