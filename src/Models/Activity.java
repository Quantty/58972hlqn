package Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

/**
 * Created by narto_000 on 9/19/2017.
 */
public class Activities {

    private StringProperty name;
    private IntegerProperty ageLimit;
    private DoubleProperty heightLimit;
    private StringProperty description;
    private StringProperty reqEquipment;
    private DoubleProperty duration;
    private DoubleProperty startTime;
    private LocalDate date;

    public Activities(String name, int ageLimit, double heightLimit, String description, String reqEquipment, double duration, double startTime, LocalDate date) {

        name = name;
        ageLimit = ageLimit;
        heightLimit = heightLimit;
        description = description;
        reqEquipment = reqEquipment;
        duration = duration;
        startTime = startTime;
        date = date;

    }
  // region getters and setters
   

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Activities() {

    }



    public LocalDate getDate() {
        return date;
    }
    // endregion
}
