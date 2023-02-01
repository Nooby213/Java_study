package Chap_08;

import Chap_08.Camera.FactoryCam;
import Chap_08.Detector.AdvancedFireDetector;
import Chap_08.Detector.Detectable;
import Chap_08.Detector.FireDetector;
import Chap_08.Reporter.NormalReporter;
import Chap_08.Reporter.Reportable;
import Chap_08.Reporter.VideoReport;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스 : 뼈대만 제공하는 클래스
        Reportable/*NormalReporter*/ normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReport videoReport = new VideoReport();
        videoReport.report();

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setReporter(normalReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
