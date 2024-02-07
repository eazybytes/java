package com.eazybytes.enumeration;

public class TaskPriorityConstantDemo {

    private PriorityEnum priority;

    public static void main(String[] args) {
        PriorityEnum priorityEnum = null;
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.LOW));
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.MEDIUM));
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.HIGH));
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.URGENT));
        System.out.println(PriorityEnum.URGENT);
    }

}
