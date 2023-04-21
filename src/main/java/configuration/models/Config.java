package configuration.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
public class Config {
    private String defaultEnvironment;
    Map<String, Environment> environments = new LinkedHashMap<>();
    private Browser browser;


    @JsonAnySetter
    public void setEnvironments(String key, Environment value) {
        environments.put(key, value);
    }

    @JsonAnyGetter
    public List<Environment> getEnvironments() {
        return environments.values().stream().toList();
    }
}
