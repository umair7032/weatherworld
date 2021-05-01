package com.foot.weatherworld;

public class WeatherReportModel {
    private int id;
    private String weather_state_name;
    private String weather_state_abbr;
    private String wind_direction_compass;
    private String created;
    private String applicable_date;
    private float min_temp;
    private float max_temp;
    private float the_temp;
    private float wind_speed;
    private float wind_direction;
    private float air_pressure;
    private float humidity;
    private float visibility;
    private float predictability;

    public WeatherReportModel(int id, String weather_state_name, String weather_state_abbr, String wind_direction_compass, String created, String applicable_date, float min_temp, float max_temp, float the_temp, float wind_speed, float wind_direction, float air_pressure, float humidity, float visibility, float predictability) {
        this.id = id;
        this.weather_state_name = weather_state_name;
        this.weather_state_abbr = weather_state_abbr;
        this.wind_direction_compass = wind_direction_compass;
        this.created = created;
        this.applicable_date = applicable_date;
        this.min_temp = min_temp;
        this.max_temp = max_temp;
        this.the_temp = the_temp;
        this.wind_speed = wind_speed;
        this.wind_direction = wind_direction;
        this.air_pressure = air_pressure;
        this.humidity = humidity;
        this.visibility = visibility;
        this.predictability = predictability;
    }

    public WeatherReportModel() {
    }

    @Override
    public String toString() {
        return "weather_state_name:" + weather_state_name +
                "Date:"+ applicable_date +
                ", min_temp=" + min_temp +
                ", max_temp=" + max_temp ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeather_state_name(String weather_state_name) {
        return this.weather_state_name;
    }

    public void setWeather_state_name(String weather_state_name) {
        this.weather_state_name = weather_state_name;
    }

    public String getWeather_state_abbr(String weather_state_abbr) {
        return this.weather_state_abbr;
    }

    public void setWeather_state_abbr(String weather_state_abbr) {
        this.weather_state_abbr = weather_state_abbr;
    }

    public String getWind_direction_compass(String wind_direction_compass) {
        return this.wind_direction_compass;
    }

    public void setWind_direction_compass(String wind_direction_compass) {
        this.wind_direction_compass = wind_direction_compass;
    }

    public String getCreated(String created) {
        return this.created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getApplicable_date(String applicable_date) {
        return this.applicable_date;
    }

    public void setApplicable_date(String applicable_date) {
        this.applicable_date = applicable_date;
    }

    public float getMin_temp(long min_temp) {
        return this.min_temp;
    }

    public void setMin_temp(float min_temp) {
        this.min_temp = min_temp;
    }

    public float getMax_temp(long max_temp) {
        return this.max_temp;
    }

    public void setMax_temp(float max_temp) {
        this.max_temp = max_temp;
    }

    public float getThe_temp() {
        return the_temp;
    }

    public void setThe_temp(float the_temp) {
        this.the_temp = the_temp;
    }

    public float getWind_speed(long wind_speed) {
        return this.wind_speed;
    }

    public void setWind_speed(float wind_speed) {
        this.wind_speed = wind_speed;
    }

    public float getWind_direction(long wind_direction) {
        return this.wind_direction;
    }

    public void setWind_direction(float wind_direction) {
        this.wind_direction = wind_direction;
    }

    public float getAir_pressure(long air_pressure) {
        return this.air_pressure;
    }

    public void setAir_pressure(float air_pressure) {
        this.air_pressure = air_pressure;
    }

    public float getHumidity(long humidity) {
        return this.humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getVisibility() {
        return visibility;
    }

    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }

    public float getPredictability() {
        return predictability;
    }

    public void setPredictability(float predictability) {
        this.predictability = predictability;
    }
}
