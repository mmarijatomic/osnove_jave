package d17_01_2023;

public class AudioControl extends Control {

    private boolean volumeChanger;

    public boolean isVolumeChanger() {
        return volumeChanger;
    }

    public void setVolumeChanger(boolean volumeChanger) {
        this.volumeChanger = volumeChanger;
    }

    public AudioControl(boolean volumeChanger) {
        this.volumeChanger = volumeChanger;
    }

    @Override
    protected void action(VideoPlayer videoPlayer) {
        int volume= videoPlayer.getVolume();
        if (isVolumeChanger()) {
            volume = volume + 1;
            if (volume > 100) { volume = 100;}
        } else { volume = volume -1;
            if (volume < 0) { volume = 0;
            }
    } videoPlayer.setVolume(volume);
}
}
