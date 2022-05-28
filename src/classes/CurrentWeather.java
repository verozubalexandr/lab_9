package classes;

public class CurrentWeather {
    private String time;
    private float temperature;
    private float windspeed;
    private float winddirection;
    private int weathercode;

    public CurrentWeather() {
    }

    public CurrentWeather(String time, float temperature, float windspeed, float winddirection, int weathercode) {
        this.time = time;
        this.temperature = temperature;
        this.windspeed = windspeed;
        this.winddirection = winddirection;
        this.weathercode = weathercode;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(float windspeed) {
        this.windspeed = windspeed;
    }

    public float getWinddirection() {
        return winddirection;
    }

    public void setWinddirection(float winddirection) {
        this.winddirection = winddirection;
    }

    public int getWeathercode() {
        return weathercode;
    }

    public void setWeathercode(int weathercode) {
        this.weathercode = weathercode;
    }
}
