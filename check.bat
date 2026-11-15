@echo off
set CP=bin;lib\antlr-4.13.2-complete.jar

echo ################ HTML ################
for %%f in (test-files\templates\*.html test-files\html-extra\coverage.html) do java -cp %CP% Main html %%f

echo ################ CSS ################
java -cp %CP% Main css test-files\static\css\style.css

echo ################ SPRING JAVA ################
java -cp %CP% Main spring test-files\java\com\example\shop\model\Product.java
java -cp %CP% Main spring test-files\java\com\example\shop\controller\ProductController.java

echo ################ THYMELEAF ################
for %%f in (test-files\templates\*.html) do java -cp %CP% Main thymeleaf %%f