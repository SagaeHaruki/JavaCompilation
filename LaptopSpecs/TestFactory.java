public class TestFactory
{
    public static void main(String[] args)
    {
        Laptop min = LaptopFactory.getSpecs("Minimum", 8, 256, "i5-12400F");
        Laptop recom = LaptopFactory.getSpecs("Recommended", 16, 512, "i7-12700K");
        System.out.print("Minimum Specs\n" + min);
        System.out.print("Minimum Specs\n" + recom);
    }     
}

class Minimum extends Laptop
{
    private int ram;
    private int ssd;
    private String cpu;

    public Minimum(int ram, int ssd, String cpu)
    {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public int getRam()
    {
        return this.ram;
    }

    public int getSSD()
    {
        return this.ssd;
    }

    public String getCpu()
    {
        return this.cpu;
    }
}

class Recommended extends Laptop
{
    private int ram;
    private int ssd;
    private String cpu;

    public Recommended(int ram, int ssd, String cpu)
    {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public int getRam()
    {
        return this.ram;
    }

    public int getSSD()
    {
        return this.ssd;
    }

    public String getCpu()
    {
        return this.cpu;
    }
}

class LaptopFactory
{
    public static Laptop getSpecs(String type, int ram, int ssd, String cpu)
    {
        if("Minimum".equalsIgnoreCase(type)) return new Minimum(ram, ssd, cpu);
        else if("Recommended".equalsIgnoreCase(type)) return new Minimum(ram, ssd, cpu);
        return null;
    }
}
