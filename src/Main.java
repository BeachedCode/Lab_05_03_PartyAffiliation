public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Choose Party Affiliation: D for Democrat, R for Republican, I for Independent, or any other input for Other");
        String prtyAffil = "D";

        if (prtyAffil == "D")
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if (prtyAffil == "R")
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (prtyAffil == "I")
        {
            System.out.println("You get an Independent Man");
        }
        else
        {
            System.out.println("You get an Other Ostrich");
        }



    }
}
