#!/bin/bash

echo copying multitable-mapping-ejb.jar to $JBOSS_HOME/server/default/deploy
cp multitable-mapping-ejb/target/multitable-mapping-ejb.jar $JBOSS_HOME/server/default/deploy
