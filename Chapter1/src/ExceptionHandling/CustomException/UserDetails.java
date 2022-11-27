package ExceptionHandling.CustomException;
public class UserDetails {
    public void checkVoterAge(int age) throws AgeInvalidException
    {
        if(age<=18)
        {
            throw new AgeInvalidException("You Cannot Vote");
        }
        else {
            System.out.println("You Can Vote");
        }
    }
    public static void main(String[] args) {
        UserDetails userDetails=new UserDetails();
        try {
            userDetails.checkVoterAge(10);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


}
