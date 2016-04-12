package logic;

import java.util.Date;

/**
 *
 * Entity class for Decisions, mapped by
 * @see hibernateMapping/Decision.nbm.xml
 * Created by user on 06.03.2015.
 */

public class Decision {
    private int id;
    private Date date;
    private String comment;
    //ПРОФІЛЬ!!!!!
    private int specialistId;
    private Specialist specialist;

    public Decision(){};

    //GETERS

    public String getComment() {
        return comment;
    }

    public Date getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public Specialist getSpecialist() {
        return specialist;
    }

    public int getSpecialistId() {
        return specialistId;
    }

    //SETTERS

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }

    public void setSpecialistId(int specialistId) {
        this.specialistId = specialistId;
    }
}
