package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import deserializers.CaseDeserializers;
import deserializers.EmployeeDeserializers;
import serializer.CaseSerializer;
import serializer.EmployeeSerializer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Case caseOne = new Case("Годовой отчет",
                "Составить годовой отчет за 23 год",
                "отчет должен быть на 30 страниц");
        Case caseTwo = new Case("Магазин", "Зайти в магазин за продуктами", "Нужно взять молока и селедку");


        Employee hr = new Employee("Марина", 10000, "HR", List.of(caseOne));
        Employee manager = new Employee("Вася", 50000, "Manager", List.of(caseTwo));

        Company company = new Company(List.of(hr, manager));

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Employee.class, new EmployeeSerializer())
                .registerTypeAdapter(Case.class, new CaseSerializer())
                .registerTypeAdapter(Case.class, new CaseDeserializers())
                .registerTypeAdapter(Employee.class, new EmployeeDeserializers())
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(company);
        System.out.println(json);

        Company newCompany = gson.fromJson(json, Company.class);
        System.out.println(newCompany);
    }
}
