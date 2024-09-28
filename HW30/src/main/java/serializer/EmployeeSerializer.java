package serializer;

import com.google.gson.*;
import org.example.Employee;

import java.lang.reflect.Type;

public class EmployeeSerializer implements JsonSerializer<Employee> {

    @Override
    public JsonElement serialize(Employee employee, Type type, JsonSerializationContext context) {
        JsonObject emp = new JsonObject();
        emp.addProperty("name", employee.getEmployeeName());
        emp.addProperty("position", employee.getPosition());
        emp.add("cases", context.serialize(employee.getCases()));
        return emp;
    }
}
