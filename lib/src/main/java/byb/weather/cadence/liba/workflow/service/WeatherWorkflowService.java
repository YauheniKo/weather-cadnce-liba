package byb.weather.cadence.liba.workflow.service;

import com.uber.cadence.workflow.WorkflowMethod;

import java.io.Serializable;

public interface WeatherWorkflowService extends Serializable {
    String workflowTaskList = "WorkflowTaskList";

    @WorkflowMethod(executionStartToCloseTimeoutSeconds = 120, taskList = workflowTaskList)
    Long getWeatherByCity(String cityName, String url);

}