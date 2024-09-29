package org.coookies.crctc.service.controllers;

import org.coookies.crctc.dao.Train;
import org.coookies.crctc.dao.TrainSchedule;
import org.coookies.crctc.service.sorters.Sort;
import org.coookies.crctc.service.sorters.BubbleSort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RestController
public class BookingServiceController {

    @GetMapping("/crctc/healthcheck")
    public String healthcheck(){
        return "hello, world";
    }

    @GetMapping("/crctc/sort")
    public List<Train> sortTrains(@RequestParam("by") String parameter){
        List<Train> trains = new LinkedList<>();

        trains.add(new Train(10,"Chipdale Express",9,1, 150,
                new TrainSchedule("Doughville", "Chipdale", LocalDate.now())));

        trains.add(new Train(20,"Cherry Commute",11,9, 100,
                new TrainSchedule("Cherry Hills", "Sprinkevale", LocalDate.now())));

        trains.add(new Train(100,"Vanilla Transport",0,100, 200,
                new TrainSchedule("Vanilla Valley", "Berry Bridge", LocalDate.now())));

        Sort sorter = new BubbleSort();
        if(parameter.equals("price")){
            sorter.sortByPrice(trains);
        } else if(parameter.equals("date")){
            sorter.sortByDate(trains);
        } else {
            throw new RuntimeException("Oops, not allowed.");
        }

        return trains;
    }

}
