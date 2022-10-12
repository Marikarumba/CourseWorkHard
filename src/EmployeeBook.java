

public class EmployeeBook {

    private Employee[] eList = new Employee[10];

    public  boolean addPerson(String fullName, int department, int salary){

        for (int i = 0; i < eList.length; i++) {
           if (eList[i]==null){
               eList[i]=new Employee(fullName,  department,  salary) ;
               return true;
           }
        }
        return false;
    }

    public  boolean deletePerson(String fullName){
        for (int i = 0; i < eList.length; i++) {
            if (eList[i]!=null){
                if (eList[i].fullName.equals(fullName)){
                    eList[i]=null;
                    return true;
                }
            }
        }
        return false;
    }

    public  boolean deletePerson(int id){
        for (int i = 0; i < eList.length; i++) {
            if (eList[i]!=null){
                if (eList[i].getId()==id){
                    eList[i]=null;
                    return true;
                }
            }
        }
        return false;
    }

    public  boolean setSalaryPerson(String fullName, int salary){
        for (int i = 0; i < eList.length; i++) {
            if (eList[i]!=null){
                if (eList[i].fullName.equals(fullName)){
                    eList[i].setSalary(salary);
                    return true;
                }
            }
        }
        return false;
    }

    public  boolean setDepPerson(String fullName, int dep){
        for (int i = 0; i < eList.length; i++) {
            if (eList[i]!=null){
                if (eList[i].fullName.equals(fullName)){
                    eList[i].setDepartment(dep);
                    return true;
                }
            }
        }
        return false;
    }




    public  void printEmployerList () {

        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                System.out.println(eList[i].toString());
            }
        }
    }

    public  void printDepEmployerList () {
        for (int i=1; i<6;i++){
            System.out.println("Отдел "+i);
            printEmployerList ( i);
        }

    }

    public void printEmployerList ( int dep) {

        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if ( eList[i].getDepartment() == dep)
                    System.out.println(eList[i].toStringDep());
            }
        }
    }

    public int getSumSalary () {

        int salarySum = 0;

        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                salarySum += eList[i].getSalary();
            }
        }
        return salarySum;

    }
    public int getSumSalary ( int dep) {

        int salarySum = 0;

        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if (eList[i].getDepartment() == dep) {
                    salarySum += eList[i].getSalary();
                }
            }
        }
        return salarySum;

    }

    public Employee getMinSalary () {

        int min = Integer.MAX_VALUE;
        Employee minPerson=eList[0];

        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if (eList[i].getSalary() < min) {
                    min = eList[i].getSalary();
                    minPerson = eList[i];
                }
            }
        }
        return minPerson;
    }

    public Employee getMinSalary ( int dep) {

        int min = Integer.MAX_VALUE;
        Employee minPerson=eList[0];

        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if (eList[i].getDepartment() == dep) {
                    if (eList[i].getSalary() < min) {
                        min = eList[i].getSalary();
                        minPerson = eList[i];
                    }
                }
            }
        }
        return minPerson;
    }

    public Employee getMaxSalary () {

        int max = 0;
        Employee maxPerson=eList[0];
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if (eList[i].getSalary() > max) {
                    max = eList[i].getSalary();
                    maxPerson = eList[i];
                }
            }
        }
        return maxPerson;
    }

    public Employee getMaxSalary ( int dep) {

        int max = 0;
        Employee maxPerson=eList[0];
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if (eList[i].getDepartment() == dep) {
                    if (eList[i].getSalary() > max) {
                        max = eList[i].getSalary();
                        maxPerson = eList[i];
                    }
                }
            }
        }
        return maxPerson;
    }

    public int middleSalary () {
        int numberOfEmployers = 0;
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                numberOfEmployers++;
            }
        }
        if (numberOfEmployers == 0)
            return 0;
        return getSumSalary()/numberOfEmployers;
    }

    public int middleSalary ( int dep) {
        int numberOfEmployers = 0;
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if (eList[i].getDepartment() == dep) {
                    numberOfEmployers++;
                }
            }
        }
        if (numberOfEmployers == 0)
            return 0;
        return getSumSalary( dep)/numberOfEmployers;
    }

    public void printFullName () {

        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                System.out.println(eList[i].getFullName());
            }
        }
    }
   

    public void indexSalaryList ( int percent) {
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                eList[i].indexSalary(percent);
            }
        }
    }

    public void indexSalaryList ( int percent, int dep) {
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if (eList[i].getDepartment() == dep) {
                    eList[i].indexSalary(percent);
                }
            }
        }
    }

    public void findLessSalary ( int salaryRate) {
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if ( eList[i].getSalary() < salaryRate)
                    System.out.println(eList[i].toStringDep());
            }
        }
    }
    public void findMoreSalary ( int salaryRate) {
        for (int i = 0; i < eList.length; i++) {
            if (eList[i] != null) {
                if ( eList[i].getSalary() >= salaryRate)
                    System.out.println(eList[i].toStringDep());
            }
        }
    }



}
