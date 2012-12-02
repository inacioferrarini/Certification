#!/bin/bash

echo copying lazy-initialization-ejb.jar to $JBOSS_HOME/server/default/deploy
cp lazy-initialization-ejb/target/lazy-initialization-ejb.jar $JBOSS_HOME/server/default/deploy
