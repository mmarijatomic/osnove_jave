package d17_01_2023;

public class QualityOptimizerControl extends Control{

    private double internetSpeed;

    public double getInternetSpeed() {
        return internetSpeed;
    }

    public void setInternetSpeed(double internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    public QualityOptimizerControl(double internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    @Override
    protected void action(VideoPlayer videoPlayer) {

        if (getInternetSpeed() * 10.1<= 144) { videoPlayer.setVideoQuality(144);
        } else if (getInternetSpeed() * 10.1 <= 240) { videoPlayer.setVideoQuality(240);
        } else if (getInternetSpeed() * 10.1 <= 360) { videoPlayer.setVideoQuality(360);
        } else if (getInternetSpeed() * 10.1 <= 480) { videoPlayer.setVideoQuality(480);
        } else if (getInternetSpeed() * 10.1 <= 720) { videoPlayer.setVideoQuality(720);
        } else if (getInternetSpeed() * 10.1 <= 1020) { videoPlayer.setVideoQuality(1020);
        }

    }

    }

