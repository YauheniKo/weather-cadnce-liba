package byb.weather.cadence.liba.activity.service;

import com.uber.cadence.activity.ActivityMethod;

import java.io.Serializable;

public interface WeatherActivityService extends Serializable {
    String activityTaskList = "ActivityTaskList";

    @ActivityMethod(scheduleToCloseTimeoutSeconds = 60, taskList = activityTaskList)
    Long getWeatherByCity(String cityName, String url);

}
