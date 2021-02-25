package Types;

public abstract class Person {

    private final int _id;
    private final String _name;
    private final Gender _gender;

    protected Person(int id, String name, Gender gender) {
        _id = id;
        _name = name;
        _gender = gender;
    }

    public final int getId() {
        return _id;
    }

    public final String getName() {
        return _name;
    }

    public final Gender getGender() {
        return _gender;
    }

    public String introduceYourself() {
        return "Hi, I am " + getName() + "!";
    }
}
