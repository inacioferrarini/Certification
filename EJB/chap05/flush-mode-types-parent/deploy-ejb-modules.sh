#!/bin/bash

echo copying flush-mode-types-ejb.jar to $JBOSS_HOME/server/default/deploy
cp flush-mode-types-ejb/target/flush-mode-types-ejb.jar $JBOSS_HOME/server/default/deploy
