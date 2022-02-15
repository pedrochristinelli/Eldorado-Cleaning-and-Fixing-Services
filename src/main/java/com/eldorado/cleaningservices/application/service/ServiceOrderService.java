package com.eldorado.cleaningservices.application.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ServiceOrderService {
    List<String> getImagesOfServicePackByName(String name);

    List<Map<String, Object>> getServiceOrdersByDate(Date date);
}
