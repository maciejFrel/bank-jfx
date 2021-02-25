package Types;

import java.math.BigDecimal;

public class Accountant extends Employee implements ClientContactingEmployee {

    private final int _accountantNumber;

    public Accountant(int id, String name, Gender gender, BigDecimal salary, int accountantNumber) {
        super(id, name, gender, salary);
        _accountantNumber = accountantNumber;
    }

    public int getAccountantNumber() { return _accountantNumber; }

    @Override
    public String introduceYourselfToClient() {
        return "Hi, I am " + getName() + ", and I am your accountant! My accountant number is " + _accountantNumber + ".";
    }
}
