#!/bin/bash

echo copying update-detached-ejb.jar to $JBOSS_HOME/server/default/deploy
cp update-detached-ejb/target/update-detached-ejb.jar $JBOSS_HOME/server/default/deploy
