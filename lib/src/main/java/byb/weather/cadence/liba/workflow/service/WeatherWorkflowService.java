package byb.weather.cadence.liba.workflow.service;

import com.uber.cadence.workflow.WorkflowMethod;

public interface WeatherWorkflowService {
    String workflowTaskList = "WorkflowTaskList";

    @WorkflowMethod(executionStartToCloseTimeoutSeconds = 120, taskList = workflowTaskList)
    Long getWeatherByCity(String cityName, String url);

}