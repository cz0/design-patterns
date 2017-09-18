package cz.steman.structural.bridge;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArticlePublisher extends Publisher {

    private Article article;

    public ArticlePublisher(Article article) {
        this.article = article;
    }

    @Override
    protected List<Attribute> getAttributes() {
        return Stream.of(new Attribute("Uuid", article.getUuid()),
                        new Attribute("Title", article.getTitle()),
                        new Attribute("Kicker", article.getKicker()))
                .collect(Collectors.toList());
    }

}
