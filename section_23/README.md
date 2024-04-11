# Date and Time 📚
Java offers comprehensive support for handling date and time through its built-in libraries in the `java.time` package. This package was introduced in Java 8 as part of the Java Date and Time API (JSR 310), providing a modern, flexible, and thread-safe API for working with dates and times.
## Why new Date API introduced in Java 8 🤔
The new Date and Time API introduced in Java 8, also known as the `java.time` package, addressed several limitations and issues present in the older `java.util.Date` and `java.util.Calendar` classes. Here are some reasons why the new API was introduced:
**Immutability :** Objects in the `java.time` package are immutable, meaning their state cannot be modified after creation. This ensures thread safety, simplifies concurrency, and reduces the risk of unintended side effects.

**Clarity and Readability :** The new API provides clearer and more intuitive class names like `LocalDate`, `LocalTime`, and `ZonedDateTime`, making code more readable and expressive compared to the ambiguous `Date` and `Calendar` classes.

**Null-Safe :** The old API had issues with null values and was prone to `NullPointerExceptions`. The new API is designed to handle null values more gracefully, reducing the risk of runtime errors.

**Consistency :** The old API had inconsistent and error-prone methods for date and time manipulation. The new API provides consistent and comprehensive methods for various date and time operations, reducing the complexity of code and improving maintainability.

**Interoperability :** The new API is designed to work seamlessly with other modern Java features such as lambdas, streams, and the java.time.temporal package. This improves interoperability and makes it easier to integrate date and time functionality with other parts of the Java ecosystem.

**Localization Support :** The new API provides better support for internationalization and localization, allowing developers to format and parse dates and times according to different locales and languages.

**Better Time Zone Handling :** The old API had limited support for time zones and often led to errors and inconsistencies when working with different time zones. The new API provides robust support for time zones, including the `ZoneId` and `ZonedDateTime` classes, making it easier to handle date and time calculations across different time zones.

Overall, the introduction of the new Date and Time API in Java 8 aimed to address the shortcomings of the old API, providing a more modern, robust, and developer-friendly solution for working with dates and times in Java applications.

## java.util.Date
The `java.util.Date` class represents a specific instant in time, with millisecond precision. It is widely used in Java applications for handling dates and times. However, it's important to note that this class has been largely superseded by the `java.time` package in Java 8 and later versions. Nevertheless, understanding its usage can still be beneficial, especially when dealing with legacy codebases.
### Example  💡

Here's a simple example demonstrating some common operations with `java.util.Date`:

```java
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        // Create a new Date object representing the current date and time
        Date currentDate = new Date();

        // Print the current date and time
        System.out.println("Current Date and Time: " + currentDate);

        // Get the milliseconds since January 1, 1970, 00:00:00 GMT
        long milliseconds = currentDate.getTime();
        System.out.println("Milliseconds since January 1, 1970: " + milliseconds);

        // Set the time of the date object to a specific timestamp
        Date specificDate = new Date(1617888000000L); // April 9, 2021, 00:00:00 GMT
        System.out.println("Specific Date: " + specificDate);

        // Compare two dates
        if (currentDate.after(specificDate)) {
            System.out.println("The current date is after the specific date.");
        } else if (currentDate.before(specificDate)) {
            System.out.println("The current date is before the specific date.");
        } else {
            System.out.println("The current date is equal to the specific date.");
        }

        // Check if a date is equal to another date
        if (currentDate.equals(specificDate)) {
            System.out.println("The current date is equal to the specific date.");
        } else {
            System.out.println("The current date is not equal to the specific date.");
        }
    }
}
```
## Date Formatting and Parsing using SimpleDateFormat
Formatting dates involves converting a `Date` object into a string representation according to a specified pattern, while parsing dates involves converting a string representation of a date into a `Date` object.

### Formatting Dates

To format a date into a string representation, follow these steps:

1. Create a `SimpleDateFormat` object with the desired date pattern.
2. Call the `format()` method on the `SimpleDateFormat` object, passing the `Date` object you want to format.

#### Example 💡
```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormattingExample {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = formatter.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
```

### Parsing Dates
To parse a string representation of a date into a Date object, follow these steps:

- Create a `SimpleDateFormat` object with the date pattern matching the format of the string representation.
- Call the `parse()` method on the `SimpleDateFormat` object, passing the string representation of the date.
#### Example 💡

```java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParsingExample {
    public static void main(String[] args) {
        String dateString = "08-04-2024 14:30:00";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        try {
            Date parsedDate = formatter.parse(dateString);
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
```
### Date Patterns
You can use various patterns to format and parse dates according to your requirements. Some commonly used patterns include:

- `dd` - Day of the month (01-31)
- `MM` - Month in year (01-12)
- `yyyy` - Year (e.g., 2024)
- `HH` - Hour in day (00-23)
- `mm` - Minute in hour (00-59)
- `ss` - Second in minute (00-59)
## java.sql.Date
`java.sql.Date` is a class in the Java API that represents a specific instant in time, with millisecond precision, corresponding to SQL `DATE` format. It's a part of the java.sql package, primarily used for database operations where you need to work with dates without time components.

### Features
**Simple Demo :** Demonstrates basic usage of `java.sql.Date`.
**Input Validation :** Validates user input for date values.
**Database Interaction :** Illustrates how `java.sql.Date` can be used in JDBC for database operations.
### Requirements
- Java Development Kit (JDK) 8 or higher.
- Any IDE or text editor for Java development.
- JDBC driver for your database (if you intend to interact with a database).
#### Example 💡
```java
import java.sql.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create a java.sql.Date object representing today's date
        Date today = new Date(System.currentTimeMillis());
        
        // Display today's date
        System.out.println("Today's date: " + today);
        
        // Add 5 days to today's date
        Date futureDate = addDays(today, 5);
        System.out.println("Date after adding 5 days: " + futureDate);
        
        // Subtract 2 months from today's date
        Date pastDate = subtractMonths(today, 2);
        System.out.println("Date after subtracting 2 months: " + pastDate);
        
        // Check if today's date is before a specific date
        Date comparisonDate = Date.valueOf("2024-05-01");
        boolean isBefore = isBefore(today, comparisonDate);
        System.out.println("Is today's date before " + comparisonDate + "? " + isBefore);
    }
    
    // Method to add days to a given date
    private static Date addDays(Date date, int days) {
        LocalDate localDate = date.toLocalDate().plusDays(days);
        return Date.valueOf(localDate);
    }
    
    // Method to subtract months from a given date
    private static Date subtractMonths(Date date, int months) {
        LocalDate localDate = date.toLocalDate().minusMonths(months);
        return Date.valueOf(localDate);
    }
    
    // Method to check if one date is before another date
    private static boolean isBefore(Date date1, Date date2) {
        return date1.before(date2);
    }
}
```
This example demonstrates adding days, subtracting months, and comparing dates using `java.sql.Date`. Note that java.sql.Date extends `java.util.Date`, so you can use all the methods available in `java.util.Date` as well.

### Conclusion  🎉
In conclusion, the java.sql.Date class in Java is a useful tool for handling date values in applications, particularly in scenarios involving database operations. This demonstration showcased its basic functionalities, including creating instances, performing date arithmetic operations, and comparing dates.

Key takeaways from this example include:

**Creation of Date Instances :** You can create java.sql.Date instances representing specific dates or the current system date.

**Date Manipulations :** Operations such as adding days and subtracting months from a date are straightforward using methods like addDays and subtractMonths.

**Date Comparison :** Comparing dates for order can be done easily with methods like isBefore.

By leveraging these features, developers can effectively manage and manipulate date values in Java applications, ensuring accurate and reliable handling of temporal data.
## java.util.Calendar
`java.util.Calendar` is an abstract class in Java that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

### Features
**Date Manipulation :** Allows manipulation of dates and time-related operations.
**Locale-Sensitive :** Calendar computations are locale-sensitive and calendar systems are defined in the `java.util.Locale` class.
**Time Zone Support :** Supports time zone computations and conversions.
**Internationalization :** Provides support for internationalized date and time formats.
### Example 
```java
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Get a Calendar instance based on the current time in the default time zone and locale.
        Calendar calendar = Calendar.getInstance();

        // Get the current date and time
        System.out.println("Current Date and Time: " + calendar.getTime());

        // Set specific date and time fields
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.APRIL);
        calendar.set(Calendar.DAY_OF_MONTH, 8);
        calendar.set(Calendar.HOUR_OF_DAY, 15);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);

        // Get the modified date and time
        System.out.println("Modified Date and Time: " + calendar.getTime());

        // Perform operations like adding or subtracting days
        calendar.add(Calendar.DAY_OF_MONTH, 7);

        // Get the date after adding 7 days
        System.out.println("Date after adding 7 days: " + calendar.getTime());
    }
}
````
### Calender class some operations
### Get Current Date and Time:

```java
Calendar calendar = Calendar.getInstance();
Date currentDate = calendar.getTime();
System.out.println("Current Date and Time: " + currentDate);
```
### Set Specific Date and Time:

```java
calendar.set(Calendar.YEAR, 2024);
calendar.set(Calendar.MONTH, Calendar.APRIL);
calendar.set(Calendar.DAY_OF_MONTH, 8);
calendar.set(Calendar.HOUR_OF_DAY, 15);
calendar.set(Calendar.MINUTE, 30);
calendar.set(Calendar.SECOND, 0);
```
### Add or Subtract Days/Months/Years:

```java
calendar.add(Calendar.DAY_OF_MONTH, 7); // Add 7 days
calendar.add(Calendar.MONTH, -1); // Subtract 1 month
calendar.add(Calendar.YEAR, 2); // Add 2 years
```
### Get Specific Date Components:

```java
int year = calendar.get(Calendar.YEAR);
int month = calendar.get(Calendar.MONTH); // Month starts from 0 (January)
int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
int hour = calendar.get(Calendar.HOUR_OF_DAY);
int minute = calendar.get(Calendar.MINUTE);
int second = calendar.get(Calendar.SECOND);
```
### Get Day of the Week:

```java
int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); // Sunday (1) to Saturday (7)
```
### Compare Dates:

```java
Calendar otherCalendar = Calendar.getInstance();
otherCalendar.set(2024, Calendar.APRIL, 8);
int comparison = calendar.compareTo(otherCalendar);
// comparison < 0 if this calendar is before otherCalendar
// comparison == 0 if this calendar is equal to otherCalendar
// comparison > 0 if this calendar is after otherCalendar
```
### Check for Leap Year:

```java
boolean isLeapYear = calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
```
### Clear Specific Fields:

```java
calendar.clear(Calendar.HOUR_OF_DAY);
```
These are just a few examples of the operations you can perform with java.util.Calendar. Depending on your requirements, you can use these methods to manipulate dates and times in various ways.

## TimeZone specific Date and Time
"TimeZone Specific Date and Time" refers to the representation of date and time information adjusted according to a specific geographical timezone. Timezones are regions of the Earth that have the same standard time. Since the Earth is divided into 24 time zones, each one corresponds to roughly 15 degrees of longitude, with local time being approximately one hour ahead of the previous timezone to the west.

When dealing with time and date information in software applications, it's essential to consider timezones, especially when working with global audiences or handling data from different geographical locations. TimeZone Specific Date and Time involves:

Specifying the Timezone: Identifying the geographical region or offset from Coordinated Universal Time (UTC) where the time and date are relevant. Timezone identifiers like "America/New_York" or "Europe/London" are commonly used.

Converting Timezones: Transforming date and time values from one timezone to another. This is crucial when presenting data to users in different regions or when dealing with data stored in a standardized timezone.

Accounting for Daylight Saving Time (DST): Some timezones observe DST, where the clocks are adjusted forward or backward by one hour during certain periods of the year. Handling DST changes accurately is essential for precise time calculations.

In Java, the java.time package introduced in Java 8 provides robust support for working with `TimeZone` Specific Date and Time through classes like `ZonedDateTime`, `ZoneId`, and `OffsetDateTime`. These classes enable developers to handle timezones, convert between timezones, and perform various date and time operations while considering timezone information.
### Example

Here's a simple example demonstrating how to retrieve the current time and date in a specific timezone:

```java
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneExample {

    public static void main(String[] args) {
        // Specify the timezone
        ZoneId zoneId = ZoneId.of("America/New_York");
        
        // Get the current time in the specified timezone
        ZonedDateTime currentTime = ZonedDateTime.now(zoneId);
        
        // Print the current time
        System.out.println("Current time in New York: " + currentTime);
    }
}
```
## Java 8 Date and Time API
### Introduction
Java 8 introduced a new Date and Time API under the `java.time` package. This new API provides significant improvements over the old `java.util.Date` and `java.util.Calendar` classes, making date and time manipulation easier, more intuitive, and less error-prone.
### Features
### 1. Immutable Classes

The Date and Time API introduces several immutable classes for representing date, time, and datetime values, such as `LocalDate`, `LocalTime`, and `LocalDateTime`. Immutable objects are inherently thread-safe and can simplify code by eliminating concerns about mutability.

### 2. Separation of Concerns

The API clearly separates date, time, and datetime representations, which simplifies development and reduces ambiguity. For example, you can work with just dates (`LocalDate`) or times (`LocalTime`) without needing to deal with both simultaneously.

### 3. Comprehensive API

The API provides a wide range of functionality for manipulating dates, times, and datetime values, including arithmetic operations, formatting and parsing, timezone support, and querying capabilities. Additionally, it offers support for leap years, daylight saving time, and other calendrical calculations.

### 4. Timezone Support

The Date and Time API includes classes such as `ZoneId` and `ZoneOffset` to handle timezones effectively. This makes it easier to work with dates and times in different regions of the world and to convert between different timezone representations.

### 5. Fluent API Design

The API is designed with a fluent and method-chaining style, which makes code more readable and expressive. Operations such as adding or subtracting time intervals, adjusting date and time values, and formatting output can be performed with concise and intuitive syntax.

## Getting Started

To start using the Java 8 Date and Time API in your project, ensure that you are using Java 8 or later, as this API is not available in earlier versions of Java.

You can begin by importing the necessary classes from the `java.time` package into your Java source files:

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
```
Once imported, you can create instances of LocalDate, LocalTime, or LocalDateTime to represent specific dates, times, or datetime values. You can then perform various operations and manipulations using the methods provided by these classes.

Here's a simple example demonstrating how to work with dates and times using the Java 8 Date and Time API:

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Create instances of LocalDate, LocalTime, and LocalDateTime
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Print the current date, time, and datetime
        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current DateTime: " + currentDateTime);

        // Format and print the current datetime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);
    }
}
```

## java.time Date and Time API - `of()` Methods
The `java.time` package in Java provides a powerful API for handling date and time. One of the key features of this API is the `of()` method, which is used to create instances of various date and time objects.

The `of()` method is a static factory method used to create instances of date and time objects in the `java.time` package. It is available in several classes, including `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, `OffsetDateTime`, `OffsetTime`, `Year`, `YearMonth`, `MonthDay`, `Duration`, and `Period`.

### LocalDate

```java
LocalDate date = LocalDate.of(year, month, dayOfMonth);
```

### LocalTime
```java
LocalTime time = LocalTime.of(hour, minute);
```
### LocalDateTime
```java
LocalDateTime dateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute, second);
```
### ZonedDateTime
```java
ZonedDateTime zonedDateTime = ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nano, zoneId);
```
### OffsetDateTime
```java
OffsetDateTime offsetDateTime = OffsetDateTime.of(year, month, dayOfMonth, hour, minute, second, nano, zoneOffset);
```
### OffsetTime
```java
OffsetTime offsetTime = OffsetTime.of(hour, minute, second, nano, zoneOffset);
```
### Year
```java
Year year = Year.of(year);
```
### YearMonth
```java
YearMonth yearMonth = YearMonth.of(year, month);
```
### MonthDay
```java
MonthDay monthDay = MonthDay.of(month, dayOfMonth);
```
### Duration
```java
Duration duration = Duration.ofDays(days).plusHours(hours).plusMinutes(minutes).plusSeconds(seconds).plusNanos(nanos);
```
### Period
```java
Period period = Period.ofYears(years).plusMonths(months).plusDays(days);
```
### Conclusion
The of() methods in the java.time package provide a convenient way to create instances of date and time objects in Java. By using these methods, developers can easily work with dates, times, and durations in their applications.
###  `from()`
```java
LocalDate date = LocalDate.from(temporal);
LocalTime time = LocalTime.from(temporal);
LocalDateTime dateTime = LocalDateTime.from(temporal);
ZonedDateTime zonedDateTime = ZonedDateTime.from(temporal);
OffsetDateTime offsetDateTime = OffsetDateTime.from(temporal);
OffsetTime offsetTime = OffsetTime.from(temporal);
Year year = Year.from(temporal);
YearMonth yearMonth = YearMonth.from(temporal);
MonthDay monthDay = MonthDay.from(temporal);
```
### withXxx()
```java
LocalDate newDate = date.withYear(year);
LocalTime newTime = time.withHour(hour);
LocalDateTime newDateTime = dateTime.withMonth(month);
ZonedDateTime newZonedDateTime = zonedDateTime.withDayOfMonth(dayOfMonth);
OffsetDateTime newOffsetDateTime = offsetDateTime.withHour(hour);
OffsetTime newOffsetTime = offsetTime.withMinute(minute);
Year newYear = year.with(year);
YearMonth newYearMonth = yearMonth.withMonth(month);
MonthDay newMonthDay = monthDay.withDayOfMonth(dayOfMonth);
```
### Conclusion
The `from()` and `withXxx()` methods in the java.time package provide additional flexibility for working with date and time objects in Java. By using these methods, developers can easily obtain instances of date and time objects from existing objects and manipulate their fields as needed.
## toXxx() and atXxx()
The `toXxx()` methods are used to convert date and time objects to other types, while the `atXxx()` methods are used to combine date and time objects with other temporal fields to create new instances.
```java
LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
LocalDate localDate = zonedDateTime.toLocalDate();
LocalTime localTime = zonedDateTime.toLocalTime();
OffsetDateTime offsetDateTime = zonedDateTime.toOffsetDateTime();
OffsetTime offsetTime = zonedDateTime.toOffsetTime();
```
## atXxx()
```java
LocalDateTime newLocalDateTime = localDate.atTime(localTime);
ZonedDateTime newZonedDateTime = localDateTime.atZone(zoneId);
ZonedDateTime newZonedDateTimeWithOffset = localDateTime.atZoneSameInstant(zoneId);
OffsetDateTime newOffsetDateTime = localDateTime.atOffset(offset);
```
### Conclusion
The `toXxx()` and `atXxx()` methods in the java.time package provide additional functionality for converting and combining date and time objects in Java. By using these methods, developers can easily work with different types of date and time representations and perform various temporal operations.

## getXxx(), plusXxx() and minusXxx()
The `getXxx()` methods are used to retrieve specific fields or values from date and time objects. The `plusXxx()` methods are used to add or subtract amounts of time to date and time objects, while the `minusXxx()` methods are used to subtract amounts of time.

### `getXxx()`

```java
int year = localDate.getYear();
Month month = localDate.getMonth();
int dayOfMonth = localDate.getDayOfMonth();
int hour = localTime.getHour();
int minute = localTime.getMinute();
int second = localTime.getSecond();
```

### plusXxx()
```java
LocalDateTime newDateTime = localDateTime.plusDays(daysToAdd);
LocalDateTime newDateTimeWithPeriod = localDateTime.plus(period);
```
### minusXxx()
```java
LocalDateTime newDateTime = localDateTime.minusHours(hoursToSubtract);
LocalDateTime newDateTimeWithDuration = localDateTime.minus(duration);
```
### Conclusion
The `getXxx()`, `plusXxx()`, and `minusXxx()` methods in the java.time package provide additional functionality for working with date and time objects in Java. By using these methods, developers can easily retrieve specific fields, perform arithmetic operations, and manipulate date and time objects according to their requirements.

## Instant

The `Instant` class represents an instantaneous point on the time-line, typically used for converting between representations of the same instant in time. It's a point in time on the time-line, usually represented in UTC time. It's not affected by time zone or daylight saving time changes.

```java
```java
Instant instant = Instant.now(); // Current instant
Instant specificInstant = Instant.ofEpochSecond(epochSecond, nanoAdjustment);
```
## Duration
The Duration class represents a time-based amount of time, such as "15 seconds" or "3 hours and 30 minutes". It can be used to measure the amount of time between two Instant objects.

### Usage
```java
Duration duration = Duration.ofSeconds(seconds);
Duration anotherDuration = Duration.ofMinutes(minutes).plusSeconds(seconds);
```
### Conclusion
The `Instant` and `Duration` classes in the `java.time` package provide essential functionalities for dealing with time-based values in Java. By using these classes, developers can easily work with instants and measure time durations accurately in their applications.
## Period

The `Period` class represents a period of time with date-based values, such as years, months, and days. It can be used to measure the amount of time between two `LocalDate` objects or to manipulate date-based values.

### Usage

```java
Period period = Period.ofYears(years).plusMonths(months).plusDays(days);
Period anotherPeriod = Period.between(startDate, endDate);
```

### Conclusion
The `Period` class in the `java.time` package provides essential functionalities for dealing with date-based periods in Java. By using this class, developers can easily work with date-based values and measure time durations accurately in their applications.

## `multipliedBy()`

The `multipliedBy()` method is used to multiply a time-based value by a scalar factor.

```java
Duration multipliedDuration = duration.multipliedBy(3);
```
## dividedBy()
The dividedBy() method is used to divide a time-based value by a divisor.

```java
Duration dividedDuration = duration.dividedBy(2);
```
## negatedBy()
The negatedBy() method is used to negate a time-based value.

```java
Duration negatedDuration = duration.negated();
```
### Conclusion
The `multipliedBy()`, `dividedBy()`, and `negatedBy()` methods in the java.time package provide additional functionalities for performing arithmetic operations on time-based values in Java. By using these methods, developers can easily manipulate time durations according to their requirements.

## truncatedTo()

The `truncatedTo()` method is used to truncate a time-based value to a specified unit, such as hours, minutes, or seconds.

```java
LocalTime truncatedTime = time.truncatedTo(ChronoUnit.MINUTES);
```
### Conclusion
The `truncatedTo()` method in the `java.time` package provides essential functionality for truncating time-based values to a specified unit in Java. By using this method, developers can easily adjust time values according to their requirements.

## ZoneId

The `ZoneId` class represents a time zone identifier. It can be used to represent a time zone in which rules are used to convert between instant and local date-time.

### Usage

```java
ZoneId zoneId = ZoneId.of("Europe/Paris");
```
## ZonedDateTime
The ZonedDateTime class represents a date-time with a time-zone in the ISO-8601 calendar system, such as "2024-04-09T12:34:56+02:00[Europe/Paris]".

### Usage
```java
ZonedDateTime zonedDateTime = ZonedDateTime.now(); // Current date and time with default time zone
ZonedDateTime specificZonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
```
### Conclusion
The `ZoneId` and `ZonedDateTime` classes in the `java.time` package provide essential functionalities for dealing with time zones in Java. By using these classes, developers can easily work with date-times in different time zones and handle time zone conversions accurately in their applications.

## ZoneOffset

The `ZoneOffset` class represents a time zone offset from Greenwich/UTC, such as "+02:00" or "-05:00".

### Usage

```java
ZoneOffset zoneOffset = ZoneOffset.of("+02:00");
```
### Conclusion
The `ZoneOffset` class in the `java.time` package provides essential functionality for dealing with time zone offsets in Java. By using this class, developers can easily represent and work with time zone offsets accurately in their applications.

## OffsetDateTime

The `OffsetDateTime` class represents a date-time with an offset from UTC/Greenwich, such as "2024-04-09T12:34:56+02:00".

### Usage

```java
OffsetDateTime offsetDateTime = OffsetDateTime.now(); // Current date-time with default offset
OffsetDateTime specificOffsetDateTime = OffsetDateTime.of(localDateTime, zoneOffset);
```
## OffsetTime
The OffsetTime class represents a time with an offset from UTC/Greenwich, such as "12:34:56+02:00".

### Usage
```java
OffsetTime offsetTime = OffsetTime.now(); // Current time with default offset
OffsetTime specificOffsetTime = OffsetTime.of(localTime, zoneOffset);
```
### Conclusion
The OffsetDateTime and OffsetTime classes in the java.time package provide essential functionalities for dealing with date-time and time with offsets in Java. By using these classes, developers can easily work with date-times and times in specific offsets from UTC/Greenwich and handle time zone offsets accurately in their applications.

## Day Light saving with ZonedDateTime
```java
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DaylightSavingDemo {
    public static void main(String[] args) {
        // Define a date-time before daylight saving time starts
        LocalDateTime dateTimeBeforeDST = LocalDateTime.of(2024, 3, 10, 1, 30);
        
        // Define a time zone
        ZoneId zone = ZoneId.of("Europe/Paris");
        
        // Create a ZonedDateTime for the given date-time and time zone
        ZonedDateTime zonedDateTimeBeforeDST = ZonedDateTime.of(dateTimeBeforeDST, zone);
        
        // Display the ZonedDateTime
        System.out.println("ZonedDateTime before daylight saving time: " + zonedDateTimeBeforeDST);
        
        // Define a date-time after daylight saving time starts
        LocalDateTime dateTimeAfterDST = LocalDateTime.of(2024, 3, 10, 3, 30);
        
        // Create a ZonedDateTime for the given date-time and time zone
        ZonedDateTime zonedDateTimeAfterDST = ZonedDateTime.of(dateTimeAfterDST, zone);
        
        // Display the ZonedDateTime
        System.out.println("ZonedDateTime after daylight saving time: " + zonedDateTimeAfterDST);
    }
}
```
In this demo, we create two LocalDateTime objects representing two different times on the day when daylight saving time starts in Paris in 2024: one just before the clock moves forward and one just after. Then, we create ZonedDateTime objects using these LocalDateTime instances and the time zone Europe/Paris. Finally, we print out these ZonedDateTime instances.

When you run this demo, you'll observe that the output shows the difference in the offset due to daylight saving time:

```java
ZonedDateTime before daylight saving time: 2024-03-10T01:30+01:00[Europe/Paris]
ZonedDateTime after daylight saving time: 2024-03-10T03:30+02:00[Europe/Paris]
```
You can see that the offset changes from +01:00 to +02:00 when daylight saving time starts. This demonstrates how ZonedDateTime handles daylight saving time transitions automatically according to the specified time zone.

Java's java.time API primarily focuses on the ISO calendar system, but it does provide support for other calendar systems through the java.time.chrono package. While the ISO calendar is widely used and recommended, other calendars such as the Hijrah (Islamic) calendar and the Japanese calendar are supported for specific use cases.

Here's a brief overview of how you can work with non-ISO calendars in the java.time Date and Time API:

Hijrah (Islamic) Calendar: You can work with the Hijrah calendar using the HijrahChronology class. This calendar is used primarily in Islamic countries and calculates dates based on lunar cycles.

Japanese Calendar: The Japanese calendar is supported through the JapaneseChronology class. It is used in Japan and counts years based on the reigns of Japanese emperors.

Here's a simple example demonstrating how to work with the Hijrah calendar:

java
Copy code
import java.time.LocalDate;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;

public class NonISOCalendarDemo {
    public static void main(String[] args) {
        // Create a LocalDate in the Hijrah calendar
        LocalDate hijrahDate = LocalDate.of(1443, 8, 15); // Hijrah year 1443, Shawwal month, 15th day
        
        // Convert to HijrahDate
        HijrahDate hijrahDateConverted = HijrahChronology.INSTANCE.date(hijrahDate);
        
        // Format and display the Hijrah date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Hijrah Date: " + formatter.format(hijrahDateConverted));
    }
}
This example creates a LocalDate object representing a date in the Hijrah calendar, converts it to a HijrahDate using HijrahChronology.INSTANCE, and then formats and displays the date.

Similarly, you can work with the Japanese calendar by using JapaneseChronology in a similar manner.

Keep in mind that support for non-ISO calendars may vary depending on the version of Java you're using, so be sure to consult the documentation for the specific version you're working with.

## Formatting Dates and Times using DateTimeFormatter

Formatting dates and times using the DateTimeFormatter class in Java allows you to represent date and time objects in various formats, such as "yyyy-MM-dd HH:mm:ss" or "MMM dd, yyyy hh:mm a".

Here's a basic example demonstrating how to format dates and times using DateTimeFormatter:

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingDemo {
    public static void main(String[] args) {
        // Create a LocalDateTime object representing the current date and time
        LocalDateTime dateTime = LocalDateTime.now();

        // Define a custom date and time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the LocalDateTime object using the formatter
        String formattedDateTime = dateTime.format(formatter);

        // Display the formatted date and time
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
```
In this example:

We create a LocalDateTime object representing the current date and time.
We define a custom date and time format using the DateTimeFormatter.ofPattern() method. In this case, "yyyy-MM-dd HH:mm:ss" represents the format "year-month-day hour:minute:second".
We format the LocalDateTime object using the defined formatter with the format() method.
Finally, we print out the formatted date and time.
Output:

```sql
Formatted Date and Time: 2024-04-10 15:30:45
```
You can create various formats by adjusting the pattern string passed to ofPattern(). Here are some commonly used pattern letters:


- `y`: year
- `M`: month
- `d`: day of month
- `H`: hour (0-23)
- `m`: minute
- `s`: second
- `a`: AM/PM marker
## Parsing dates and times using the DateTimeFormatter

Parsing dates and times in Java using the DateTimeFormatter class allows you to convert textual representations of dates and times into LocalDate, LocalTime, LocalDateTime, or other date/time types provided by the java.time package.

Here's a basic example demonstrating how to parse dates and times using DateTimeFormatter:

```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingDemo {
    public static void main(String[] args) {
        // Define a date string in a specific format
        String dateString = "2024-04-10";

        // Define a custom date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the date string using the formatter
        LocalDate date = LocalDate.parse(dateString, formatter);

        // Display the parsed date
        System.out.println("Parsed Date: " + date);
    }
}
```
In this example:

We define a date string "2024-04-10" in the format "yyyy-MM-dd".
We define a custom date format using the DateTimeFormatter.ofPattern() method.
We parse the date string using the defined formatter with the parse() method, which returns a LocalDate object.
Finally, we print out the parsed date.
Output:

```yaml
Parsed Date: 2024-04-10
```

You can similarly parse time strings or combined date-time strings by using LocalTime.parse() or LocalDateTime.parse(), respectively. Just make sure the pattern in the DateTimeFormatter matches the format of the string you are trying to parse.

If the input string does not match the specified format, a DateTimeParseException will be thrown. You can handle this exception using standard Java exception handling mechanisms.
