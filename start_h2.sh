#!/bin/bash

H2_JAR=/home/claudemir/.m2/repository/com/h2database/h2/2.1.214/h2-2.1.214.jar
DB_FILE=~/testdb.mv.db

echo "Starting H2 server..."
echo "Using H2 JAR at: $H2_JAR"

# Criar o arquivo do banco de dados, se não existir
touch $DB_FILE

# Iniciar o servidor H2 em segundo plano
java -cp $H2_JAR org.h2.tools.Server -web -tcp -tcpAllowOthers -tcpPort 9092 > /dev/null 2>&1 &

# Verificar se o servidor H2 foi iniciado
sleep 5
if netstat -tuln | grep 9092; then
    echo "H2 server started successfully."
else
    echo "Failed to start H2 server."
fi

