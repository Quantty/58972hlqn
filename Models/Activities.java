package sample.Models;

import java.time.LocalDate;

/**
 * Created by narto_000 on 9/19/2017.
 */
public class Activities {

    private String name;
    private int ageLimit;
    private double heightLimit;
    private String description;
    private String reqEquipment;
    private double duration;
    private double startTime;
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

}
