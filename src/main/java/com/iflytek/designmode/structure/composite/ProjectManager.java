package com.iflytek.designmode.structure.composite;

import java.util.ArrayList;

/**
 * @author cool
 * @version V1.0
 * @className ProjectManager
 * @description Code Is Poetry.
 * @createDate 2018年10月10日
 */
public class ProjectManager extends Employee {
    private String name;

    public ProjectManager(String name) {
        this.name = name;
        this.employeeList = new ArrayList<Employee>();
    }

    @Override
    public void add(Employee employee) {
        this.employeeList.add(employee);
    }

    @Override
    public void delete(Employee employee) {
        this.employeeList.remove(employee);
    }

    @Override
    public void report() {
        System.out.println(this.name + "汇报项目组员工的任务进度");
        for (Employee employee : employeeList) {
            employee.report();
        }
    }
}
