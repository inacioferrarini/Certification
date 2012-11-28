#!/bin/bash

echo copying id-class-mapping-ejb.jar to $JBOSS_HOME/server/default/deploy
cp id-class-mapping-ejb/target/id-class-mapping-ejb.jar $JBOSS_HOME/server/default/deploy
