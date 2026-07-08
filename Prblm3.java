import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Prblm3 {
    public void main()
    {
        System.out.println("Enter a roman number");
        String s;
        try (Scanner sc = new Scanner(System.in))
        {
        s = sc.nextLine();
        }
        s = s.toUpperCase();
        Map<String, Integer> d = new HashMap<>();
        d.put("I",1);
        d.put("V",5);
        d.put("X",10);
        d.put("L",50);
        d.put("C",100);
        d.put("D",500);
        d.put("M",1000);
        int c = 0;
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            int c1 = d.get(String.valueOf(s.charAt(i)));
            if(i != l-1)
            {
                int c2 = d.get(String.valueOf(s.charAt(i+1)));
                if(c1>=c2)
                {
                    c+=c1;
                }
                else
                {
                    c-=c1;
                }
            }
            else
            {
                c+=c1;
            }
        }
        System.out.println(c);
    }
    
}