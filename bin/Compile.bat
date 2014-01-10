@echo off
::run pre-compiled program
java cds/TestToll < input_01.txt > myOutPut_01.out
java cds/TestToll < input_02.txt > myOutPut_02.out
java cds/TestToll < input_03.txt > myOutPut_03.out

::print errors
fc outPut_01.txt myOutPut_01.out > errors/errors_myOutPut_01.txt
fc outPut_02.txt myOutPut_02.out > errors/errors_myOutPut_02.txt
fc outPut_02.txt myOutPut_03.out > errors/errors_myOutPut_03.txt