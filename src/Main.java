public class Main {

    static int idEmployer = 1;  // id для назначения новому сотруднику
    // (id-1) = списочному количеству сотрудников
    static Employee[] employeeArray = new Employee[10];

    public static void main(String[] args) {
        System.out.println("Курсовая работа 1. Техническое задание");
        System.out.println();
        System.out.println("       Уровни 1-2. Базовая сложность, повышенная сложность");
        System.out.println();

        System.out.println("                1.");
        System.out.println();

        String employeeName1 = "Иван";
        String employeeName2 = "Мария";
        String employeeName3 = "Петр";
        String employeeName4 = "Василий";
        String employeeName5 = "Анна";

        String employeeName6 = "Сидор";
        String employeeName7 = "Виктор";
        String employeeName8 = "Роман";
        String employeeName9 = "Кирилл";
        String employeeName10 = "Ольга";

        String employeeMiddleName1 = "Иванович";
        String employeeMiddleName2 = "Семёновна";
        String employeeMiddleName3 = "Петрович";
        String employeeMiddleName4 = "Васильевич";
        String employeeMiddleName5 = "Николаевна";

        String employeeMiddleName6 = "Фёдорович";
        String employeeMiddleName7 = "Сергеевич";
        String employeeMiddleName8 = "Миронович";
        String employeeMiddleName9 = "Евгеньевич";
        String employeeMiddleName10 = "Георгиевна";

        String employeeLastName1 = "Иванов";
        String employeeLastName2 = "Сидорова";
        String employeeLastName3 = "Тихонов";
        String employeeLastName4 = "Павлов";
        String employeeLastName5 = "Кузнецова";

        String employeeLastName6 = "Топорков";
        String employeeLastName7 = "Седов";
        String employeeLastName8 = "Ветров";
        String employeeLastName9 = "Синцов";
        String employeeLastName10 = "Кедрова";

        char deptName1 = '1';
        char deptName2 = '2';
        char deptName3 = '3';
        char deptName4 = '4';
        char deptName5 = '5';

        char deptName6 = '1';
        char deptName7 = '2';
        char deptName8 = '3';
        char deptName9 = '4';
        char deptName10 = '5';

        int employeeSalary1 = 100000;
        int employeeSalary2 = 72000;
        int employeeSalary3 = 110000;
        int employeeSalary4 = 90000;
        int employeeSalary5 = 100000;

        int employeeSalary6 = 80000;
        int employeeSalary7 = 72000;
        int employeeSalary8 = 60000;
        int employeeSalary9 = 90000;
        int employeeSalary10 = 58000;
//                                                          1.
        // Проверка до заполнения списка:
        printEmployeeListAndData(idEmployer);               // 1-1 - Вывод всех данных о сотрудниках
        System.out.println();
        calculateAndPrintMonthSalary(idEmployer);           // 1-2 - Вывод суммы зарплаты всех сотрудников за месяц
        System.out.println();
        findAndPrintMinSalaryEmployee(idEmployer);          // 1-3 - Вывод данных о сотруднике с минимальной зарплатой
        System.out.println();
        findAndPrintMaxSalaryEmployee(idEmployer);          // 1-4 - Вывод данных о сотруднике с максимальной зарплатой
        System.out.println();
        calculateAndPrintAverageMonthSalary(idEmployer);    // 1-5 - Вывод средней величины суммы зарплаты всех сотрудников за месяц
        System.out.println();
        printEmployeeList(idEmployer);                      // 1-6 - Вывод списочного состава сотрудников (ФИО)
        System.out.println();
        // Списочный состав частично заполнен:
        employeeArray[0] = new Employee(employeeName1, employeeMiddleName1, employeeLastName1, deptName1, employeeSalary1, idEmployer);
        employeeArray[1] = new Employee(employeeName2, employeeMiddleName2, employeeLastName2, deptName2, employeeSalary2, idEmployer);
        employeeArray[2] = new Employee(employeeName3, employeeMiddleName3, employeeLastName3, deptName3, employeeSalary3, idEmployer);
        employeeArray[3] = new Employee(employeeName4, employeeMiddleName4, employeeLastName4, deptName4, employeeSalary4, idEmployer);
        employeeArray[4] = new Employee(employeeName5, employeeMiddleName5, employeeLastName5, deptName5, employeeSalary5, idEmployer);

        printEmployeeListAndData(idEmployer);               // 1-1-2 - Вывод всех данных о сотрудниках
        System.out.println();
        calculateAndPrintMonthSalary(idEmployer);           // 1-2-2 - Вывод суммы зарплаты всех сотрудников за месяц
        System.out.println();
        findAndPrintMinSalaryEmployee(idEmployer);          // 1-3-2 - Вывод данных о сотруднике с минимальной зарплатой
        System.out.println();
        findAndPrintMaxSalaryEmployee(idEmployer);          // 1-4-2 - Вывод данных о сотруднике с максимальной зарплатой
        System.out.println();
        calculateAndPrintAverageMonthSalary(idEmployer);    // 1-5-2 - Вывод средней величины суммы зарплаты всех сотрудников за месяц
        System.out.println();
        printEmployeeList(idEmployer);                      // 1-6-2 - Вывод списочного состава сотрудников (ФИО)
        System.out.println();
//                                                          2.
        System.out.println("                2.");
        System.out.println();
        indexingSalary(10, idEmployer);                 // 2-7-1 - Индексация з/п сотрудников на 10%
        System.out.println();
        printEmployeeListAndData(idEmployer);               // 2-1-3 - Вывод всех данных о сотрудниках с индексированной з/п
        System.out.println();
        // Дополнение списочного состава сотрудников
        System.out.println("                Состав сотрудников дополнен:");
        System.out.println();
        employeeArray[5] = new Employee(employeeName6, employeeMiddleName6, employeeLastName6, deptName6, employeeSalary6, idEmployer);
        employeeArray[6] = new Employee(employeeName7, employeeMiddleName7, employeeLastName7, deptName7, employeeSalary7, idEmployer);
        employeeArray[7] = new Employee(employeeName8, employeeMiddleName8, employeeLastName8, deptName8, employeeSalary8, idEmployer);
        employeeArray[8] = new Employee(employeeName9, employeeMiddleName9, employeeLastName9, deptName9, employeeSalary9, idEmployer);
        employeeArray[9] = new Employee(employeeName10, employeeMiddleName10, employeeLastName10, deptName10, employeeSalary10, idEmployer);

        printEmployeeListAndData(idEmployer);                   // 2-1-4 - Вывод всех данных о сотрудниках
        System.out.println();
        calculateAndPrintMonthSalary(idEmployer);               // 2-2-2 - Вывод суммы зарплаты всех сотрудников за месяц
        System.out.println();
        findAndPrintMinSalaryEmployee(idEmployer);              // 2-8-1 - Вывод данных о сотруднике с минимальной зарплатой
        System.out.println();
        findAndPrintMaxSalaryEmployee(idEmployer);              // 2-9-1 - Вывод данных о сотруднике с максимальной зарплатой
        System.out.println();
        calculateAndPrintAverageMonthSalary(idEmployer);        // 2-10-1 - Вывод средней величины суммы зарплаты всех сотрудников за месяц
        System.out.println();
        printEmployeeList(idEmployer);                          // 2-11-1 - Вывод списочного состава сотрудников (ФИО)
        System.out.println();

        indexingSalary(10, idEmployer);                        // 2-7-2 - Индексация з/п сотрудников на 10% (пример)
        System.out.println();
        printEmployeeListAndData(idEmployer);                      // 2-1-5 - Вывод всех данных о сотрудниках с новым значением з/п
        System.out.println();
        findAndPrintMinSalaryDeptEmployee('1', idEmployer);  // 2-12-1 - Вывод данных о сотруднике отдела 2 с минимальной з/п
        System.out.println();
        findAndPrintMinSalaryDeptEmployee('5', idEmployer);  // 2-12-2 - Вывод данных о сотруднике отдела 5 с минимальной з/п
        System.out.println();
        findAndPrintMinSalaryDeptEmployee('8', idEmployer);  // 2-12-3 - Вывод данных о сотруднике отдела 8 (отсутствует) с минимальной з/п
        System.out.println();
        findAndPrintMaxSalaryDeptEmployee('3', idEmployer);  // 2-13-1 - Вывод данных о сотруднике отдела 2 с максимальной з/п
        System.out.println();
        findAndPrintMaxSalaryDeptEmployee('5', idEmployer);  // 2-13-2 - Вывод данных о сотруднике отдела 5 с максимальной з/п
        System.out.println();
        findAndPrintMaxSalaryDeptEmployee('7', idEmployer);  // 2-13-3 - Вывод данных по запросу о сотруднике отдела 10 (отсутствует) с максимальной з/п
        System.out.println();
        calculateAndPrintDeptMonthSalary('2', idEmployer);   // 2-14-1 - Вывод суммарной з/п отдела 2
        System.out.println();
        calculateAndPrintDeptMonthSalary('4', idEmployer);   // 2-14-2 - Вывод суммарной з/п отдела 4
        System.out.println();
        calculateAndPrintDeptMonthSalary('9', idEmployer);   // 2-14-3 - Вывод суммарной з/п отдела 9 (отсутствует)
        System.out.println();
        calculateAndPrintAverageDeptMonthSalary('1', idEmployer);   // 2-15-1 - Вывод средней з/п отдела 1
        System.out.println();
        calculateAndPrintAverageDeptMonthSalary('3', idEmployer);   // 2-15-2 - Вывод средней з/п отдела 3
        System.out.println();
        calculateAndPrintAverageDeptMonthSalary('6', idEmployer);   // 2-15-3 - Вывод средней з/п отдела 6 (отсутствует)
        System.out.println();
        indexingDeptSalary(5, '2', idEmployer);                     // 2-7-3 - Индексация з/п сотрудников отдела 2 на 5%
        System.out.println();
        printEmployeeListAndData(idEmployer);                                 // 2-1-6 - Вывод всех данных о сотрудниках с новым значением з/п
        System.out.println();
        indexingDeptSalary(12, '5', idEmployer);                    // 2-16-1 - Индексация з/п сотрудников отдела 5 на 12%
        System.out.println();
        printEmployeeListAndData(idEmployer);                                   // 2-1-7 - Вывод всех данных о сотрудниках с новым значением з/п
        System.out.println();
        printDeptEmployeeListAndData('3', idEmployer);                  // 2-17-1 - Вывод всех данных о сотрудниках отдела 3
        System.out.println();
        printDeptEmployeeListAndData('5', idEmployer);                    // 2-17-2 - Вывод всех данных о сотрудниках отдела 5
        System.out.println();
        printDeptEmployeeListAndData('6', idEmployer);                    // 2-17-3 - Вывод всех данных о сотрудниках отдела 6 (отсутствует)
        System.out.println();
        findAndPrintEmployeeWithSalaryMore(100000, idEmployer);     // 2-18-1 - Список сотрудников с з/п более или равной 100000 руб.
        System.out.println();
        findAndPrintEmployeeWithSalaryMore(70000, idEmployer);     // 2-18-2 - Список сотрудников с з/п более или равной 70000 руб.
        System.out.println();
        findAndPrintEmployeeWithSalaryMore(150000, idEmployer);     // 2-18-3 - Список сотрудников с з/п более или равной 150000 руб.
        System.out.println();
        findAndPrintEmployeeWithSalaryLess(120000, idEmployer);     // 24-19-1- Список сотрудников с з/п менее 100000 руб.
        System.out.println();
        findAndPrintEmployeeWithSalaryLess(80000, idEmployer);     // 2-19-2 - Список сотрудников с з/п менее 100000 руб.
        System.out.println();
        findAndPrintEmployeeWithSalaryLess(50000, idEmployer);     // 2-19-3 - Список сотрудников с з/п менее 50000 руб.
        System.out.println();

    }

    public static void printEmployeeListAndData(int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            for (int i = 0; i < idEmp - 1; i++) {
                System.out.println(employeeArray[i]);
            }
        }
    }

    public static void calculateAndPrintMonthSalary(int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i = 0;
            int sum = 0;
            for (Employee emp : employeeArray) {
                if (i++ < idEmp - 1) {
                    sum = sum + emp.getSalary();
                } else break;
            }
            System.out.printf("Суммарное значение заработной платы сотрудников за месяц = %.2f руб.", (double) sum);
            System.out.println();
        }
    }

    public static void findAndPrintMinSalaryEmployee(int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i;
            int j;
            int salary;
            for (i = j = 0, salary = employeeArray[i].getSalary(); i < idEmp - 2; i++) {
                if (salary > employeeArray[i + 1].getSalary()) {
                    salary = employeeArray[i + 1].getSalary();
                    j = i + 1;
                }
            }
            System.out.println("Сотрудник с минимальной з/п:\n" +
                    "номер: " + employeeArray[j].getId() +
                    ";\t имя: " + employeeArray[j].getName() +
                    ";\t отчеcтво: " + employeeArray[j].getMiddleName() +
                    ";\t фамилия: " + employeeArray[j].getLastName() +
                    ";\t отдел: " + employeeArray[j].getDepartmentName() +
                    ";\t з/п: " + employeeArray[j].getSalary() + " руб.");
        }
    }

    public static void findAndPrintMaxSalaryEmployee(int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i;
            int j;
            int salary;
            for (i = j = 0, salary = employeeArray[i].getSalary(); i < idEmp - 2; i++) {

                if (salary < employeeArray[i + 1].getSalary()) {
                    salary = employeeArray[i + 1].getSalary();
                    j = i + 1;
                }
            }
            System.out.println("Сотрудник с максимальной з/п:\n" +
                    "номер: " + employeeArray[j].getId() +
                    ";\t имя: " + employeeArray[j].getName() +
                    ";\t отчеcтво: " + employeeArray[j].getMiddleName() +
                    ";\t фамилия: " + employeeArray[j].getLastName() +
                    ";\t отдел: " + employeeArray[j].getDepartmentName() +
                    ";\t з/п: " + employeeArray[j].getSalary() + " руб.");
        }
    }

    public static void calculateAndPrintAverageMonthSalary(int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i = 0;
            int sum = 0;
            double sumAverage = 0;
            for (Employee emp : employeeArray) {
                if (i++ < idEmp - 1) {
                    sum = sum + emp.getSalary();
                } else break;
            }
            sumAverage = (double) sum / (idEmp - 1);
            System.out.printf("Среднее значение заработной платы сотрудников за месяц = %.2f руб.", sumAverage);
            System.out.println();
        }
    }

    public static void printEmployeeList(int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            for (int i = 0; i < idEmp - 1; i++) {
                System.out.println("ФИО: " + employeeArray[i].getName() +
                        " " + employeeArray[i].getMiddleName() +
                        " " + employeeArray[i].getLastName());
            }
        }
    }

    public static void indexingSalary(int prc, int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            for (int i = 0; i < idEmp - 1; i++) {
                employeeArray[i].setSalary(employeeArray[i].getSalary() * (100 + prc) / 100);
            }
            System.out.println("Выполнена индексация з/п сотрудников на " + prc + "%");
        }
    }

    public static void findAndPrintMinSalaryDeptEmployee(char idDept, int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i;
            int j = -1;
            int salary = 0;
            for (i = 0; i < idEmp - 1; i++) {

                if (employeeArray[i].getDepartmentName() == idDept) {
                    if (j < 0) {
                        salary = employeeArray[i].getSalary();
                        j = i;
                    } else if (salary > employeeArray[i].getSalary()) {
                        salary = employeeArray[i].getSalary();
                        j = i;
                    }
                }
            }
            if (j < 0) {
                System.out.println("Отдел " + idDept + " отсутствует");
            } else {
                System.out.println("Сотрудник отдела " + idDept + " с минимальной з/п:\n" +
                        "номер: " + employeeArray[j].getId() +
                        ";\t имя: " + employeeArray[j].getName() +
                        ";\t отчеcтво: " + employeeArray[j].getMiddleName() +
                        ";\t фамилия: " + employeeArray[j].getLastName() +
                        ";\t з/п: " + employeeArray[j].getSalary() + " руб.");
            }
        }
    }

    public static void findAndPrintMaxSalaryDeptEmployee(char idDept, int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i;
            int j = -1;
            int salary = 0;
            for (i = 0; i < idEmp - 1; i++) {
                if (employeeArray[i].getDepartmentName() == idDept) {
                    if (j < 0) {
                        salary = employeeArray[i].getSalary();
                        j = i;
                    } else if (salary < employeeArray[i].getSalary()) {
                        salary = employeeArray[i].getSalary();
                        j = i;
                    }
                }
            }
            if (j < 0) {
                System.out.println("Отдел " + idDept + " отсутствует");
            } else {
                System.out.println("Сотрудник отдела " + idDept + " с максимальной з/п:\n" +
                        "номер: " + employeeArray[j].getId() +
                        ";\t имя: " + employeeArray[j].getName() +
                        ";\t отчеcтво: " + employeeArray[j].getMiddleName() +
                        ";\t фамилия: " + employeeArray[j].getLastName() +
                        ";\t з/п: " + employeeArray[j].getSalary() + " руб.");
            }
        }
    }

    public static void calculateAndPrintDeptMonthSalary(char idDept, int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i = 0;
            int j = -1;
            int sum = 0;

            for (Employee emp : employeeArray) {
                if (emp.getDepartmentName() == idDept && i < idEmp) {
                    sum = sum + emp.getSalary();
                    j = i++;
                }
            }
            if (j < 0) {
                System.out.println("Отдел " + idDept + " отсутствует");
            } else {
                System.out.printf("Суммарное значение заработной платы сотрудников отдела %c за месяц = %.2f руб.", idDept, (double) sum);
                System.out.println();
            }
        }
    }

    public static void calculateAndPrintAverageDeptMonthSalary(char idDept, int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i = 0;
            int j = -1;
            int sum = 0;
            double sumAverage = 0;
            for (Employee emp : employeeArray) {
                if (emp.getDepartmentName() == idDept && i < idEmp) {
                    sum = sum + emp.getSalary();
                    j = i++;
                }
            }
            if (j < 0) {
                System.out.println("Отдел " + idDept + " отсутствует");
            } else {
                sumAverage = (double) sum / i;
                System.out.printf("Среднее значение заработной платы сотрудников отдела %c за месяц = %.2f руб.", idDept, sumAverage);
                System.out.println();
            }
        }
    }

    public static void indexingDeptSalary(int prc, char idDept, int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {

            for (int i = 0; i < idEmp - 1; i++) {
                if (employeeArray[i].getDepartmentName() == idDept) {
                    employeeArray[i].setSalary(employeeArray[i].getSalary() * (100 + prc) / 100);
                }
            }
            System.out.printf("Выполнена индексация з/п сотрудников отдела %c на %.2f процентов", idDept, (double) prc);
            System.out.println();
        }
    }

    public static void printDeptEmployeeListAndData(char idDept, int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int j = -1;
            System.out.println("Сотрудники отдела " + idDept + ":");

            for (int i = 0; i < idEmp - 1; i++) {

                if (employeeArray[i].getDepartmentName() == idDept) {
                    System.out.println("номер: " + employeeArray[i].getId() +
                            ";\t имя: " + employeeArray[i].getName() +
                            ";\t отчеcтво: " + employeeArray[i].getMiddleName() +
                            ";\t фамилия: " + employeeArray[i].getLastName() +
                            ";\t з/п: " + employeeArray[i].getSalary() + " руб.");
                    j = i;
                }
            }
            if (j < 0) {
                System.out.println("списочный состав отдела пуст");
            }
        }
    }

    public static void findAndPrintEmployeeWithSalaryMore(int boundaryValue, int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i;
            int j = -1;
            System.out.println("Сотрудники с з/п большей или равной " + boundaryValue + " руб.:");

            for (i = 0; i < idEmp - 1; i++) {

                if (employeeArray[i].getSalary() >= boundaryValue) {
                    System.out.println("номер: " + employeeArray[i].getId() +
                            ";\t имя: " + employeeArray[i].getName() +
                            ";\t отчеcтво: " + employeeArray[i].getMiddleName() +
                            ";\t фамилия: " + employeeArray[i].getLastName() +
                            ";\t отдел: " + employeeArray[i].getDepartmentName() +
                            ";\t з/п: " + employeeArray[i].getSalary() + " руб.");
                    j = i;
                }
            }
            if (j < 0) {
                System.out.println("таких нет");
            }
        }
    }

    public static void findAndPrintEmployeeWithSalaryLess(int boundaryValue, int idEmp) {
        if (idEmp == 1) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i;
            int j = -1;
            System.out.println("Сотрудники с з/п меньшей " + boundaryValue + " руб.:");
            for (i = 0; i < idEmp - 1; i++) {
                if (employeeArray[i].getSalary() < boundaryValue) {
                    System.out.println("номер: " + employeeArray[i].getId() +
                            ";\t имя: " + employeeArray[i].getName() +
                            ";\t отчеcтво: " + employeeArray[i].getMiddleName() +
                            ";\t фамилия: " + employeeArray[i].getLastName() +
                            ";\t отдел: " + employeeArray[i].getDepartmentName() +
                            ";\t з/п: " + employeeArray[i].getSalary() + " руб.");
                    j = i;
                }
            }
            if (j < 0) {
                System.out.println("таких нет");
            }
        }
    }
}