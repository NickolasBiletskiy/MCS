package logic;


import java.sql.Time;
import java.util.Date;

/**
 * Entity class for Actions, mapped by
 * @see hibernateMapping/Action.nbm.xml
 * Created by user on 06.03.2015.
 */

public class Action {
    private int id;
    private Date date;
    private Time time;
    private String placeItteract;
    //private ConscriptCard conscriptCard;
    private int specialistId;
    private Specialist specialist;


    public Action (){};

    // geters не забуть додать профіль

    public Date getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public String getPlaceItteract() {
        return placeItteract;
    }

    public Specialist getSpecialist() {
        return specialist;
    }

    public Time getTime() {
        return time;
    }

    public int getSpecialistId() {
        return specialistId;
    }



    // seters не забуть додать профіль
    public void setTime(Time time) {
        this.time = time;
    }

    public void setSpecialistId(int specialistId) {
        this.specialistId = specialistId;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }

    public void setPlaceItteract(String placeItteract) {
        this.placeItteract = placeItteract;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
