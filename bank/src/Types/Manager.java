package Types;

import java.math.BigDecimal;

public class Manager extends Employee {

    private String _fullJobTitle;

    public Manager(int id, String name, Gender gender, BigDecimal salary, String fullJobTitle) {
        super(id, name, gender, salary);
        _fullJobTitle = fullJobTitle;
    }

    public String getFullJobTitle() {
        return _fullJobTitle;
    }

    public void setFullJobTitle(String _fullJobTitle) {
        this._fullJobTitle = _fullJobTitle;
    }

    public String introduceYourselfAsManager() {
        return "Hi, I am " + _fullJobTitle + ".";
    }
}
