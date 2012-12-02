#!/bin/bash

echo removing lazy-initialization-ejb.jar from $JBOSS_HOME/server/default/deploy
rm $JBOSS_HOME/server/default/deploy/lazy-initialization-ejb.jar
