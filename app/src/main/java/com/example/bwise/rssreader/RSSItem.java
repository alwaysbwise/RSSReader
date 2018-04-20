package com.example.bwise.rssreader;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by BWise on 4/19/2018.
 */

public class RSSItem {

    //instance variables
    private String title = null;
    private String description = null;
    private String link = null;
    private String pubDate = null;

    //only include date not time
    private SimpleDateFormat dateOutFormat =
            new SimpleDateFormat("EEEE (MMM d)");
    //only include date not time
    private  SimpleDateFormat dateInFormat =
            new SimpleDateFormat("yyyy-MM-dd");

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }


    public String getPubDateFormatted() {
        try {
            if(pubDate != null){
                Date date = dateInFormat.parse(pubDate);
                String pubDateFormatted = dateOutFormat.format(date);
                return pubDateFormatted;
            } else {
                return "No date in the RSS feed";
            }
        } catch(ParseException e){
            return "No date in the feed";
        }
    }





}
