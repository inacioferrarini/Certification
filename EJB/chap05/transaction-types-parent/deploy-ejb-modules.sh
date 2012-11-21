#!/bin/bash

echo copying update-detached-ejb.jar to $JBOSS_HOME/server/default/deploy
cp transaction-types-ejb/target/transaction-types-ejb.jar $JBOSS_HOME/server/default/deploy
