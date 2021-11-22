import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    ArrayList<String> superheros = new ArrayList<String>();

    superheros.add("Captain America");
    superheros.add("Black Widow");
    superheros.add("Iron Man");
    superheros.add(0, "Spiderman");
    superheros.add("Winter Soldier");
    superheros.add("Mery Poppins");
    superheros.add("Wanda");
    superheros.remove("Mery Poppins");
    int spidermanIndex = superheros.indexOf("Spiderman");
    System.out.println("Spiderman is at index " + spidermanIndex);
    System.out.println(superheros.toString());
    System.out.println(superheros.get(4) + " is at index 4.");
    System.out.println("There are a total of " + superheros.size() + " in the superheros list.");
    superheros.add("Hannah Montana");
    superheros.set(6, "Hulk");
    System.out.println(superheros.toString());
  }
  
}
