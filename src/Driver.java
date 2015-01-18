import java.util.ArrayList;
import java.util.List;

/**
 * Created by xavi on 1/18/15.
 */
public class Driver {

    static public void main(String args[]) {

        List<Article> articleList = new ArrayList<>();

        //region Article initialization
        articleList.add(
                new Article(
                        "The Sigularity is Near",
                        "Ray Kurzweil",
                        new ArrayList<String>() {
                            {
                                add("Science");
                                add("Future");
                            }
                        }
                )
        );

        articleList.add(
                new Article(
                        "Quiet",
                        "Susan Cain",
                        new ArrayList<String>() {
                            {
                                add("Personal Growth");
                            }
                        }
                )
        );

        articleList.add(
                new Article(
                        "Rootkits",
                        "Greg Hoglund",
                        new ArrayList<String>() {
                            {
                                add("Technical");
                                add("Security");
                            }
                        }
                )
        );

        articleList.add(
                new Article(
                        "Operating Systems Concepts",
                        "Abraham Silberschatz",
                        new ArrayList<String>() {
                            {
                                add("Operating Systems");
                                add("Java");
                                add("Technical");
                            }
                        }
                )
        );
        //endregion

        Java7Loops j7Style = new Java7Loops(articleList);
        //Java8NoLoops j8Style = new Java8NoLoops(articleList);

        printArticle(j7Style.getFirstJavaArticle());

    }

    static public void printArticle(Article article) {

        System.out.println("Title: " + article.getTitle());
        System.out.println("Author: " + article.getAuthor());
        List<String> tags = article.getTags();
        //System.out.println("Tags: " + article.getTitle());
    }
}
