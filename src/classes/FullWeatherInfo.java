package classes;

import java.util.Comparator;

public class FullWeatherInfo {
    private float elevation;
    private CurrentWeather current_weather;
    private float latitude;
    private float generationtime_ms;
    private float utc_offset_seconds;
    private float longitude;

    public FullWeatherInfo() {
    }

    public FullWeatherInfo(float elevation, CurrentWeather current_weather, float latitude, float generationtime_ms, float utc_offset_seconds, float longitude) {
        this.elevation = elevation;
        this.current_weather = current_weather;
        this.latitude = latitude;
        this.generationtime_ms = generationtime_ms;
        this.utc_offset_seconds = utc_offset_seconds;
        this.longitude = longitude;
    }

    public float getElevation() {
        return elevation;
    }

    public void setElevation(float elevation) {
        this.elevation = elevation;
    }

    public CurrentWeather getCurrent_weather() {
        return current_weather;
    }

    public void setCurrent_weather(CurrentWeather current_weather) {
        this.current_weather = current_weather;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getGenerationtime_ms() {
        return generationtime_ms;
    }

    public void setGenerationtime_ms(float generationtime_ms) {
        this.generationtime_ms = generationtime_ms;
    }

    public float getUtc_offset_seconds() {
        return utc_offset_seconds;
    }

    public void setUtc_offset_seconds(float utc_offset_seconds) {
        this.utc_offset_seconds = utc_offset_seconds;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public static Comparator<FullWeatherInfo> byTemperature = (t1, t2) -> Float.compare(t1.getCurrent_weather().getTemperature(),
            t2.getCurrent_weather().getTemperature());
    public static Comparator<FullWeatherInfo> byWindSpeed = (s1, s2) -> Float.compare(s1.getCurrent_weather().getWindspeed(),
            s2.getCurrent_weather().getWindspeed());
    public static Comparator<FullWeatherInfo> byElevation = (h1, h2) -> Float.compare(h1.getElevation(), h2.getElevation());

    @Override
    public String toString() {
        return "full info: "
                + "\n\n" +
                "latitude -> "       + this.getLatitude()
                + "\n" +
                "longitude -> "      + this.getLongitude()
                + "\n" +
                "elevation -> "      + this.getElevation()
                + "\n" +
                "time -> "           + current_weather.getTime()
                + "\n" +
                "temperature -> "    + current_weather.getTemperature()
                + "\n" +
                "wind speed -> "     + current_weather.getWindspeed()
                + "\n" +
                "wind direction -> " + current_weather.getWinddirection()
                + "\n" +
                "weather code -> "   + current_weather.getWeathercode()
                + "\n";
    }
}
