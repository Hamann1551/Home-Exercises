package serializer;

import com.google.gson.*;
import org.example.Case;

import java.lang.reflect.Type;

public class CaseSerializer implements JsonSerializer<Case> {

    @Override
    public JsonElement serialize(Case aCase, Type type, JsonSerializationContext context) {
        return  new JsonPrimitive(aCase.getCaseTitle() + ": " + aCase.getDescription());
    }
}
