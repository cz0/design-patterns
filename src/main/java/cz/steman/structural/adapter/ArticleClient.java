package cz.steman.structural.adapter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleClient {

    public List<Article> getArticles() {
        List<Article> articles = new ArrayList<>();

        Article newArticle = new ArticleNew("1234", LocalDateTime.now());
        articles.add(newArticle);

        ArticleOld oldArticle = new ArticleOld(1235, new Date());
        articles.add(new ArticleOldAdapter(oldArticle));

        return articles;
    }

}
