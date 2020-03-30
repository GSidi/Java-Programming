
package payrollsystemtest;


public class PayrollSystemTest {

 
    public static void main(String[] args) {
      
        SalariedEmployee salariedEmployee = new SalariedEmployee("Giwrgos","Sidiropoulos", "198-92-0034", 1000.00);
        HourlyEmployee hourlyemployee = new HourlyEmployee("Mixahl", "Karagwgow", "198-94-0057", 25.90, 35);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Paulos", "Kwnstantinidhw", "123-14-5670", 10000, .04);
        BasePlusCommissionEmployee basePlusCommissionEmploye = new BasePlusCommissionEmployee("Marios", "Zourtoumidhs", "023-11-1956", 3000, .07, 300);
        
        System.out.println("Employees processed individually:");
        
        System.out.printf("%n%s%n%s : $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s : $%,.2f%n%n", hourlyemployee, "earned", hourlyemployee.earnings());
        System.out.printf("%s%n%s : $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s : $%,.2f%n%n", basePlusCommissionEmploye, "earned", basePlusCommissionEmploye.earnings());
        
        Employee[] employees = new Employee[4];
        
        employees[0] = salariedEmployee;
        employees[1] = hourlyemployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmploye;
        
        System.out.printf("Employees processed polymorphically:%n%n");
        
        for(Employee currentEmployee: employees){
        
            System.out.println(currentEmployee);
            
            if currentEmployee instanceof BasePlusCommissionEmployee(){
                
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                
                employee.setBasicSalary(1.10 * employee.getBaseSalary());
                
                System.out.printf("new base salary with 100% increase is: $%, .2f%n", employee.getBaseSalary());
                
            }
            
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
            
        }
        
        for(int j=0 ; j < employees.length; j++){
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
        }
        
    }
    
}
