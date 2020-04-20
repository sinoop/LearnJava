package equals;

import schema.employee.Address;
import schema.employee.Employee;
import schema.employee.Name;

public class TestEqualsAndHashCode {
    public static void main(String[] args) {
        Address a = new Address.Builder()
                .aptNumber("304")
                .city("Jersey City")
                .country("USA")
                .state("NJ")
                .streetName("Congress St")
                .houseName("78")
                .build();
        Name n = new Name.Builder()
                .fname("Sinoop")
                .lname("Joy")
                .build();

        Employee e = new Employee.Builder()
                .empId(100)
                .address(a)
                .name(n)
                .build();

        Employee e2 = new Employee.Builder()
                .empId(100)
                .address(a)
                .name(n)
                .build();

        //Reference Comparison - both objects point to the same memory location
        System.out.println(e == e2);
        System.out.println(e);
        System.out.println(e2);


        System.out.println(e.equals(e2));

        System.out.println(e.hashCode());
        System.out.println(e2.hashCode());

        Double d1 = Double.valueOf(12.0);
        Double d3 = new Double(12.0);
        Double d2 = d1;
        d1 = d1 + 1;
        System.out.println(d1 == d2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);


        String s1 = "Test";
        String s2 = "Test";

        System.out.println("\n1 - PRIMITIVES ");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        A a1 = new A();
        A a2 = new A();

        System.out.println("\n2 - OBJECT TYPES / STATIC VARIABLE");
        System.out.println(a1 == a2); // false
        System.out.println(A.s == A.s); // true
        System.out.println(A.s.equals(A.s)); // true

        B b1 = new B();
        B b2 = new B();

        System.out.println("\n3 - OBJECT TYPES / NON-STATIC VARIABLE");
        System.out.println(b1 == b2); // false
        System.out.println(b1.getS() == b2.getS()); // false
        System.out.println(b1.getS().equals(b2.getS())); // true
    }

}

final class A {
    // static
    public static String s;

    A() {
        s = "aTest";
    }
}

final class B {
    private final String s;

    B() {
        this.s = "aTest";
    }

    public String getS() {
        return s;
    }

}