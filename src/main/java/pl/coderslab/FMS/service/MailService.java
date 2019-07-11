package pl.coderslab.FMS.service;

import pl.coderslab.FMS.model.Tour;
import pl.coderslab.FMS.model.TourStatus;

public class MailService {

    public void sendReminderEmail(Tour tour){

        if (TourStatus.UNLOADED == tour.getTourStatus()) {
            //tresc przy;ominam o zaladunku ... dane toura
        }else if(TourStatus.TO_UNLOAD == tour.getTourStatus()){
            //przypominam o rozladunku nr toura....
        }
    }
}
