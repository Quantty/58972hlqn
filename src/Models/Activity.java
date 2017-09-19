package Models;

import javafx.beans.property.*;

import java.time.LocalDate;

/**
 * Created by narto_000 on 9/19/2017.
 */
public class Activity {

    private StringProperty name;
    private IntegerProperty ageLimit;
    private DoubleProperty heightLimit;
    private StringProperty description;
    private StringProperty reqEquipment;
    private DoubleProperty duration;
    private DoubleProperty startTime;
    private StringProperty date;

    public Activity() {
        this.name = new SimpleStringProperty();
        this.ageLimit = new SimpleIntegerProperty();
        this.heightLimit = new SimpleDoubleProperty();
        this.description = new SimpleStringProperty();
        this.reqEquipment = new SimpleStringProperty();
        this.duration = new SimpleDoubleProperty();
        this.startTime = new SimpleDoubleProperty();
        this.date = new SimpleStringProperty();
    }



    public Activity(String name, Integer ageLimit, Double heightLimit, String description, String reqEquipment, Double duration, Double startTime, String date)
    {
        this.name = new SimpleStringProperty(name);
        this.ageLimit = new SimpleIntegerProperty(ageLimit);
        this.heightLimit = new SimpleDoubleProperty(heightLimit);
        this.description = new SimpleStringProperty(description);
        this.reqEquipment = new SimpleStringProperty(reqEquipment);
        this.duration = new SimpleDoubleProperty(duration);
        this.startTime = new SimpleDoubleProperty(startTime);
        this.date = new SimpleStringProperty(date);
    }

    // region getters and setters
    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getAgeLimit() {
        return ageLimit.get();
    }

    public IntegerProperty ageLimitProperty() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit.set(ageLimit);
    }

    public double getHeightLimit() {
        return heightLimit.get();
    }

    public DoubleProperty heightLimitProperty() {
        return heightLimit;
    }

    public void setHeightLimit(double heightLimit) {
        this.heightLimit.set(heightLimit);
    }

    public String getDescription() {
        return description.get();
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public String getReqEquipment() {
        return reqEquipment.get();
    }

    public StringProperty reqEquipmentProperty() {
        return reqEquipment;
    }

    public void setReqEquipment(String reqEquipment) {
        this.reqEquipment.set(reqEquipment);
    }

    public double getDuration() {
        return duration.get();
    }

    public DoubleProperty durationProperty() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration.set(duration);
    }

    public double getStartTime() {
        return startTime.get();
    }

    public DoubleProperty startTimeProperty() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime.set(startTime);
    }

    public String getDate() {
        return date.get();
    }

    public StringProperty dateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date.set(date);
    }
    // endregion
}
