# alife-simulation-robert-and-linh
alife-simulation-robert-and-linh created by GitHub Classroom

# Predictions:
For population size 10, 1 cooperator/9 defectors:
We predict that the 1 cooperator since having slower time to have enough
energy to reproduce in addition to being the minority, it is highly
possible that one cooperator after 100 cycles would diminish and all 10
organisms would be defectors.

For population size 10, 9 cooperator/1 defectors:
Even being in the majority, cooperators take much longer to reproduce and
since there are 9 cooperators, the energy each updates one defectors
receives are huge. We also predict that there is a high chance that
defectors will be in the majority instead of vanishing.

For population size 10, 3 cooperators/3 defectors/3 partial cooperators
Cooperators are still in a disadvantage, so we predict there is a high
probability of partial cooperators and defectors while cooperators would
still be in the minority

For population size 100, 1 cooperator/99 defectors:
Same as 10 organisms in total, We predict that the 1 cooperator since
having slower time to have enough energy to reproduce in addition to being
the minority, it is likely that one cooperator after 100 cycles
would diminish and all 100 organisms would be defectors.

For population size 100, 99 cooperator/1 defectors:
Being in the vast majority with the number 99 times the number of
defectors, we predict cooperators would be able to replace the sole
defectors and take over all 100 organisms

For population size 100, 33 cooperators/33 defectors/34 partial cooperators
Similar to when the population was 10, Cooperators are still in a
disadvantage, so we predict there is a high probability of partial
cooperators and defectors while cooperators would still be in the minority

# Experiment Results

//Seed 10

kilburn src$ java ALifeSim 100 9 1 0
After 100 ticks
Cooperators = 10
Defectors = 0
PartialCooperators = 0
Mean Cooperation Probability = 1.000000

kilburn src$ java ALifeSim 100 1 9 0
After 100 ticks
Cooperators = 0
Defectors = 10
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

kilburn src$ java ALifeSim 100 3 3 4
After 100 ticks
Cooperators = 0
Defectors = 10
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

kilburn src$ java ALifeSim 100 1 99 0
After 100 ticks
Cooperators = 0
Defectors = 100
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

kilburn src$ java ALifeSim 100 99 1 0
After 100 ticks
Cooperators = 100
Defectors = 0
PartialCooperators = 0
Mean Cooperation Probability = 1.000000

kilburn src$ java ALifeSim 100 33 33 34
After 100 ticks
Cooperators = 0
Defectors = 70
PartialCooperators = 30
Mean Cooperation Probability = 0.150000

//Seed 11
blanch src$ java ALifeSim 100 9 1 0
After 100 ticks
Cooperators = 0
Defectors = 10
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

blanch src$ java ALifeSim 100 1 9 0
After 100 ticks
Cooperators = 0
Defectors = 10
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

blanch src$ java ALifeSim 100 3 3 4
After 100 ticks
Cooperators = 0
Defectors = 0
PartialCooperators = 10
Mean Cooperation Probability = 0.500000

After 100 ticks
blanch src$ java ALifeSim 100 99 1 0
Cooperators = 100
Defectors = 0
PartialCooperators = 0
Mean Cooperation Probability = 1.000000

blanch src$ java ALifeSim 100 1 99 0
After 100 ticks
Cooperators = 0
Defectors = 100
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

blanch src$ java ALifeSim 100 33 33 34
After 100 ticks
Cooperators = 0
Defectors = 38
PartialCooperators = 62
Mean Cooperation Probability = 0.310000

//seed12
blanch src$ java ALifeSim 100 9 1 0
After 100 ticks
Cooperators = 10
Defectors = 0
PartialCooperators = 0
Mean Cooperation Probability = 1.000000

blanch src$ java ALifeSim 100 1 9 0
After 100 ticks
Cooperators = 0
Defectors = 10
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

blanch src$ java ALifeSim 100 3 3 4
After 100 ticks
Cooperators = 0
Defectors = 3
PartialCooperators = 7
Mean Cooperation Probability = 0.350000

blanch src$ java ALifeSim 100 99 1 0
After 100 ticks
Cooperators = 100
Defectors = 0
PartialCooperators = 0
Mean Cooperation Probability = 1.000000

blanch src$ java ALifeSim 100 1 99 0
After 100 ticks
Cooperators = 0
Defectors = 100
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

blanch src$ java ALifeSim 100 33 33 34
After 100 ticks
Cooperators = 0
Defectors = 47
PartialCooperators = 53
Mean Cooperation Probability = 0.265000

//Seed 13
blanch src$ java ALifeSim 100 9 1 0
After 100 ticks
Cooperators = 0
Defectors = 10
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

blanch src$ java ALifeSim 100 1 9 0
After 100 ticks
Cooperators = 0
Defectors = 10
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

blanch src$ java ALifeSim 100 3 3 4
After 100 ticks
Cooperators = 0
Defectors = 0
PartialCooperators = 10
Mean Cooperation Probability = 0.500000

blanch src$ java ALifeSim 100 1 99 0
After 100 ticks
Cooperators = 0
Defectors = 100
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

blanch src$ java ALifeSim 100 99 1 0
After 100 ticks
Cooperators = 100
Defectors = 0
PartialCooperators = 0
Mean Cooperation Probability = 1.000000

blanch src$ java ALifeSim 100 33 33 34
After 100 ticks
Cooperators = 0
Defectors = 54
PartialCooperators = 46
Mean Cooperation Probability = 0.230000

//Seed 14

blanch src$ java ALifeSim 100 9 1 0
After 100 ticks
Cooperators = 10
Defectors = 0
PartialCooperators = 0
Mean Cooperation Probability = 1.000000

blanch src$ java ALifeSim 100 1 9 0
After 100 ticks
Cooperators = 0
Defectors = 10
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

blanch src$ java ALifeSim 100 3 3 4
After 100 ticks
Cooperators = 0
Defectors = 0
PartialCooperators = 10
Mean Cooperation Probability = 0.500000

blanch src$ java ALifeSim 100 99 1 0
After 100 ticks
Cooperators = 100
Defectors = 0
PartialCooperators = 0
Mean Cooperation Probability = 1.000000


blanch src$ java ALifeSim 100 1 99 0
After 100 ticks
Cooperators = 0
Defectors = 100
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

blanch src$ java ALifeSim 100 33 33 34
After 100 ticks
Cooperators = 0
Defectors = 44
PartialCooperators = 56
Mean Cooperation Probability = 0.280000

//Seed 15

blanch src$ java ALifeSim 100 9 1 0
After 100 ticks
Cooperators = 0
Defectors = 10
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

blanch src$ java ALifeSim 100 1 9 0
After 100 ticks
Cooperators = 0
Defectors = 10
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

blanch src$ java ALifeSim 100 3 3 4
After 100 ticks
Cooperators = 0
Defectors = 0
PartialCooperators = 10
Mean Cooperation Probability = 0.500000

blanch src$ java ALifeSim 100 1 99 0
After 100 ticks
Cooperators = 0
Defectors = 100
PartialCooperators = 0
Mean Cooperation Probability = 0.000000

blanch src$ java ALifeSim 100 99 1 0
After 100 ticks
Cooperators = 100
Defectors = 0
PartialCooperators = 0
Mean Cooperation Probability = 1.000000

blanch src$ java ALifeSim 100 33 33 34
After 100 ticks
Cooperators = 0
Defectors = 89
PartialCooperators = 11
Mean Cooperation Probability = 0.05500

//Discussion
The results support our predictions through 10 different seeds and in total
60 experiments
For population size 10, 1 cooperator/9 defectors:
    The experiments all show that after 100 cycles, 9 defectors take over
    and replace the only cooperator. All attempts end with 10 defectors

For population size 10, 9 cooperator/1 defectors:
    It turns out that the chance that all defectors take over or all
    cooperators take over are roughly equal. The randomized process and a
    small number of organisms make it easier for the cooperators to replace
    the only defectors despite taking longer to reproduce


For population size 10, 3 cooperators/3 defectors/3 partial cooperators
    It is expected that after 100 cycles only defectors and partial
    cooperators remain. However it's worth noting that there seems to be a
    slightly bigger number of partial cooperators in every run (except for
    1 experiment where every organism remains are defectors).

For population size 100, 1 cooperator/99 defectors:
    Same as size 10, as expected the only cooperator diminished and there
    are 100 defectors after 100 ticks

For population size 100, 99 cooperator/1 defectors:
    Also the results here support our prediction. 99 cooperators were able
    to take over and for every experiment at the end there are 100 cooperators

For population size 100, 33 cooperators/33 defectors/34 partial cooperators
    Similar to when the population was 10, only defectors and partial
    cooperators remain. Number of cooperators and defectors are pretty
    similar throughout all experiments

CONCLUSION:

Due to the nature of Cooperator (giving away one energy while increasing
energy of 8 other random organisms), it is clear that Cooperator is the
most difficult to survive. Defectors on the other hand only receive energy
and take much faster to reproduce and replace other
organisms. Partial-cooperators have the advantages and disadvantages of
both types, therefore also having a big chance of survivor.
