public class Report {
    static void generateReport(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-15s %-10.2f%n", employees[i].fullname, employees[i].salary);
        }
    }
}
