// Array are linear collection of some values which uses indices (generally integers) to access the values

//In javascript arrays are not actually arrays they are special object types. Where indices are object properties and are converted to strings internally.


//Their are several ways to create arrays in js:-

let arr = [];
console.log(arr.length);    //Prints 0
//Creates an empty array

//Declaring by giving some values (Unlike some other languages js arrays can hold multiple types of data).

let arr1 = [1, 2, "Hello", 4];
console.log(arr1.length);   //Prints 4

//Using the Array constructor.

let arr2 = new Array(); //Empty array
let arr3 = new Array(1, 2, 3, 4);   //Creates [1, 2, 3, 4]
let arr4 = new Array(10);   //Creates array of length 10

//You can check that a variable is an array by using Array.isArray() method
let a = 10;
console.log(Array.isArray(arr3));   //true
console.log(Array.isArray(a));      //false


/*
=========================================
Shallow Copy vs Deep Copy (JavaScript)
=========================================

Reference Copy (=)
------------------
- Objects and arrays are copied by reference.
- Both variables point to the same object.

Example:
const obj2 = obj1;

-----------------------------------------

Shallow Copy
------------
Definition:
- Creates a new outer object.
- Nested objects/arrays are NOT copied (they are shared).

Methods:
- { ...obj }
- Object.assign({}, obj)
- [...arr] (for arrays)

Example:
const copy = { ...user };

Result:
copy.address.city = "Mumbai";
// user.address.city also becomes "Mumbai"

-----------------------------------------

Deep Copy
---------
Definition:
- Creates a completely independent copy.
- Copies all nested objects and arrays.

Method:
const copy = structuredClone(obj);

Result:
copy.address.city = "Mumbai";
// user.address.city remains unchanged

-----------------------------------------

Difference
----------

Shallow Copy
✔ New outer object
✖ Nested objects are shared
✖ Changes to nested data affect original

Deep Copy
-New outer object
-New nested objects
-Changes do NOT affect original


Remember
--------
=                    -> Reference Copy
... / Object.assign  -> Shallow Copy
structuredClone()    -> Deep Copy
*/
