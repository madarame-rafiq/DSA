package Day3;

public class StringsInJava {
    public static void main(String[] args) {
        //Declaration.
        String name = "Rafiq Mansuri";
        System.out.println(name);

        // Here->
        // the varibale name is stored in stack and "Rafiq Mansuri" is stored in heap
        // and the variable name points to the "Rafiq mansuri" in heap

        // Now what if
        String subject = "Physics";
        String anotherSubject = "Physics";

        // The question is will their will be 2 "Physics" string in heap or only 1 and both varibales will point to the single string?
        
        // Actually in heap we have a special type of memory called string pool, For strings
        // Why?
        //Because same strings are not created again and again.
        //Both subject and anotherSubject will point to the same object in heap "Physics".
        
        //Okay but what if we do this:
        anotherSubject = "Biology";

        //Will this change the value of subject as well?
        //The answer is no
        System.out.println(subject);    //Physics
        //Because in Java strings are immutable when u set anotherSubject = "Biology" in heap it actually created a new object "Biology" and started to point to it.

        anotherSubject = "Physics";
        //== actually checks the address of the strings.
        System.out.println(subject == anotherSubject);

        //So now if you try to give a string a already existing value it will automatically point to the already existing object, But
        // What if you dont want to point to the same object want to create a new one
        // Then you use "new" keyword it creates the string object in heap outside of the string pool (the special memory for strings)
        String instructor = new String("Kunal Kushwaha");
        String youtuber = new String("Kunal Kushwaha");

        // now if we do
        System.out.println(instructor == youtuber);
        //It will print false because they are pointing to different objects in memory.
        System.out.println(instructor.equals(youtuber));
        //This will print true becasue even they are pointing to different objects but their values are same.

    }
}
