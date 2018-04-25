
@set /p fileName=enter fileName for compile: 

:echo %fileName%

:pause

javac %fileName%.java 
pause

java %fileName%
pause