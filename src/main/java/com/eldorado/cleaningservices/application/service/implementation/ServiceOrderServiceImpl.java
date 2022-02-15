package com.eldorado.cleaningservices.application.service.implementation;

import com.eldorado.cleaningservices.application.service.ServiceOrderService;
import com.eldorado.cleaningservices.domain.repository.ServiceOrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ServiceOrderServiceImpl implements ServiceOrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceOrderServiceImpl.class);

    private final ServiceOrderRepository serviceOrderRepository;

    @Autowired
    public ServiceOrderServiceImpl(ServiceOrderRepository serviceOrderRepository) {
        this.serviceOrderRepository = serviceOrderRepository;
    }

    public List<String> getImagesOfServicePackByName(String name){
        LOGGER.info("Retrieving Service Order Images by the Service Pack name: {}", name);
        return serviceOrderRepository.getServicePackImagesByName(name);
    }

     public List<Map<String, Object>> getServiceOrdersByDate(Date date){
         LOGGER.info("Retrieving Service Order by the date: {}", date);
         return serviceOrderRepository.getServiceOrdersByDate(date);
    }
}
