@echo off

:: Define the base project path
set PROJECT_PATH=logistic\src\main\java\com\abhishek\logistic

:: Create the required packages
mkdir %PROJECT_PATH%\entity
mkdir %PROJECT_PATH%\dto
mkdir %PROJECT_PATH%\dto\mappers
mkdir %PROJECT_PATH%\repository
mkdir %PROJECT_PATH%\service
mkdir %PROJECT_PATH%\controller
mkdir %PROJECT_PATH%\kafka
mkdir %PROJECT_PATH%\utility

echo Packages created successfully!
pause
