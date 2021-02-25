package Types;

import java.math.BigDecimal;

public abstract class Employee extends Person {

    private BigDecimal _salary;

    protected Employee(int id, String name, Gender gender, BigDecimal salary) {
        super(id, name, gender);
        _salary = salary;
    }

    public BigDecimal getSalary() {
        return _salary;
    }

    public void setSalary(BigDecimal salary) {
        _salary = salary;
    }

    public final String getSalaryString() {
        return "$" + _salary.toPlainString();
    }
}
