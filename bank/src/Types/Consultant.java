package Types;

import java.math.BigDecimal;

public class Consultant extends Employee implements ClientContactingEmployee {

    private final int _consultantNumber;

    public Consultant(int id, String name, Gender gender, BigDecimal salary, int consultantNumber) {
        super(id, name, gender, salary);
        _consultantNumber = consultantNumber;
    }

    public int getConsultantNumber() { return _consultantNumber; }

    @Override
    public String introduceYourselfToClient() {
        return "Hi, I am " + getName() + ", and I am your consultant! My consultant number is " + _consultantNumber + ".";
    }
}
