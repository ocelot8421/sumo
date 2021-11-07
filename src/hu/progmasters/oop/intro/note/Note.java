package hu.progmasters.oop.intro.note;

public class Note {
    private String name;
    private String topic;
    private String text;


    public String getNoteInfo() {
        return getName() + ": (" + getTopic() + ") " + getText();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}

