import java.util.Locale;

class singleton {
    private static singleton singleton_instance=null;
    public String str;
    private singleton(){
        str="this is private constructor";
    }
    public static singleton getInstance() {
        if (singleton_instance == null) {
            singleton_instance = new singleton();
        }
        return singleton_instance;
    }
    public static void main(String[] args) {
        singleton a = singleton.getInstance();
        singleton b = singleton.getInstance();
        singleton c = singleton.getInstance();
        a.str = (a.str).toUpperCase();
        System.out.println("b: " + b.str);
        System.out.println("c: " + c.str);
        a.str = (a.str).toUpperCase();
        System.out.println("b: " + b.str);
        System.out.println("c: " + c.str);
        a.str = (a.str).toLowerCase();
        System.out.println("b: " + b.str);
        System.out.println("c: " + c.str);
    }

}








