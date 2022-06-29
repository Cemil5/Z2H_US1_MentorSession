package week_11.package1;

public class Class2 {
    public static void main(String[] args) {
        Class1 o = new Class1();
        System.out.println(o.x_public);
        System.out.println(o.y_protected);
        System.out.println(o.z_default);
      //  System.out.println(o.u_private);
        o.m_protected();
    }

}
