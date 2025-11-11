package ClollectionsClass;
/*Collection: The root interface, representing a group of objects.
*List ->Duplicate elements are allowed, maintain insertion order and has index (e.g., ArrayList, LinkedList).
ArrayList
Resizable Array: Implements the List interface, backed by a dynamic array.
Ordered (Insertion Order): Elements maintain their insertion order.
Allows Duplicates: Can store multiple identical elements.
Allows Nulls: Can store null values.
Fast Random Access: get(index) operations are efficient (O(1)).
Slow Insertions/Deletions (Middle): Adding or removing elements in the middle requires shifting subsequent elements (O(n)).
LinkedList
Doubly Linked List: Implements the List and Deque interfaces, consisting of nodes linked to previous and next nodes.
Ordered (Insertion Order): Elements maintain their insertion order.
Allows Duplicates: Can store multiple identical elements.
Allows Nulls: Can store null values.
Fast Insertions/Deletions (Ends and Middle): Adding or removing elements is efficient (O(1)) once the position is found.
Slow Random Access: Retrieving elements by index requires traversing the list (O(n))

*Set -->Duplicate elements are not allowed, does not maintain insertion order and has no index (e.g., HashSet, TreeSet).
HashSet
Unordered Set: Implements the Set interface, backed by a HashMap.
No Duplicates: Automatically prevents duplicate elements.
No Guaranteed Order: Does not maintain insertion order or any other specific order.
Allows one Null: Can store one null value.
Uses Hashing: Relies on the hashCode() and equals() methods of elements for storage and retrieval.
LinkedHashSet
Maintain insertion order and no duplicate elements,
TreeSet
Sorted Set: Implements the SortedSet interface, backed by a TreeMap.
No Duplicates: Automatically prevents duplicate elements.
Sorted Order: Elements are stored and retrieved in ascending natural order or according to a provided Comparator.
Does not Allow Nulls: Cannot store null values (unless a custom Comparator explicitly handles it).
Uses Red-Black Tree: Internally uses a self-balancing binary search tree.

*Map ->Stores key-value pairs, where keys are unique (e.g., HashMap, TreeMap).
HashMap
Unordered Map: Implements the Map interface.
Stores Key-Value Pairs: Maps unique keys to values.
No Guaranteed Order: Does not maintain insertion order or any other specific order.
Allows one Null Key and multiple Null Values: Can have one null key and multiple null values.
Uses Hashing: Relies on hashCode() and equals() of keys for efficient operations.
TreeMap
Sorted Map: Implements the SortedMap interface.
Stores Key-Value Pairs: Maps unique keys to values.
Sorted Order: Keys are stored and retrieved in ascending natural order or according to a provided Comparator.
Does not Allow Null Keys: Cannot store null keys (unless a custom Comparator explicitly handles it).
Uses Red-Black Tree: Internally uses a self-balancing binary search tree.

*Queue ->Duplicate elements are allowed, does not maintain insertion order and has no index often
* following FIFO (First-In-First-Out) order (e.g., PriorityQueue)
PriorityQueue
Priority-Based Queue: Implements the Queue interface.
Ordered by Priority: Elements are ordered based on their natural ordering (implementing Comparable) or a custom Comparator. The "highest priority" element is at the head.
Allows Duplicates: Can store multiple identical elements.
Does not Allow Nulls: Cannot store null values.
Heap-Based: Internally uses a min-heap (by default) to efficiently manage priorities.*/
//Set: Hashset, LinkedHashset and TreeSet cant retrieve element by index, so do not have get() method.
//Queue also cant retrieve element by index, also do not have get() method
//List: Arraylist and Linked-list can retrieve elements by index, so get() very useful.


public class ListSetQueueClass {

}
