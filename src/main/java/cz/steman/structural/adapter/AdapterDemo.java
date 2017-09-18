package cz.steman.structural.adapter;

public class AdapterDemo {

    public static void main(String[] args) {
        new ArticleClient().getArticles().forEach(System.out::println);
    }

}
