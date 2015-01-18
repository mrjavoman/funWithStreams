import java.util.*;

/**
 * Created by xavi on 1/17/15.
 */
public class Java7Loops {

    private List<Article> articles;

    public Java7Loops (){

        articles = new ArrayList<Article>();
    }

    public Article getFirstJavaArticle() {

        for (Article article : articles) {
            if (article.getTags().contains("Java")) {
                return article;
            }
        }

        return null;
    }

    public List<Article> getAllJavaArticles() {

        List<Article> result = new ArrayList<Article>();

        for (Article article : articles) {
            if (article.getTags().contains("Java")) {
                result.add(article);
            }
        }

        return result;
    }

    public Map<String, List<Article>> groupByAuthor() {

        Map<String, List<Article>> result = new HashMap<String, List<Article>>();

        for (Article article : articles) {
            if (result.containsKey(article.getAuthor())) {
                result.get(article.getAuthor()).add(article);
            } else {
                ArrayList<Article> articles = new ArrayList<Article>();
                articles.add(article);
                result.put(article.getAuthor(), articles);
            }
        }

        return result;
    }

    public Set<String> getDistinctTags() {

        Set<String> result = new HashSet<String>();

        for (Article article : articles) {
            result.addAll(article.getTags());
        }

        return result;
    }

}
