#!/bin/bash

echo copying embedded-id-mapping-ejb.jar to $JBOSS_HOME/server/default/deploy
cp embedded-id-mapping-ejb/target/embedded-id-mapping-ejb.jar $JBOSS_HOME/server/default/deploy
