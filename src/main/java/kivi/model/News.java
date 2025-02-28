package kivi.model;

import java.util.Objects;

public class News {
    private double newsId;
    private String newsEditor;
    private String newsContent;

    public News() {
    }

    public News(double newsId, String newsEditor, String newsContent) {
        this.newsId = newsId;
        this.newsEditor = newsEditor;
        this.newsContent = newsContent;
    }

    public double getNewsId() {
        return newsId;
    }

    public void setNewsId(double newsId) {
        this.newsId = newsId;
    }

    public String getNewsEditor() {
        return newsEditor;
    }

    public void setNewsEditor(String newsEditor) {
        this.newsEditor = newsEditor;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Double.compare(newsId, news.newsId) == 0 && Objects.equals(newsEditor, news.newsEditor) && Objects.equals(newsContent, news.newsContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId, newsEditor, newsContent);
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", newsEditor='" + newsEditor + '\'' +
                ", newsContent='" + newsContent + '\'' +
                '}';
    }
}
