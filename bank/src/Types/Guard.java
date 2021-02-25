package Types;

import java.math.BigDecimal;

public class Guard extends Employee {

    private final boolean _armed;

    public Guard(int id, String name, Gender gender, BigDecimal salary, boolean armed) {
        super(id, name, gender, salary);
        _armed = armed;
    }

    public boolean isArmed() {
        return _armed;
    }

    public String warnClientToWearAMask() {
        return "Stop! I am " + (_armed ? "an armed guard here " : "a guard here ") + "and I am telling you to put on a mask!";
    }

}
