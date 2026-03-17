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
        this.songs[size] = song;
        artists[size] = artist;
        durations[size] = duration;
        size++;

        //alternate way if no size variable
        // no book keeping have to loop
        for(int i = 0; i < songs.length; i++){
            if(songs[i] == null){
                this.songs[i] = song;
                artists[i] = artist;
                durations[i] = duration;
                this.size++;
                break;
            }
        }

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
