package byb.weather.cadence.liba.activity.service;

import com.uber.cadence.activity.ActivityMethod;

public interface WeatherActivityService {
    String activityTaskList = "ActivityTaskList";

    @ActivityMethod(scheduleToCloseTimeoutSeconds = 60, taskList = activityTaskList)
    Long getWeatherByCity(String cityName, String url);

}
