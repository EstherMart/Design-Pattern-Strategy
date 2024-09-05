#!/bin/bash

# Cria a pasta bin se não existir
if [ ! -d "bin" ]; then
  mkdir bin
fi

javac -d bin src/entities/*.java
javac -d bin src/JogoRPG.java

if [ $? -eq 0 ]; then
  echo "Compilação bem-sucedida!"
else
  echo "Erro durante a compilação."
  exit 1
fi
