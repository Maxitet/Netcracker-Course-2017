public class Demo {
    public static void main(String args[]) {
        Employee employee = new Employee(1,"Ioann", "Lem", 12000);

        System.out.println(employee.getID());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());

        System.out.println(employee.getAnnualSalary());

        employee.setSalary(20000);
        System.out.println(employee.getSalary());

        employee.raiseSalary(40);
        System.out.println(employee.getSalary());

        System.out.println(employee);
    }
}
