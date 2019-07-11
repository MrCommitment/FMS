package pl.coderslab.FMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.FMS.model.*;
import pl.coderslab.FMS.model.dto.LoadInfoDTO;
import pl.coderslab.FMS.repository.LoadRepository;
import pl.coderslab.FMS.repository.PlaceRepository;
import pl.coderslab.FMS.repository.TourRepository;
import pl.coderslab.FMS.repository.TruckRepository;

import java.util.Collections;

@Service
public class TourService {

    private final PlaceRepository placeRepository;
    private final LoadRepository loadRepository;
    private final TruckRepository truckRepository;
    private final TourRepository tourRepository;

    @Autowired
    public TourService(PlaceRepository placeRepository, LoadRepository loadRepository, TruckRepository truckRepository, TourRepository tourRepository) {
        this.placeRepository = placeRepository;
        this.loadRepository = loadRepository;
        this.truckRepository = truckRepository;
        this.tourRepository = tourRepository;
    }

    public void createTour(LoadInfoDTO loadInfoDTO) {
        Place loadingPlace = new Place();
        loadingPlace.setPlaceType(PlaceType.LOADING);
        loadingPlace.setCity(loadInfoDTO.getLoadingCity());
        loadingPlace.setCountry(loadInfoDTO.getLoadingCountry());
        loadingPlace.setPostCode(loadInfoDTO.getLoadingPostCode());
        placeRepository.save(loadingPlace);

        Place unloadingPlace = new Place();
        unloadingPlace.setPlaceType(PlaceType.UNLOADING);
        unloadingPlace.setCity(loadInfoDTO.getUnloadingCity());
        unloadingPlace.setCountry(loadInfoDTO.getUnloadingCountry());
        unloadingPlace.setPostCode(loadInfoDTO.getUnloadingPostCode());
        placeRepository.save(unloadingPlace);

        Load load = new Load();
        load.setGoods(loadInfoDTO.getGoods());
        load.setWeight(loadInfoDTO.getWeight());
        load.setTransitTime(loadInfoDTO.getTransitTime());
        loadRepository.save(load);

        Truck truck = new Truck();
        truck.setDriverDetails(loadInfoDTO.getDriverDetails());
        truck.setTrailer(loadInfoDTO.getTrailer());
        truck.setTruckNr(loadInfoDTO.getTruckNr());
        truckRepository.save(truck);

        Tour tour = new Tour();
        tour.setLoadingPlace(loadingPlace);
        tour.setUnloadingPlace(unloadingPlace);
        tour.setDistance(650);
        tour.setTourStatus(TourStatus.UNLOADED);
        tour.setLoads(Collections.singletonList(load));
        tourRepository.save(tour);


    }
}
