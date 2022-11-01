# ClassMonitor
The mobile-based application pops-up a message on the phone of class representative (class
rep) when the class of a given course unit begins and when it ends. The pop-up should only
be during the time schedule as provided in the timetable. The first pop-up message finds out
whether the class will be there, by the lecturer. If answered yes, the next pop-up should come
exactly after five minutes to find out whether the teaching has started. If answered not, then it
should pop-up again exactly after every double minute of the previous pop-up time. If
answered yes, then it should request for the starting time (system time – maximum of elapsed
minutes of the last alert). The last pop-up message occurs 20 minutes before the official
ending of the session as per the timetable to find out whether teaching has ended if the class
was there anyway. If answered no, the next pop-up should come exactly after five minutes to
find out whether the teaching has ended. If answered no, then it should pop-up again exactly
after every double minute of the previous pop-up time. If answered yes, then it should request
for the end time (system time – maximum of elapsed minutes of the last alert).
