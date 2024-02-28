package com.eazybytes.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamCollectingAndThenDemo {

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product("Apple", 1200),
                new Product("Samsung", 1000), new Product("Nokia", 600),
                new Product("BlackBerry", 1000), new Product("Apple Pro Max", 1500),
                new Product("Mi", 800), new Product("OnePlus", 1000));

        String maxPriceProduct = productList.stream().collect(Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparing(Product::getPrice)),
                (productOptional -> productOptional.isPresent() ? productOptional.get().getName() : "None")
        ));

        System.out.println(maxPriceProduct);
    }

}
