import java.util.Objects;

public class Employee {

   public String fullName;
   public int department;
   public int salary;
   public int id;
   public static int employeeCounter = 1;

   public Employee(String fullName, int department, int salary) {

      this.fullName = fullName;
      this.department = department;
      this.salary = salary;
      this.id = employeeCounter++;
   }

   public String getFullName() {
      return fullName;
   }

   public int getDepartment() {
      return department;
   }

   public int getSalary() {
      return salary;
   }

   public int getId() {
      return id;
   }

   public int getEmployeeCounter() {
      return employeeCounter;
   }

   public void setDepartment(int department) {
      this.department = department;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public String toString() {
      return "# " + id + " " + fullName + " Отдел #" + department + " Оклад: " + salary;
   }

   public String toStringDep() {
      return "# " + id + " " + fullName + " Оклад: " + salary;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Employee employee = (Employee) o;
      return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
   }

   @Override
   public int hashCode() {
      return Objects.hash(fullName, department, salary, id);
   }

   public void indexSalary(int percent) {
      salary+=salary *  percent / 100;
   }
}
