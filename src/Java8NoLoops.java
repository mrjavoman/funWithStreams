import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by xavi on 1/17/15.
 */
public class Java8NoLoops {

    List<Article> articles;

    public Java8NoLoops (List<Article> articles) {

        this.articles = articles;
    }

    public Optional<Article> getFirstJavaArticle() {
        return articles.stream()
                .filter(article -> article.getTags().contains("Java"))
                .findFirst();
    }

    public List<Article> getAllJavaArticles() {
        return articles.stream()
                .filter(article -> article.getTags().contains("Java"))
                .collect(Collectors.toList());
    }

    public Map<String, List<Article>> groupByAuthor() {
        return articles.stream()
                .collect(Collectors.groupingBy(Article::getAuthor));
    }

    public Set<String> getDistinctTags() {
        return articles.stream()
                .flatMap(article -> article.getTags().stream())
                .collect(Collectors.toSet());
    }
}
