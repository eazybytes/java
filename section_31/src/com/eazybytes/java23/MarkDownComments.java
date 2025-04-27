package com.eazybytes.java23;

/// **This class contains methods for performing basic math operations**
/// @author EazyBytes
 /// @version 1.0
public class MarkDownComments {

    /// | Input | Output |
    /// |-------|-------|
    /// | 2,3     | 5 |
    /// | 9,2     | 11  |
    /// | 25,75     | 100 |
    /// **This method adds two numbers**
    /// @param a first number
    /// @param b second number
    /// @return sum of the two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    /// # This method subtract two numbers
    ///   - 5,3 = 2
    ///   - 9,2 = 7
    /// @param a first number
     /// @param b second number
     /// @return ***subtraction of the two numbers***
    public static int subtract(int a, int b) {
        return a - b;
    }

    ///  ---
    /// # This method multiply two numbers
    /// @param a first number
     /// @param b second number
     /// @return ***multiplication of the two numbers***
    public static int multiply(int a, int b) {
        return a * b;
    }

    /// # This method divide two numbers
    /// ```
     /// @Override
     /// public void division() ...
     /// ```
    /// @param a first number
     /// @param b second number
     /// @return ***division of the two numbers***
    public static int division(int a, int b) {
        return a / b;
    }

    /// Returns a hash code value for the object. This method is
    /// supported for the benefit of hash tables such as those provided by
    /// [java.util.HashMap].
    ///
    /// The general contract of `hashCode` is:
    ///
    ///   - Whenever it is invoked on the same object more than once during
    ///     an execution of a Java application, the `hashCode` method
    ///     must consistently return the same integer, provided no information
    ///     used in `equals` comparisons on the object is modified.
    ///     This integer need not remain consistent from one execution of an
    ///     application to another execution of the same application.
    ///   - If two objects are equal according to the
    ///     [equals][#equals(Object)] method, then calling the
    ///     `hashCode` method on each of the two objects must produce the
    ///     same integer result.
    ///   - It is _not_ required that if two objects are unequal
    ///     according to the [equals][#equals(Object)] method, then
    ///     calling the `hashCode` method on each of the two objects
    ///     must produce distinct integer results.  However, the programmer
    ///     should be aware that producing distinct integer results for
    ///     unequal objects may improve the performance of hash tables.
    ///
    /// @implSpec
     /// As far as is reasonably practical, the `hashCode` method defined
     /// by class `Object` returns distinct integers for distinct objects.
     ///
     /// @return a hash code value for this object.
     /// @see     java.lang.Object#equals(java.lang.Object)
     /// @see     java.lang.System#identityHashCode
    public native int hashCode();

}
