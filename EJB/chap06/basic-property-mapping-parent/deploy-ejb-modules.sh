#!/bin/bash

echo copying basic-property-mapping-ejb.jar to $JBOSS_HOME/server/default/deploy
cp basic-property-mapping-ejb/target/basic-property-mapping-ejb.jar $JBOSS_HOME/server/default/deploy
