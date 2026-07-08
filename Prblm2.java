import java.util.Scanner;
public class Prblm2 {
    public void main()
    {
        System.out.println("Enter a number");
        int x;
        try(Scanner sc = new Scanner(System.in)){
            x = sc.nextInt();
        }
        int y = 0;
        for(int c = x;c>0;c=c/10)
        {
            y=y*10+(c%10);
        }
        System.out.println(y==x);
    }
    
}
