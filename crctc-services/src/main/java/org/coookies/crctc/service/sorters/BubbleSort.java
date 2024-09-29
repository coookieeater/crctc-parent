package org.coookies.crctc.service.sorters;

import org.coookies.crctc.dao.Train;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BubbleSort implements Sort {

    @Override
    public void sortByPrice(List<Train> train) {
        List<Train> sortedTrain = new ArrayList<>();

        int size = train.size();
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                Train previous = train.get(i);
                Train next = train.get(j);
                if(previous.getPrice()>next.getPrice()) {
                    sortedTrain.add(next);
                } else {
                    sortedTrain.add(previous);
                }
            }
        }
        train.clear();
        train.addAll(sortedTrain);
    }

    @Override
    public void sortByDate(List<Train> train) {

        int size = train.size();
    }
}
