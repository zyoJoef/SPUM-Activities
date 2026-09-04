# Activity

<h2>Questions and Exercises: Interfaces</h2>

<h2>Questions</h2>
<ul>
  <li>What methods would a class that implements the java.lang.CharSequence interface have to implement?</li>
  <li>What is wrong with the following interface?</li>
</ul>

<pre>
  <code>
    public interface SomethingIsWrong {
    void aMethod(int aValue){
        System.out.println("Hi Mom");
    }
}
  </code>
</pre>



<h2>Fix the interface in Question 2. Is the following interface valid?</h2>
<ul>
  <li>public interface Marker </li>
</ul>

<pre>
  <code>
    public interface SomethingIsWrong {
    void aMethod(int aValue){
        System.out.println("Hi Mom");
    }
}
  </code>
</pre>



<h2>Exercises</h2>
<ul>
  <li>Write a class that implements the CharSequence interface found in the java.lang package</li>
  <li>Your implementation should return the string backwards. Select one of the sentences from this book to use as the data. Write a small main method to test your class; make sure to call all four methods</li>
  <li>Suppose you have written a time server that periodically notifies its clients of the current date and time. Write an interface the server could use to enforce a particular protocol on its clients</li>
</ul>
