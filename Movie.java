import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
class Film
{
    Scanner scan =new Scanner(System.in);
    public void TicketConfirm()
    {
        int ticketprice=200;
        System.out.println("Do you Want to book a ticket?");
        System.out.println("1.Yes/2.No");
        String t=scan.next();
        switch (t.toLowerCase())
        {
            case "yes":
                System.out.println("How many Ticket do you want to book?");
                int ticket=scan.nextInt();
                System.out.println("You have to pay Rs:"+(ticket*ticketprice));
                System.out.println("Thank You .....visit again");
                break;
            case "no":
                System.out.println("Sorry Book again");
        }
    }
    public void Hindi()
    {
        String hindimovie[]= new String[3];
        hindimovie[0]="1. Hero";
        hindimovie[1]="2. Don2";
        System.out.println("List of Hindi Movie are:");
        System.out.println(hindimovie[0]);
        System.out.println(hindimovie[1]);

        System.out.println("Enter the number of Movie you want to Watch?");
        int n=scan.nextInt();
        if(n==1)
        {
            System.out.println(hindimovie[0]+"  Movies, also known as films, are a type of visual communication" +"\n"+
                    " which uses moving pictures and sound to tell stories or teach people something. " +"\n"+
                    "People in every part of the world watch movies as a type of entertainment, " +"\n"+
                    "a way to have fun. ");

            TicketConfirm();
        }
        else if(n==2)
        {
            System.out.println(hindimovie[1]+"Movies, also known as films, are a type of visual communication" +"\n");
            TicketConfirm();
        }
        else
        {
            System.out.println("Movie not Found");
        }
    }
    public void Kanadda()
    {
        String hindimovie[]= new String[3];
        hindimovie[0]="1. KGf";
        hindimovie[1]="2. Geetha";
        hindimovie[2]="3.Tagu";

        System.out.println("List of Hindi Movie are:");
        System.out.println(hindimovie[0]);
        System.out.println(hindimovie[1]);
        System.out.println(hindimovie[2]);
        System.out.println("Enter the number of Movie you want to Watch?");
        int n=scan.nextInt();
        if(n==1)
        {
            System.out.println(hindimovie[0]+"  Movies, also known as films, are a type of visual communication" +"\n"+
                    " which uses moving pictures and sound to tell stories or teach people something. " +"\n"+
                    "People in every part of the world watch movies as a type of entertainment, " +"\n"+
                    "a way to have fun. ");

            TicketConfirm();
        }
        else if(n==2)
        {
            System.out.println(hindimovie[1]+"Movies, also known as films, are a type of visual communication" +"\n");
            TicketConfirm();
        }
        else
        {
            System.out.println("Movie not Found");
        }
    }

    public void English()
    {
        String hindimovie[]= new String[3];
        hindimovie[0]="1. Titanic";
        hindimovie[1]="2. Crank";
        hindimovie[2]="3. Machinist";

        System.out.println("List of Hindi Movie are:");
        System.out.println(hindimovie[0]);
        System.out.println(hindimovie[1]);
        System.out.println(hindimovie[2]);
        System.out.println("Enter the number of Movie you want to Watch?");
        int n=scan.nextInt();
        if(n==1)
        {
            System.out.println(hindimovie[0]+"  Movies, also known as films, are a type of visual communication" +"\n"+
                    " which uses moving pictures and sound to tell stories or teach people something. " +"\n"+
                    "People in every part of the world watch movies as a type of entertainment, " +"\n"+
                    "a way to have fun. ");

            TicketConfirm();
        }
        else if(n==2)
        {
            System.out.println(hindimovie[1]+"Movies, also known as films, are a type of visual communication" +"\n");
            TicketConfirm();
        }
        else if(n==3)
        {
            System.out.println(hindimovie[2]+"Movies, also known as films, are a type of visual communication" +"\n");
            TicketConfirm();
        }
        else
        {
            System.out.println("Movie not Found");
        }
    }
}
public class Movie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Film f =new Film();
        String m[]=new String[3];
        m[0]="Kanadda";
        m[1]="Hindi";
        m[2]="English";
        String s[] =new String[3];
        System.out.println("Which Movie you want to Watch ?");
        for(int i=0;i<3;i++)
        {
            System.out.println(m[i]);

        }
        System.out.println("Enter the language of movies you want to watch?");
        String s1=scan.nextLine();

        for(int i=0;i<3;i++)
        {
            if(m[i].equalsIgnoreCase(s1)==true)
            {
                switch (s1.toLowerCase())
               {
                   case "hindi":f.Hindi();
                   break;

                   case "kanadda":f.Kanadda();
                   break;

                   case "english":f.English();

               }
            }
        }
    }
}
