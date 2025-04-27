package com.eazybytes.java24;

import java.util.Optional;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class I_Fold {

    public static void main(String[] args) {
        Optional<Integer> totalDigits = Stream.of(10, 200, 3, 45)
                .gather(
                        Gatherers.fold(
                                () -> 0,
                                (count, num) -> count + String.valueOf(num).length()
                        )
                )
                .findFirst();

        System.out.println(totalDigits); // Output: Optional[8]

    }
}
