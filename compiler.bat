@echo off
REM Cria a pasta bin se não existir
if not exist bin mkdir bin

REM Compila os arquivos de src/entities/abstracts/
javac -d bin src\entities\Comportamento.java

REM Compila os arquivos de src/entities/concrets/
javac -d bin src\entities\ComportamentoAtacar.java
javac -d bin src\entities\ComportamentoDefender.java
javac -d bin src\entities\ComportamentoFugir.java
javac -d bin src\entities\ComportamentoExplorar.java
javac -d bin src\entities\ComportamentoInteragir.java
javac -d bin src\entities\Personagem.java

REM Compila o arquivo JogoRPG.java
javac -d bin src\JogoRPG.java

REM Verifica se a compilação foi bem-sucedida
if %ERRORLEVEL% EQU 0 (
    echo Compilação bem-sucedida!
) else (
    echo Erro durante a compilação.
    exit /b 1
)