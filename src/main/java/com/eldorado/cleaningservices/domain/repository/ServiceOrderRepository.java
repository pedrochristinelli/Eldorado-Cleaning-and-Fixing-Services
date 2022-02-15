package com.eldorado.cleaningservices.domain.repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ServiceOrderRepository {
    List<String> getServicePackImagesByName(String name);

    List<Map<String, Object>> getServiceOrdersByDate(Date date);
}
