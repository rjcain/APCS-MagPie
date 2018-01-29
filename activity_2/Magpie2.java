package activity_2;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
              response = "Tell me more about your family.";
        }
        else if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >= 0)
        {
              response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("Mr. Appel") >= 0)
        {
              response = "He sounds like an interesting guy.";
        }
        else if (statement.trim().equals(""))
        {
              response = "Say something please.";
        }
        else if (statement.indexOf("who") >= 0
                || statement.indexOf("Who") >= 0)
        {
              response = "No one. Or maybe you. I don't know.";
        }
        else if (statement.indexOf("what") >= 0
                || statement.indexOf("What") >= 0)
        {
              response = "You're asking the wrong question here.";
        }
        else if (statement.indexOf("weather") >= 0
                || statement.indexOf("Weather") >= 0)
        {
              response = "I don’t know about you but I’m hot.";
        }
        else if (statement.indexOf("how") >= 0
                || statement.indexOf("How") >= 0)
        {
              response = "Whichever safe method you prefer.";
        }
        else if (statement.indexOf("you") >= 0
                || statement.indexOf("You") >= 0)
        {
              response = "Enough about me, let’s hear about you!";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }

        return response;
    }
}
