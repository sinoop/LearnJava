
    - object level lock
    - read write lock
        -
    - trylock
    - reentrant lock



How would you identify deadlock while coding ?
  - Always have timeouts for any lock
  - Always follow the order which use used the locking for unlocking
    - Account number - use lower number for identifying
  - Thread dump
    - Analyze to identify the conditions where the deadlock is happening
    - JVisualMap , JStats
