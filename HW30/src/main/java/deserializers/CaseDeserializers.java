package deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import org.example.Case;

import java.lang.reflect.Type;

public class CaseDeserializers implements JsonDeserializer<Case> {
    @Override
    public Case deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        Case newCase = new Case();
        String data = jsonElement.getAsString();
        String caseTitle = data.substring(0, data.indexOf(":"));
        String description = data.substring(data.indexOf(":"));
        newCase.setCaseTitle(caseTitle);
        newCase.setDescription(description);
        return newCase;
    }
}
