package cz.steman.structural.bridge;

public class BridgeDemo {

    public static void main(String[] args) {
        Article article = new Article("123", "The greates news", "Royal families");

        Publisher publisher = new ArticlePublisher(article);

        Redactor redactorCnn = new CnnRedactor();
        Redactor redactorBbc = new BbcRedactor();


        System.out.println(publisher.publish(redactorCnn));
        System.out.println(publisher.publish(redactorBbc));
    }

}
