package week_11.package2;

import week_11.package1.Class1;

public class Class4 extends Class1 {

    public static void main(String[] args) {
        Class4 class4 = new Class4();
        System.out.println(class4.x_public);
        System.out.println(class4.y_protected);
//        System.out.println(class4.z_default);
//        System.out.println(class4.u_private);
        class4.m_protected();

        Class1 class1 = new Class1();
        System.out.println(class1.x_public);
//        System.out.println(class1.y_protected);
//        System.out.println(class1.z_default);
//        System.out.println(class1.u_private);
//        class1.m_protected();

        class4.testModifiers();
    }

    void testModifiers(){
        System.out.println(x_public);
        System.out.println(y_protected);
//        System.out.println(z_default);
//        System.out.println(u_private);
        System.out.println(m_protected());
    }
}
