package finalexam.task1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog {
    private String title;
    private String author;
    private Date date;
    private List<String> tags;
    private String content;


    public Blog() {
        this.tags = new ArrayList<>();
    }


    public Blog(String title, String author, Date date, List<String> tags, String content) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.tags = tags;
        this.content = content;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public void addTag(String tag) {
        this.tags.add(tag);
    }


    public void removeTag(String tag) {
        this.tags.remove(tag);
    }


    @Override
    public String toString() {
        return "Blog{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                ", tags=" + tags +
                ", content='" + content + '\'' +
                '}';
    }

}