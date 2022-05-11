package JavaPractice;

public class a12_whyStringImmutable {

    public static void main(String[] args) {

        /* Why String is Immutable and final in Java?
Why String is Immutable and Final?:

There is hardly any Java Interview, where no questions are asked from String, and Why String is Immutable in Java is I think most popular one. This question is also asked as Why String class is made final in Java or simply, Why String is final. In order to answer these questions, Java programmer must have a solid understanding of How String works, what are special features of this class and some key fundamentals.

5 Reasons of Why String is final or Immutable in Java:

1) String Pool
Java designer knows that String is going to be most used data type in all kind of Java applications and that's why they wanted to optimize from  start.
One of key step on that direction was idea of storing String literals in String pool. Goal was to reduce temporary String object by sharing them and in order to share,
they must have to be from Immutable class. You can not share a mutable object with two parties which are unknown to each other. Let's take an hypothetical example, where
two reference variable is pointing to same String object:

String s1 = "Java";
String s2 = "Java";

Now if s1 changes the object from "Java" to "C++", reference variable also got value s2="C++", which it doesn't even know about it. By making String immutable, this sharing
of String literal was possible. In short, key idea of String pool can not be implemented without making String final or Immutable in Java.

2) Security:
Java has clear goal in terms of providing a secure environment at every level of service and String is critical in those whole security stuff. String has been widely used as
 parameter for many Java classes, e.g. for opening network connection, you can pass host and port as String, for reading files in Java you can pass path of files and directory as
 String and for opening database connection, you can pass database URL as String. If String was not immutable, a user might have granted to access a particular file in system, but
 after authentication he can change the PATH to something else, this could cause serious security issues. Similarly, while connecting to database or any other machine in network,
 mutating String value can pose security threats. Mutable strings could also cause security problem in Reflection as well, as the parameters are strings.


3) Use of String in Class Loading Mechanism
Another reason for making String final or Immutable was driven by the fact that it was heavily used in class loading mechanism. As String been not Immutable, an attacker can take
advantage of this fact and a request to load standard Java classes e.g. java.io.Reader can be changed to malicious class com.unknown.DataStolenReader. By keeping String final and immutable,
 we can at least be sure that JVM is loading correct classes.

4) Multithreading Benefits
Since Concurrency and Multi-threading was Java's key offering, it made lot of sense to think about thread-safety of String objects. Since it was expected that String will be used widely,
making it Immutable means no external synchronization, means much cleaner code involving sharing of String between multiple threads. This single feature, makes already complicate, confusing
and error prone concurrency coding much easier. Because String is immutable and we just share it between threads, it result in more readable code.


5) Optimization and Performance
Now when you make a class Immutable, you know in advance that, this class is not going to change once created. This guarantee open path for many performance optimization e.g. caching. String
itself know that, I am not going to change, so String cache its hashcode. It even calculate hashcode lazily and once created, just cache it. In simple world, when you first call hashCode() method
 of any String object, it calculate hash code and all subsequent call to hashCode() returns already calculated, cached value. This results in good performance gain, given String is heavily used in
 hash based Maps e.g. Hashtable and HashMap. Caching of hashcode was not possible without making it immutable and final, as it depends upon content of String itself.

         */


    }
}
