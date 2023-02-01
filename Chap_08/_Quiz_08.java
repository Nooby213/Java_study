package Chap_08;

import Chap_08.Camera.SpeedCam;
import Chap_08.Detector.AccidentDetector;
import Chap_08.Reporter.VideoReport;

public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.setReporter(new VideoReport());
        speedCam.detect();
        speedCam.report();
    }
}
