# Only_Duo
##### Brandon Zhang, Jason Lam 
##### Period 5
Methods we chose to implement:
- addFirst(E e)
- addLast(E e)
- removeFirst()
- removeLast()
- peekFirst()
- peekLast()
- toString()

We chose to use an arraylist instead of doubly linked lists because doubly linked lists use a lot more memory. The decision to be made between doubly linked lists and arraylists is of one between runtimes and space. The runtimes of a queue using doubly linked lists would be O(1) whether one is removing or adding to the queue from either direction, which is superior to one that uses arraylists, which would be O(n) when new elements being added forces the all the items to shift. However, doubly linked lists would need to use much more memory for the separate nodes and the pointers that have to be created. In this tradeoff between memory and runtime, we chose to use arraylists.
