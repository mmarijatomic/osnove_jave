package d17_01_2023;

public class TimeControl extends Control{

    private boolean videoTimeChanger;

    public TimeControl(boolean videoTimeChanger) {
        this.videoTimeChanger = videoTimeChanger;
    }

    public boolean isVideoTimeChanger() {
        return videoTimeChanger;
    }

    public void setVideoTimeChanger(boolean videoTimeChanger) {
        this.videoTimeChanger = videoTimeChanger;
    }

    @Override
    protected void action(VideoPlayer videoPlayer) {
        double ct = videoPlayer.getCurrentTime();
        if (isVideoTimeChanger()) {
           ct = ct + 15;
           if (ct > videoPlayer.getVideoLenght()) {
               ct = videoPlayer.getVideoLenght();
           }
        } else { ct= ct - 15;
            if (ct < 0) { ct=0;
            }
    }
        videoPlayer.setCurrentTime(ct);
    }

}
