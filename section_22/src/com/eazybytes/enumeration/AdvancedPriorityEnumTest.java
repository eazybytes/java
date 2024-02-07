package com.eazybytes.enumeration;

public class AdvancedPriorityEnumTest {

    public static void main(String[] args) {

        for(AdvancedPriorityEnum priorityEnum : AdvancedPriorityEnum.values()){
            String name = priorityEnum.name();
            int ordinal = priorityEnum.ordinal();
            int days = priorityEnum.getEstimatedCompletionDays();
            System.out.println("name = " + name + ", ordinal = "+ordinal
                    +", days = "+ days);
        }
    }

}
