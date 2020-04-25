
In a hypothetical theater:
Here, a person is a thread, a play is a resource.

It is called Mutex
    if only one person is allowed to watch the play.
    
It is called Semaphore
    if N number of people are allowed to watch the play.
    If anybody leaves the Theater during the play then other person can be allowed to watch the play.

It is called CountDownLatch
    if no one is allowed to enter until every person vacates the theater.
    Here each person has free will to leave the theater.

It is called CyclicBarrier
    if the play will not start until every person enters the theater.
    Here a showman can not start the show until all the persons enter and grab the seat.
    Once the play is finished the same barrier will be applied for next show.

