import java.util.ArrayList;

//@author William Wallace

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Soaked");
    desertIslandPlaylist.add("Supalonely");
    System.out.println(desertIslandPlaylist);
    
    //Reorder playlist
    String temp = "Supalonely";
    desertIslandPlaylist.set(1, "Soaked");
    desertIslandPlaylist.set(0, temp);
    System.out.println(desertIslandPlaylist);
    
    // int temp = desertIslandPlaylist.valueAt(0);
    // desertIslandPlaylist.set(1, "Soaked");
    // desertIslandPlaylist.set(0, temp);
    //System.out.println(desertIslandPlaylist.valueAt(0));
  }
}