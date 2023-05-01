package composite;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Employee ivan = new Employee("Иван", 1);
        Employee petr = new Employee("Петр", 2);
        Employee boris = new Employee("Борис", 3);
        Employee ignat = new Employee("Игнат", 4);
        Employee dmitriy = new Employee("Дмитрий", 5);
        Employee oleg = new Employee("Олег", 6);
        Employee gennadiy = new Employee("Геннадий", 2);
        Employee viktor = new Employee("Виктор", 5);

        Department staffDept = new Department("Отдел кадров");
        staffDept.add(boris);
        staffDept.add(ignat);
        staffDept.add(dmitriy);

        Department socialDept = new Department("Отдел по социальной работе с персоналом");
        socialDept.add(gennadiy);
        socialDept.add(viktor);

        Department hrDept = new Department("Управление HR");
        hrDept.add(staffDept);
        hrDept.add(socialDept);

        // С Employee и Department в итоге работаем одинаково, хотя по структуре - это получается дерева, где
        // Employee - листья, а Department - ветки
        List<Worker> workers = List.of(ivan, petr, hrDept, oleg);

        workers.forEach(Worker::doWork);

    }

}
