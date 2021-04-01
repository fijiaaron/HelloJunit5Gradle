public class Psychiatrist implements Doctor
{
    public boolean diagnose(Patient p)
    {
        return p.sanity;
    }
}
