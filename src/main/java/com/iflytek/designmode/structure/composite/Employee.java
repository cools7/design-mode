package com.iflytek.designmode.structure.composite;

import java.util.List;

/**
 * @author cool
 * @version V1.0
 * @className Employee
 * @description Code Is Poetry.
 * @createDate 2018年10月10日
 */
public abstract class Employee {
    protected List<Employee> employeeList;

    public abstract void add(Employee employee);

    public abstract void delete(Employee employee);

    public abstract void report();
}
