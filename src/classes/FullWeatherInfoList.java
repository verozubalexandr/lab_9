package classes;

import java.util.ArrayList;
import java.util.List;

public class FullWeatherInfoList {
    private List<FullWeatherInfo> fullWeatherInfoList;

    public FullWeatherInfoList() {
        fullWeatherInfoList = new ArrayList<FullWeatherInfo>();
    }

    public boolean add(FullWeatherInfo fullWeatherInfo) {
        return fullWeatherInfoList.add(fullWeatherInfo);
    }

    public FullWeatherInfo getFullWeatherInfoFromList(int index) {
        return fullWeatherInfoList.get(index);
    }

    public List<FullWeatherInfo> getFullWeatherInfoList() {
        return fullWeatherInfoList;
    }

    public FullWeatherInfoList filterByCode(int code) {
        FullWeatherInfoList tempByCode = new FullWeatherInfoList();
        for (FullWeatherInfo weatherInfo : this.getFullWeatherInfoList()) {
            if ((weatherInfo.getCurrent_weather().getWeathercode() + "").contains(code + "")) {
                tempByCode.add(weatherInfo);
            }
        }
        return tempByCode;
    }
}


