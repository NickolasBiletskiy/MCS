package logic;

/**
 * Created by user on 21.03.2015.
 */
public class Document {
    private int id;
    private String name;
    private String URL;



    public Document(){};

    //getters

    public int getId() {
        return id;
    }

    public String getURL() {
        return URL;
    }

    public String getName() {
        return name;
    }


    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}

