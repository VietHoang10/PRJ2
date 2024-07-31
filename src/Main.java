import Function.Company;

import Obj.FullTimeEmployee;
import Obj.PartTimeEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<FullTimeEmployee> listemployeefull = new ArrayList<>();
        List<PartTimeEmployee> listemployeepart = new ArrayList<>();
        while (true) {

            System.out.println("TOOL OF EMPLOYEE");
            System.out.println("============================");
            System.out.println("1.EMPLOYEE FULLTIME");
            System.out.println("2.EMPLOYEE PARTTIME");
            System.out.println("3.Exit");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.println("EMPLOYEE FULLTIME");
                    System.out.println("====================================");
                    System.out.println("1.ADD a lot of employee full time");
                    System.out.println("2.List of employee full time");
                    System.out.println("3.ADD new employee full time");
                    System.out.println("4.Fix information of employee fulltime");
                    System.out.println("5. Delete employee");
                    int a = scanner.nextInt();

                    switch (a) {
                        case 1:
                            Company.addfulltime(listemployeefull);
                            break;
                        case 2:
                            Company.displayfull(listemployeefull);
                            break;
                        case 3:
                            Company.addnewfull(listemployeefull);
                            break;
                        case 4:
                            Company.fixfull(listemployeefull);
                            break;
                        case 5:
                            Company.deleteFull(listemployeefull);
                        default:
                            System.out.println("Please check again");
                    }
                    break;

                case 2:
                    System.out.println("EMPLOYEE PARTTIME");
                    System.out.println("=======================================");
                    System.out.println("1.ADD a lot of employee part time");
                    System.out.println("2.List of employee part time");
                    System.out.println("3.ADD new employee part time");
                    System.out.println("4.Fix information of employee parttime");
                    System.out.println("5.Delete employee");
                    int b = scanner.nextInt();
                    switch (b) {
                        case 1:
                            Company.addparttime(listemployeepart);
                            break;
                        case 2:
                            Company.displaypart(listemployeepart);
                            break;
                        case 3:
                            Company.addnewpart(listemployeepart);
                            break;
                        case 4:
                            Company.fixpart(listemployeepart);
                            break;
                        case 5:
                            Company.deletePart(listemployeepart);
                            break;
                        default:
                            System.out.println("Please check again");
                    }
                default:
                    System.out.println("Please check again");
            }
            if (n == 3) break;
        }
    }
}