package com.anhtester.dataprovider;

import java.util.ArrayList;
import java.util.List;

public interface DataStrategy {
    List<String> getData();
}

// CSV Data Strategy Implementation
class CSVDataStrategy implements DataStrategy {
    @Override
    public List<String> getData() {
        System.out.println("Get data from CSV file!");
        // Logic to read data from CSV file
        return new ArrayList<>();
    }
}

// JSON Data Strategy Implementation
class JsonDataStrategy implements DataStrategy {
    @Override
    public List<String> getData() {
        System.out.println("Get data from JSON file!");
        // Logic to read data from JSON file
        return new ArrayList<>();
    }
}

// Main Class
class DataProviderTest {
    public static void main(String[] args) {
        DataStrategy jsonDataStrategy = new JsonDataStrategy();
        List<String> dataJson = jsonDataStrategy.getData();
    }
}
