FROM jboss/wildfly:14.0.0.Final

ADD /target/*.war /opt/jboss/wildfly/standalone/deployments/

USER 1001

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0"]
