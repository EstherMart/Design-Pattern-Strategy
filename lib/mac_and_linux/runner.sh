#!/bin/bash

java -cp bin JogoRPG

if [ $? -eq 0 ]; then
  echo "Execução bem-sucedida!"
else
  echo "Erro durante a execução."
  exit 1
fi
