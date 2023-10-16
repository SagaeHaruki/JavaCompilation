public abstract class Laptop
{
    public abstract int getRam();
    public abstract int getSSD();
    public abstract String getCpu();

    public String toString()
    {
        return "Ram- " + this.getRam() + "GB, SSD- " + this.getSSD() + ", CPU- " + this.getCpu();
    }   
}
