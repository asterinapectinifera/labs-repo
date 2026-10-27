package org.example;

public class Employee {

    private String name;
    private String position;
    private double salary;
    private String department;

    public Employee(String name, String position, double salary, String department)
            throws DepartmentNotFoundException {
        setName(name);
        setPosition(position);
        setSalary(salary);
        setDepartment(department);
    }

    public String getName()       { return name; }
    public String getPosition()   { return position; }
    public double getSalary()     { return salary; }
    public String getDepartment() { return department; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidSalaryException("Имя не может быть пустым");
        }
        this.name = name.trim();
    }

    public void setPosition(String position) {
        if (position == null || position.trim().isEmpty()) {
            throw new InvalidSalaryException("Должность не может быть пустой");
        }
        this.position = position.trim();
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new InvalidSalaryException(
                    "Зарплата должна быть больше 0, получено: " + salary);
        }
        this.salary = salary;
    }

    public void setDepartment(String department) throws DepartmentNotFoundException {
        if (department == null || department.trim().isEmpty()) {
            throw new DepartmentNotFoundException("Отдел не найден: " + department);
        }
        this.department = department.trim();
    }

    public void promote(String newPosition, double newSalary) throws PromotionException {
        if (newPosition == null || newPosition.trim().isEmpty()) {
            throw new PromotionException("Новая должность не может быть пустой");
        }
        if (newSalary <= salary) {
            throw new PromotionException(
                    "При повышении зарплата должна вырасти: было " + salary
                            + ", запрошено " + newSalary);
        }
        this.position = newPosition.trim();
        this.salary = newSalary;
    }

    public void changeDepartment(String newDept) throws DepartmentNotFoundException {
        setDepartment(newDept);
    }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', position='%s', salary=%.2f, department='%s'}",
                name, position, salary, department);
    }
}