
class Degree {
    void getDegree() {
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree {
    @Override
    void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}
class Postgraduate extends Degree {
    @Override
    void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

public class pr21 {
    public static void main(String[] args) {
        Degree degreeobj = new Degree();
        Undergraduate undergraduateobj = new Undergraduate();
        Postgraduate postgraduateobj = new Postgraduate();
        degreeobj.getDegree();
        undergraduateobj.getDegree();
        postgraduateobj.getDegree();
    }
}
