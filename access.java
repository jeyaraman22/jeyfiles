 class country
{
    public String name= "India";
    private String population = "1.5 billion";
    private int states=32;
    protected String capital ="New delhi";
    System.out.println(population,states+"states");
}
public class state  extends country
{
    public static void main(String[] args)
    {
     System.out.println(name,"is my country");
     System.out.println(capital,"is the capital of india");
     country a=new country();
     state b=new state();
    }
}