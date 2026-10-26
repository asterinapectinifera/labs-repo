
void main() {
    System.out.println("Введите номер задания 1-4: ");
    Scanner in =new Scanner(System.in);
    int num=in.nextInt();
    in.nextLine();
    switch (num){
        case 1:
            System.out.println("Введите строку содержащую буквы в верхнем регистре: ");
            String str=in.nextLine().toLowerCase();
            System.out.println(str);
            break;
        case 2:
            System.out.println("Введите строку: ");
            String str1=in.nextLine();
            StringBuilder str2=new StringBuilder(str1).reverse();
            System.out.println(str2);
            break;
        case 3:
            Employee[] employees = {
                    new Employee("Ivanov", 50000),
                    new Employee("Petrov", 75000.5),
                    new Employee("Sidorov", 62000.75)
            };
            Report.generateReport(employees);

            break;
        case 4:
            String text = "aAXa aeffa aGha aza ax23a a3sSa";
            String regex = "\\ba[A-Za-z]+a\\b";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                System.out.print(matcher.group() + " ");
                }
            break;
        default:
            System.out.println("Введите корректное значение");
    }


}
