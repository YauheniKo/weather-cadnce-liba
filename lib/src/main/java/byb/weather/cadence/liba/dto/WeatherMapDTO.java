package byb.weather.cadence.liba.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.time.ZonedDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherMapDTO implements Serializable {

    private WeatherMapMainDto main;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "EEE MMM dd HH:mm:ss Z yyyy")
    ZonedDateTime dt;

    public WeatherMapMainDto getMain() {
        return main;
    }

    public void setMain(WeatherMapMainDto main) {
        this.main = main;
    }

    public ZonedDateTime getDt() {
        return dt;
    }

    public void setDt(ZonedDateTime dt) {
        this.dt = dt;
    }
}
