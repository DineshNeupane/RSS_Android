package com.journaldev.androidrssfeedtutorial;


public class RSSItem {

    public String title;
    public String link;
    public String description;
    public String pubdate;

    public String author;

    public RSSItem(String title, String link, String description, String pubdate,String author) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.pubdate = pubdate;

        this.author = author;
    }
    @Override
    public String toString() {
        return "RssItem{" +
                "title='" + title + '\n' +
                ", pubdate='" + pubdate + '\n' +
                ", description='" + description + '\n' +
                ", author ='" + author + '\n' +
                '}';}
}
