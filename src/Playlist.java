public class Playlist {
    private String[] songs;
    private String[] artists;
    private int[] durations;

    public int size = 0;

    public int currentIndex;
    public boolean shuffleMode;

    public Playlist(){
        songs = new String[1000];
        artists = new String[1000];
        this.durations = new int[1000];
    }

    public void addSong(String song, String artist, int duration){
        songs[size] = song;
        artists[size] = artist;
        durations[size] = duration;
        size++;
    }

    public int goForwardOneSong(){
        if(currentIndex == 999){
            currentIndex = 0;
            //return currentIndex;
        }
        else {
            currentIndex++;
            //return currentIndex;
        }

        return currentIndex;
    }

}
