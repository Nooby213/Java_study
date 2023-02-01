package Chap_08.Camera;

import Chap_08.Detector.Detectable;
import Chap_08.Reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        detector.detect();
    }

    @Override
    public void detect() {
        reporter.report();
    }

    @Override
    public void report() {
        System.out.println("화재 신고를 진행합니다.");
    }

//    public void detect() {
//        System.out.println("화재를 감지합니다.");
//    }
//
//    public void report() {
//        System.out.println("화재 신고를 진행합니다.");
//    }
}
