package org.coookies.crctc.service.sorters;

import org.coookies.crctc.dao.Train;

import java.util.List;

public interface Sort {

    void sortByPrice(List<Train> train);
    void sortByDate(List<Train> train);
}
