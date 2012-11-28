#!/bin/bash

echo copying embeddable-class-mapping-ejb.jar to $JBOSS_HOME/server/default/deploy
cp embeddable-class-mapping-ejb/target/embeddable-class-mapping-ejb.jar $JBOSS_HOME/server/default/deploy
