package com.company.inventory.response;

import java.util.ArrayList;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResponseRest {

    private static final Logger logger = LoggerFactory.getLogger(ResponseRest.class);

    private ArrayList<HashMap<String, String>> metadata = new ArrayList<>();

    public ArrayList<HashMap<String, String>> getMetadata() {
    return metadata;
    }

    public void setMetadata(String type, String code, String date) {

        logger.info("-- se inicia el guardado de info en el hashmap");
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);
        map.put("code", code);
        map.put("date", date);

        logger.debug("-- se finaliza el gurdado de info en map");
        metadata.add(map);

    }
}
