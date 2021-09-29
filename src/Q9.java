//public class Q9 { }
interface Furniture{
    public void stressTest();
    public void fireTest();
}
abstract class chair implements Furniture {
    abstract String chairtype();
}
abstract class table implements Furniture
{
    abstract String tabletype();
}
class metalchair extends chair{
    public void stressTest(){
        System.out.println("test passed");
    }
    public void fireTest(){
        System.out.println("test passed");

    }
    public String chairtype(){
        return"metalchair";
    }
}
class woodenchair extends chair{
    public void stressTest(){
        System.out.println("test passed");
    }

    @Override
    public void fireTest() {
        System.out.println("test passed");
    }
    public String chairtype(){
        return"woodenchair";
    }
}
class metaltable extends table{
    public void stressTest(){
        System.out.println("test passed");
    }
    public void fireTest() {
        System.out.println("test passed");
    }
    public String tabletype(){
        return "metaltable";
    }
    class woodentable extends table{
        public void stressTest(){
            System.out.println("test passed");
        }
        public void fireTest() {
            System.out.println("test passed");
        }
        public String tabletype(){
            return "woodentable";
        }
    }
    public class Q9  {
        public static void main(String[] args) {
            woodenchair ch=new woodenchair();
            System.out.println(ch.chairtype());
            ch.fireTest();
            ch.stressTest();

            metalchair mt=new metalchair();
            System.out.println(mt.chairtype());
            mt.fireTest();
            mt.stressTest();
        }
    }}

