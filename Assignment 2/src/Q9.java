class Result {
    public void result() {
        System.out.println("This is the general result.");
    }
}

class UGResult extends Result {
    @Override
    public void result() {
        System.out.println("This is the undergraduate result.");
    }
}

class PGResult extends Result {
    @Override
    public void result() {
        System.out.println("This is the postgraduate result.");
    }
}

public class Q9 {
    public static void main(String[] args) {
        Result res1 = new Result();
        res1.result();

        Result res2 = new UGResult();
        res2.result();

        Result res3 = new PGResult();
        res3.result();
    }
}
