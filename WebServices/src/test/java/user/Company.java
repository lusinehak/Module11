package user;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private String name;
    private String catchPhrase;
    private String bs;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public void setBs(String bs) {
        this.bs = bs;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getBs() {
        return bs;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getName() {
        return name;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }
}
