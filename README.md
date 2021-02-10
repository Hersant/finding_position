# Overview
This repository provides simple code and test to determine the position of a robot at a specific step.

# Description
• Stage 0 : First, get away from obstacles by setting up the starting point at position 0

• Stage 1 : Take one step forward (+1 step)

• Stage 2 : Take two steps backward (-2 steps)

• To follow, the steps as well as the direction the robot will have to take in its next move will each time be obtained thanks to a specific calculation: the number of steps it took on the previous stage minus the number of steps it took on the penultimate stage.

That is, on stage 3, the robot will have to take 3 steps backwards (-2 - 1).


