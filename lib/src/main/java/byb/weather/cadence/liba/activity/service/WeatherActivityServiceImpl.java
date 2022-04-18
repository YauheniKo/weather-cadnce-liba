package byb.weather.cadence.liba.activity.service;


import byb.weather.cadence.liba.dto.WeatherMapDTO;

import org.springframework.web.client.RestTemplate;


public class WeatherActivityServiceImpl implements WeatherActivityService {
    @Override
    public Long getWeatherByCity(String cityName, String url) {
        RestTemplate restTemplate = new RestTemplate();
        WeatherMapDTO weatherMap = restTemplate.getForObject(url, WeatherMapDTO.class);
        return weatherMap.getMain().getTemp();
    }
}
