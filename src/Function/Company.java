package Function;


import Obj.FullTimeEmployee;
import Obj.PartTimeEmployee;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Company {
    public static void addfulltime(List<FullTimeEmployee> listemployeefull) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers of employee fulltime: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Input information of employee " + (i + 1));
            scanner.nextLine();
            System.out.println("Input the name of employee: ");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Input the id of employee: ");
            Integer id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input the salary of employee: ");
            Float salary = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Input the bonus of employee:");
            Float bonus = scanner.nextFloat();
            scanner.nextLine();
            listemployeefull.add(new FullTimeEmployee(name, id, salary, bonus));
        }
    }

    public static void addparttime(List<PartTimeEmployee> listemployeepart) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers of employee parttime: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Input information of employee " + (i + 1));
            scanner.nextLine();
            System.out.println("Input the name of employee: ");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Input the id of employee: ");
            Integer id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input the hours worked of employee:");
            Float hoursworked = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Input the hourly rate of employee:");
            Float hourlyrate = scanner.nextFloat();
            scanner.nextLine();
            listemployeepart.add(new PartTimeEmployee(name, id, hoursworked, hourlyrate));
        }
    }

    public static void displayfull(List<FullTimeEmployee> listemployeefull) {
        System.out.println("List of employee fulltime: ");
        System.out.println("-------------------------------------");
        for (FullTimeEmployee ds : listemployeefull) {
            System.out.println("1.Name: " + ds.getName());
            System.out.println("2.ID: " + ds.getId());
            System.out.println("3.Normal Salary:" + ds.getSalary());
            System.out.println("4.Bonus:" + ds.getBonus());
            ds.calculateSalary();
            System.out.println("-------------------------------------");

        }
    }

    public static void displaypart(List<PartTimeEmployee> listemployeepart) {
        System.out.println("List of employee parttime: ");
        System.out.println("-------------------------------------");
        for (PartTimeEmployee ds : listemployeepart) {
            System.out.println("1.Name: " + ds.getName());
            System.out.println("2.ID: " + ds.getId());
            System.out.println("3.Hours worked: " + ds.getHoursWorked());
            System.out.println("4.Hourly rate: " + ds.getHourlyRate());
            ds.calculateSalary();
            System.out.println("-------------------------------------");

        }
    }

    public static void addnewfull(List<FullTimeEmployee> listemployeefull) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add new employee fulltime:");
        System.out.println("Input the name of employee: ");
        String name = scan.nextLine();
        System.out.println("Input the id of employee: ");
        Integer id = scan.nextInt();
        scan.nextLine();
        System.out.println("Input the salary of employee: ");
        Float salary = scan.nextFloat();
        System.out.println("Input the bonus of employee: ");
        Float bonus = scan.nextFloat();
        listemployeefull.add(new FullTimeEmployee(name, id, salary, bonus));

    }

    public static void addnewpart(List<PartTimeEmployee> listemployeepart) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add new employee parttime:");
        System.out.println("Input the name of employee: ");
        String name = scan.nextLine();
        System.out.println("Input the id of employee: ");
        Integer id = scan.nextInt();
        scan.nextLine();
        System.out.println("Input the hours work of employee: ");
        Float hourswork = scan.nextFloat();
        System.out.println("Input the hourly rate of employee: ");
        Float hourlyrate = scan.nextFloat();
        listemployeepart.add(new PartTimeEmployee(name, id, hourswork, hourlyrate));

    }

    public static void fixfull(List<FullTimeEmployee> listemployeefull) {
        System.out.println("Input ID of employee need fix: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean isExistFullTimeEmployee = false;
        for (FullTimeEmployee fix : listemployeefull) {
            if (n == fix.getId()) {
                System.out.println("Information of employee you choose: ID: " + fix.getId() + ",Name: " + fix.getName() + ",Salary: " + fix.getSalary() + ",Bonus: " + fix.getBonus());
                System.out.println("Let fix information of employee: ");
                scan.nextLine();
                System.out.println("Fix the name:");
                String name = scan.nextLine();
                System.out.println("Fix the salary:");
                Float salary = scan.nextFloat();
                System.out.println("Fix the bonus:");
                Float bonus = scan.nextFloat();
                fix.setName(name);
                fix.setSalary(salary);
                fix.setBonus(bonus);

                isExistFullTimeEmployee = true;
            }
            if (!isExistFullTimeEmployee) System.out.println("ID not found.");

        }
    }

    public static void fixpart(List<PartTimeEmployee> listemployeepart) {
        System.out.println("Input ID of employee need fix: ");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        boolean isExistPartTimeEmployee = false;
        for (PartTimeEmployee fix : listemployeepart) {
            if (m == fix.getId()) {
                System.out.println("Information of employee you choose: ID: " + fix.getId() + ",Name: " + fix.getName() + ",Hours worked: " + fix.getHoursWorked() + ",Hourly rate: " + fix.getHourlyRate());
                System.out.println("Let fix information of employee: ");
                scan.nextLine();
                System.out.println("Fix the name:");
                String name = scan.nextLine();
                System.out.println("Fix the hours worked:");
                Float hourswork = scan.nextFloat();
                System.out.println("Fix the hourly rate:");
                Float hourlyrate = scan.nextFloat();
                fix.setName(name);
                fix.setHoursWorked(hourswork);
                fix.setHourlyRate(hourlyrate);

                isExistPartTimeEmployee = true;
            }
            if (!isExistPartTimeEmployee) System.out.println("ID not found.");

        }
    }

    public static void deleteFull(List<FullTimeEmployee> listemployeefull) {
        System.out.println("Input id of student need delete:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        boolean isExistFullTimeEmployee = false;
        Iterator<FullTimeEmployee> delete = listemployeefull.iterator();
        while (delete.hasNext()) {
            if (a == delete.next().getId()) {
                delete.remove();
            }
            isExistFullTimeEmployee = true;
        }
        if (!isExistFullTimeEmployee) System.out.println("ID not found.");
    }

    public static void deletePart(List<PartTimeEmployee> listemployeepart) {
        System.out.println("Input id of student need delete:");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        boolean isExistPartTimeEmployee = false;
        Iterator<PartTimeEmployee> delete = listemployeepart.iterator();
        while (delete.hasNext()) {
            if (b == delete.next().getId()) {
                delete.remove();
            }
            isExistPartTimeEmployee = true;
        }
        if (!isExistPartTimeEmployee) System.out.println("ID not found.");
    }


}

