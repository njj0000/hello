class Developer{

    private String name;
    private int career;
    private int mon;

    Developer(String name, int career)
    {
        this.name = name;
        this.career = career;
    }

    int getSalary()
    {
        if(this.career>=7)
        {
            mon = 4500 + (100 * this.career);
        }
        else
        {
            if(this.career>=3)
            {
                mon = 3500 + (100 * this.career);
            }
            else
            {
                mon = 2800 + (100 * this.career);
            }
        }

        return mon;
    }
}
public class test{
    public static void main(String[] args){

        Developer dev = new Developer("Lee", 2);
        Developer dev1 = new Developer("Lae", 5);
        Developer dev2 = new Developer("Lye", 9);

        System.out.println(dev.getSalary());
        System.out.println(dev1.getSalary());
        System.out.println(dev2.getSalary());
    }
}