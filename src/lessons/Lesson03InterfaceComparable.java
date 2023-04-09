package lessons;

import lessons_entities.lesson03.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson03InterfaceComparable {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vitor\\Desktop\\Projetos Java\\Interfaces\\src\\lessons_txt\\lesson03\\employees.csv"))) {
            List<Employee> employees = new ArrayList<>();

            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                String name = fields[0];
                Double salary = Double.parseDouble(fields[1]);
                employees.add(new Employee(name, salary));
                employeeCsv = br.readLine();
            }

            Collections.sort(employees);
            for (Employee employee : employees) {
                System.out.println(employee.getName() + ", " + employee.getSalary());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
