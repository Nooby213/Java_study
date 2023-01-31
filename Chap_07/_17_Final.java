package Chap_07;

import Chap_07.Camera.ActionCam;
import Chap_07.Camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final
        ActionCam actionCam = new ActionCam();
//        actionCam.lens = "Formal lens";
        actionCam.recordVideo();
        actionCam.makeVideo();

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();
    }
}
