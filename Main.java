import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<School> st=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            Scanner sc= new Scanner(System.in);
            int a=sc.nextInt();
            String name=sc.next();
            int b=sc.nextInt();
            School s=new School(a,name,b);
            st.add(s);
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(st.get(i).getName());
        }

    }
}