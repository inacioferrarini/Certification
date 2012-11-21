#!/bin/bash

echo removing update-detached-ejb.jar from $JBOSS_HOME/server/default/deploy
rm $JBOSS_HOME/server/default/deploy/update-detached-ejb.jar
