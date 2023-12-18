import java.util.ArrayList;
//program that works with arraylist methods
class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList();
    desertIslandPlaylist.add("SongName1");
    desertIslandPlaylist.add("SongName2");
    desertIslandPlaylist.add("SongName3");
    desertIslandPlaylist.add("SongName4");
    desertIslandPlaylist.add("SongName5");
    desertIslandPlaylist.add("SongName6"); 
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove(desertIslandPlaylist.size()-1);
    System.out.println(desertIslandPlaylist);
    int indexA = desertIslandPlaylist.indexOf("SongName1");
    int indexB = desertIslandPlaylist.indexOf("SongName5");
String tempA = "Buena Vista Social Club - Murmullo";
desertIslandPlaylist.set(indexA, "A Tribe Called Quest - Electric Relaxation");
desertIslandPlaylist.set(indexB, tempA);
System.out.println(desertIslandPlaylist);
  }
  
}