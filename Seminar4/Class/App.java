public class App {

    public static void main(String[] args) {
        OurArray<String> array1 = new OurArray<>(10);
        array1.add("Hello");
        array1.add("GoodBye");
        array1.add("okey");
        
        
        
        
        for (int i = 0; i < array1.getOurArray().length; i++) {
            System.out.println(array1.getOurArray()[i]);
        }
    }
}