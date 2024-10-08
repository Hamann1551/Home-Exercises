package org.example;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    //@SerializedName("name")
    private String employeeName;
    /*transient*/ private int salary;
    private String position;
    private List<Case> cases;
}
