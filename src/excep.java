public class excep {
    public static void main(String[] args) {
        int[] array={12,13,5};
        try{
            array[3]=array[2]/0;

        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            {
                System.out.println("Fianlly block always executed");
            }
        }
        }






}
