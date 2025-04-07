package personalDiaryOOP;

import java.time.LocalDateTime;

public class Entry {

    private String title;
    private String content;
    private String mood;
    private LocalDateTime timestamp;

    //constructor
    public Entry(String title, String content, String mood, LocalDateTime timestamp) {
        this.title = title;
        this.content = content;
        this.mood = mood;
        this.timestamp = timestamp;
    }

    //getter
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getMood() {
        return mood;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    //setter - as we can update the content and mood later while we don't really update the titles so setter is only chosen for content
    public void setContent(String content) {
        this.content = content;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String toString() {
        return "Title: " + title + "\nTime Stamp: " + timestamp + "\nContent: " + content + "\nOverall Mood: " + mood;
    }
}
