import java.lang.*;
public class Main {
    public static void main(String[] args) {
       Author a1 = new Author ("Iurii Kim", 'M', "iurii.kim@out.com");
       Author a2 = new Author ("Violet Blue", 'O', "v_b_23@gmail.com");
       System.out.println(a2);
       System.out.println();
       a2.setEmail("violet_blue@out.com");
       System.out.println(a1);
       System.out.println(a2);
    }
}
