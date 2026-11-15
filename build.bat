@echo off
set JAR=lib\antlr-4.13.2-complete.jar

if exist bin rmdir /s /q bin
mkdir bin

echo === 1/2  ANTLR: generating Lexer/Parser classes ===
call :gen html HTMLLexer HTMLParser
call :gen springjava SpringJavaLexer SpringJavaParser
call :gen css CssLexer CssParser
call :gen thymeleaf ThymeleafLexer ThymeleafParser

echo.
echo === 2/2  javac: compiling all .java files into bin ===
javac -encoding UTF-8 -cp %JAR% -d bin src\*.java src\html\*.java src\springjava\*.java src\css\*.java src\thymeleaf\*.java
if errorlevel 1 goto failed
echo.
echo BUILD OK
goto :eof

:failed
echo.
echo BUILD FAILED - read the FIRST error above (usually an ANTLR error in a .g4 file)
exit /b 1

:gen
pushd src\%1
del /q *Visitor.java *Listener.java 2>nul
java -jar ..\..\%JAR% -Dlanguage=Java -package %1 -no-listener -no-visitor %2.g4 %3.g4
popd
exit /b