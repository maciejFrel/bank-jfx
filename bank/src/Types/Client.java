package Types;

import java.math.BigDecimal;

public class Client extends Person {

    private BigDecimal _balance;

    public Client(int id, String name, Gender gender, BigDecimal balance) {
        super(id, name, gender);
        _balance = balance;
    }

    public BigDecimal getBalance() {
        return _balance;
    }

    public void deposit(BigDecimal amount) {
        _balance = _balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        _balance = _balance.subtract(amount);
    }

    public static String showRegistrationTemplate() {
        return "registration template"; // todo
    }
}
