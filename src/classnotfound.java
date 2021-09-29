public class classnotfound {

    public static void main(String args[]) {
        try
        {
            Class.forName("hi_there");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}

