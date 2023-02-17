class BaseClass1 {
    public int publicVarA;
    private int privateVarA;
    protected int protectedVarA;
}

class BaseClass2 {
    public int publicVarB;
    private int privateVarB;
    protected int protectedVarB;
}

class DerivedClass extends BaseClass1 {
    private BaseClass2 baseObj = new BaseClass2();

    public void setPublicVarA(int value) {
        publicVarA = value;
    }

    public int getProtectedVarB() {
        return baseObj.protectedVarB;
    }
}

public class Q11 {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.setPublicVarA(10);
        int x = obj.getProtectedVarB();
    }
}
