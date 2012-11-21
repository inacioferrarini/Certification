#!/bin/bash

echo removing transaction-types-ejb.jar from $JBOSS_HOME/server/default/deploy
rm $JBOSS_HOME/server/default/deploy/transaction-types-ejb.jar
