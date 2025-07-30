#!/bin/bash
#Inicializa a exibição
Xvfb :99 -screen 0 1024x768x24 > /dev/null 2>&1 &
export DISPLAY=:99

#Execução
mvn exec:java -Dexec.args="file.txt"

#Limpeza dos dados
killall Xvfb