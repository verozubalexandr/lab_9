import classes.FullWeatherInfo;
import classes.FullWeatherInfoList;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        FullWeatherInfoList fullWeatherInfoList = new FullWeatherInfoList();
        ObjectMapper mapper = new ObjectMapper();

        //generate n(i < n) api url with random longitude & latitude
        for (byte i = 0; i < 5; i++) {
            fullWeatherInfoList.add(mapper.readValue(new URL("https://api.open-meteo.com/v1/forecast?latitude=" +
                            (50 + ((float) ((Math.random()) * 5))) +
                            "&longitude=" +
                            (35 + ((float) ((Math.random()) * 5))) +
                            "&current_weather=true"),
                    FullWeatherInfo.class));
        }

        System.out.println("\n**** before ****\n");
        printWeatherInfoList(fullWeatherInfoList);

        //sort by > temperature
        fullWeatherInfoList.getFullWeatherInfoList().sort(FullWeatherInfo.byTemperature);

        System.out.println("\n******* after(temp) *******\n");
        printWeatherInfoList(fullWeatherInfoList);

        //sort by > wind speed
        fullWeatherInfoList.getFullWeatherInfoList().sort(FullWeatherInfo.byWindSpeed);

        System.out.println("\n******* after(wind speed) *******\n");
        printWeatherInfoList(fullWeatherInfoList);

        //sort by > elevation
        fullWeatherInfoList.getFullWeatherInfoList().sort(FullWeatherInfo.byElevation);

        System.out.println("\n******* after(elevation) *******\n");
        printWeatherInfoList(fullWeatherInfoList);

        //search by weather code(id)
        System.out.println("\n******* search(by code) *******\n");
        printWeatherInfoList(fullWeatherInfoList.filterByCode(2));
    }

    private static void printWeatherInfoList(FullWeatherInfoList fullWeatherInfoList) {
        for (int i = 0; i < fullWeatherInfoList.getFullWeatherInfoList().size(); i++) {
            System.out.println(fullWeatherInfoList.getFullWeatherInfoFromList(i));
        }
    }
}