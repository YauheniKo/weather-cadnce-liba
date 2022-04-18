package byb.weather.cadence.liba.workflow.service;

import byb.weather.cadence.liba.activity.service.WeatherActivityService;
import com.uber.cadence.workflow.Workflow;

import java.io.Serializable;

public class WeatherWorkflowServiceImpl implements WeatherWorkflowService, Serializable {
    WeatherActivityService weatherActivity = null;

    public WeatherWorkflowServiceImpl() {
        this.weatherActivity = Workflow.newActivityStub(WeatherActivityService.class);
    }

    @Override
    public Long getWeatherByCity(String cityName, String url) {
        return weatherActivity.getWeatherByCity(cityName, url);
    }
}
