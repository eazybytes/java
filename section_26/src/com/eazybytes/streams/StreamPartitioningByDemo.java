package com.eazybytes.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitioningByDemo {

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product("Apple", 1200),
                new Product("Samsung", 1000), new Product("Nokia", 600),
                new Product("BlackBerry", 1000), new Product("Apple Pro Max", 1500),
                new Product("Mi", 800), new Product("OnePlus", 1000));

        Map<Boolean, List<Product>> partitioningByPriceMap = productList.stream()
                .collect(Collectors.partitioningBy(product -> product.getPrice()>1000));

        System.out.println(partitioningByPriceMap);

    }

}
