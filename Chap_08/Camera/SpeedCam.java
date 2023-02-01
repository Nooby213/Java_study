package Chap_08.Camera;

import Chap_08.Detector.Detectable;
import Chap_08.Reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {
    public Detectable detector;
    public Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("Measuring a speed");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
