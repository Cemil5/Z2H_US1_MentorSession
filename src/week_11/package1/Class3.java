package week_11.package1;

public class Class3 extends Class1 {

    public static void main(String[] args) {
        Class1 class1 = new Class1();

        System.out.println(class1.x_public);
        System.out.println(class1.y_protected);
        System.out.println(class1.z_default);
      //  System.out.println(class1.u_private);
        class1.m_protected();

        Class3 class3 = new Class3();
        System.out.println(class3.x_public);
        System.out.println(class3.y_protected);
        System.out.println(class3.z_default);
      //  System.out.println(class3.u_private);
        class3.m_protected();

        class3.testModifiers();
    }

    void testModifiers(){
        System.out.println(x_public);
        System.out.println(y_protected);
        System.out.println(z_default);
       // System.out.println(u_private);
        System.out.println(m_protected());
    }


}
