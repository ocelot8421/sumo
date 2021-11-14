package hu.progmasters.oop.composition.desk;

import java.util.Objects;

public class Drawer {
    private String name;
    private boolean status;
    private Paper[] papers = new Paper[10];

    public Drawer(String name) {
        this.name = name;
    }

    public Paper[] putPaperIntoDraw(Paper paper) {
        for (int i = 0; i < papers.length; i++) {
            if (Objects.isNull(papers[i])) {
                papers[i] = paper;
                return papers;
            }
        }
        return papers;
    }

    public void whatIsInTheDrawer() {
        System.out.println(name + "fiók tartalma:");
        int empty = papers.length;
        if (isStatus()) {
            setStatus(true);
        }
        for (int i = 0; i < papers.length; i++) {
            if (Objects.nonNull(papers[i])) {
                System.out.println(papers[i].getContent());
                empty--;
            }
        }
        System.out.println(empty + " lap fér még be a " + name + " fiókba.");
        System.out.println();

    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
