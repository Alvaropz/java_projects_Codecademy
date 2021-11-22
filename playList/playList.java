import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    // Add elements to the Array
    desertIslandPlaylist.add("Take a picture - NiziU");
    desertIslandPlaylist.add("Boku no Sensou - Shinsei Kamattechan");
    desertIslandPlaylist.add("Shoukei to Shikabane no Michi");
    desertIslandPlaylist.add("Oddloop - frederic");
    desertIslandPlaylist.add("Unravel - Samuel Kim");
    desertIslandPlaylist.add("Shoukei to Shikabane no Michi - Linked Horizon");
    desertIslandPlaylist.add("Gurenge - LiSA, NSZX");

    // Print and resize the Array
    System.out.println(desertIslandPlaylist.toString());
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove(6);
    desertIslandPlaylist.remove(5);
    System.out.println(desertIslandPlaylist.size());

    // Swap songs and print the results
    int firstIndex = desertIslandPlaylist.indexOf("Boku no Sensou - Shinsei Kamattechan");
    String firstSongName = desertIslandPlaylist.get(firstIndex);
    int secondIndex = desertIslandPlaylist.indexOf("Oddloop - frederic");
    String secondSongName = desertIslandPlaylist.get(secondIndex);
    desertIslandPlaylist.set(firstIndex, secondSongName);
    desertIslandPlaylist.set(secondIndex, firstSongName);
    System.out.println(desertIslandPlaylist.toString());
  }
  
}