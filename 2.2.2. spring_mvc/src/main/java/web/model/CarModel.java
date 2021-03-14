package web.model;

import java.util.ArrayList;
import java.util.List;

public class CarModel {
    private int id;
    private String modelName;
    private int modelSeries;
    private int modelYear;

    public CarModel(int id, String modelName, int modelSeries, int modelYear){
        this.id = id;
        this.modelName = modelName;
        this.modelSeries = modelSeries;
        this.modelYear = modelYear;
    }

    public CarModel(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelSeries() {
        return modelSeries;
    }

    public void setModelSeries(int modelSeries) {
        this.modelSeries = modelSeries;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", modelSeries=" + modelSeries +
                ", modelYear=" + modelYear +
                '}';
    }
}
