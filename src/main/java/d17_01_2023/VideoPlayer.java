package d17_01_2023;

public class VideoPlayer {

    private double videoLenght;

    private double currentTime;

    private int volume;

    private int videoQuality;

    public double getVideoLenght() {
        return videoLenght;
    }

    public void setVideoLenght(double videoLenght) {
        this.videoLenght = videoLenght;
    }

    public double getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(double currentTime) {
        this.currentTime = currentTime;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(int videoQuality) {
        this.videoQuality = videoQuality;
    }

    public VideoPlayer(double videoLenght, double currentTime, int volume, int videoQuality) {
        this.videoLenght = videoLenght;
        this.currentTime = currentTime;
        this.volume = volume;
        this.videoQuality = videoQuality;
    }

    public void print () {
        System.out.println("Trenutno vreme: " + this.currentTime);
        System.out.println("Jacina zvuka: " + this.volume);
        System.out.println("Kvalitet videa: " + this.videoQuality);
    }



}
