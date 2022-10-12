import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employerList = new EmployeeBook() ;

        employerList.addPerson( "Иванов0 И.И.", 1, 10_000);
        employerList.addPerson( "Иванов1 И.И.", 1, 20_000);
        employerList.addPerson( "Иванов2 И.И.", 2, 30_000);
        employerList.addPerson( "Иванов4 И.И.", 3, 50_000);
        employerList.addPerson( "Иванов5 И.И.", 3, 60_000);
        employerList.addPerson( "Иванов6 И.И.", 4, 70_000);
        employerList.addPerson( "Иванов7 И.И.", 4, 80_000);
        employerList.addPerson( "Иванов8 И.И.", 5, 90_000);
        employerList.addPerson( "Иванов9 И.И.", 5, 100_000);

        employerList.printEmployerList();
        out.println("Сумма зарплат: " + employerList.getSumSalary());
        out.println("Минимальный оклад у сотрудника: " + employerList.getMinSalary().toString());
        out.println("Максимальный оклад у сотрудника: " + employerList.getMaxSalary().toString());
        out.println("Средний оклад: "+employerList.middleSalary());
        employerList.printFullName();
        out.println("Средняя сложность");
        employerList.indexSalaryList( 50);
        employerList.printEmployerList();
        employerList.printEmployerList( 4);
        out.println("Минимальный оклад у сотрудника отдела № 4: " + employerList.getMinSalary( 4).toString());
        out.println("Максимальный оклад у сотрудника отдела № 4: " + employerList.getMaxSalary(4).toString());
        out.println("Сумма зарплат отдела 3: " + employerList.getSumSalary( 3));
        out.println("Средний оклад по отделу 4: "+employerList.middleSalary(4));
        employerList.indexSalaryList(100, 1);
        employerList.printEmployerList( 1);
        employerList.findLessSalary(100_000);
        out.println( );
        employerList.findMoreSalary(100_000);
        out.println("Удаление сотрудника №6" );
        employerList.deletePerson("Иванов6 И.И.");
        employerList.printEmployerList();
        out.println("Добавление нового сотрудника" );
        employerList.addPerson( "Иванов99 И.И.", 5, 100_000);
        employerList.printEmployerList();
        out.println("Изменение оклада" );
        employerList.setSalaryPerson("Иванов99 И.И.", 50_000);
        out.println("Изменение департамента" );
        employerList.setDepPerson ("Иванов99 И.И.", 3);
        employerList.printEmployerList();
        out.println("Печать по отделам" );
        employerList.printDepEmployerList ();
    }
}